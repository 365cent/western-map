/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.western;

import javax.swing.*;
import java.awt.*;
import com.google.gson.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import java.util.LinkedList;

/**
 *
 * @author Liam
 */
//adapted from http://www.java2s.com/Tutorials/Java/Swing/JButton/Polygon_shaped_Button_in_Java.htm
public class Room extends JComponent
{
    
    private static Color DEFAULT_COLOR = new Color(200,200,200,50); //transparent grey
    private static Color DEFAULT_ACTIVE_COLOR = new Color(102, 178, 255, 50);//light blue with transparency
    
    private int id;
    private Building building;
    private Floor floor;
    private Layer layer;
    
    //private Polygon curShape;
    //private Rectangle curBounds;
    
    private Color curColor;
    private Color curActiveColor;
    private boolean active = false;
    //public LinkedList<POI> POIs;
    private POIListPopup ListPopup;
    
    private static HashMap<Integer, Room> loadedRooms = new HashMap<Integer, Room>();
    
    public Room(Building building, Floor floor, Polygon shape)
    {
        
        //add room in unassigned layer
        this(building, floor, floor.getLayer("Unassigned"), shape, new Point(0,0));
               
    }
    
    public Room(Building building, Floor floor, Polygon shape, Point position)
    {
        
        //add room in unassigned layer
        this(building, floor, floor.getLayer("Unassigned"), shape, position);
               
    }
    
    public Room(Building building, Floor floor, Layer layer, Polygon shape, Point position)
    {
        
        this.building = building;
        this.floor = floor;
        this.layer = layer;
        this.id = JsonDB.addRoom(building, floor, layer, shape, position).get("id").getAsInt();
        curColor = DEFAULT_COLOR;
        curActiveColor = DEFAULT_ACTIVE_COLOR;
        loadedRooms.put(id, this);
        
    }
    
    private Room(JsonObject building, JsonObject floor, JsonObject layer, JsonObject room) {
        this.building = Building.getBuilding(building);
        this.floor = Floor.getFloor(building, floor);
        this.layer = Layer.getLayer(building, floor, layer);
        this.id = room.get("id").getAsInt();
        loadedRooms.put(id, this);
    }
    
    public static Room getRoom(JsonObject building, JsonObject floor, JsonObject layer, JsonObject room) {
        int roomID = room.get("id").getAsInt();
        if (loadedRooms.containsKey(roomID))
            return loadedRooms.get(roomID);
        
        return new Room(building, floor, layer, room);
        
    }
    
    public void free() {
        loadedRooms.remove(id);
    }
    
    private JsonObject getThis() {
        return JsonDB.getRoom(building, floor, layer, id);
    }
    
    public int getID() {
        return id;
    }
    public int getPOINum() {
        return getThis().get("count").getAsInt();
    }
    public Point getSavedLocation() {
        return new Point(getThis().get("x").getAsInt(), getThis().get("y").getAsInt());
    }
    
    /*public Point getStartingLocation() {
        return new Point(getThis().get("x").getAsInt(), getThis().get("y").getAsInt());
    }*/
    
    public Polygon getShape() {
        
        //if (curShape == null)
        {
            int npoints = getThis().get("npoints").getAsInt();

            int[] xpoints = new int[npoints];
            JsonArray jsonxpoints = getThis().get("xpoints").getAsJsonArray();
            for (int i = 0; i < npoints; ++i) 
                xpoints[i] = jsonxpoints.get(i).getAsInt();

            int[] ypoints = new int[npoints];
            JsonArray jsonypoints = getThis().get("ypoints").getAsJsonArray();
            for (int i = 0; i < npoints; ++i) 
                ypoints[i] = jsonypoints.get(i).getAsInt();

            //curShape = new Polygon(xpoints, ypoints, npoints);
            return new Polygon(xpoints, ypoints, npoints);
        }
        //else return curShape;
        
    }
    
    public void setShape(Polygon shape) {
        
        getThis().addProperty("npoints", shape.npoints);
        JsonArray xpoints = new JsonArray(shape.npoints);
        JsonArray ypoints = new JsonArray(shape.npoints);
        
        for (int x : shape.xpoints) xpoints.add(x);
        for (int y : shape.ypoints) ypoints.add(y);
        getThis().add("xpoints", xpoints);
        getThis().add("ypoints", ypoints);
        JsonDB.save();
        
    }
    
    public void addPoint(int x, int y) {
        Polygon shape = getShape();
        shape.addPoint(x, y);
        setShape(shape);
    }
    
    public Rectangle getBounds() {
        return getShape().getBounds();
    }
    
    public LinkedList<POI> getPOIs() {
        
        JsonArray POIs = JsonDB.getPOIs(building, floor, layer, this);
        LinkedList<POI> out = new LinkedList<POI>();
        
        for (JsonElement poi:POIs) 
            out.add(POI.getPOI(JsonDB.getBuilding(building.getID()),
                    JsonDB.getFloor(building, floor.getID()),
                    JsonDB.getLayer(building, floor, id),
                    getThis(),
                    poi.getAsJsonObject()
            ));
        
        return out;
        
    }
    
    public POI getPOI(int id) {
        
        for (POI poi: getPOIs()) {
            if (poi.getID() == id) return poi;
        }
        return null;
    }
    
    public POI addPOI(String name, String description, Point position) {
        return new POI(building, floor, layer, this , name, description, position);
    }
    
    /*public Room(Polygon shape, Building building, Floor floor) 
    {
        
        this.shape = shape;
        this.building = building;
        this.floor = floor;
        setOpaque(false);
        POIs = new LinkedList<POI>();
        
        
        //get the bounding rectangle of the polygon
        bounds = this.shape.getBounds();
        setBounds(bounds);
        //
        
        //set colors
        color = new Color(200,200,200,50);//transparent
        activeColor = new Color(102, 178, 255, 50);//light blue with transparency
        //
        
        //add mock POI to list
        //POIs.add(new POI(1, "test_name", "sample_description", null, "1", null));
        //
        
    }*/
    
    public void translate (int x, int y) {
        setLocation(getX()+x, getY()+y); //set location in scene
        if (ListPopup != null) ListPopup.translate(x, y);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        
        if (!active) g2D.setColor(curColor);
        else g2D.setColor(curActiveColor);
        g2D.fillPolygon(getShape());
        
        //System.out.println(this.getX() + ", " + this.getY());
        
        //g2D.setColor(Color.BLACK);
        //g2D.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        
    }
    
    public void mouseMoved(MouseEvent e) {
        //check if the mouse is even in the bounding box
        if (!getBounds().contains(e.getX()-getX(), e.getY()-getY())) {
            if (active) {
               active = false;
               repaint();
            }
        return;
        }
        //

        //check if the mouse is within the polygon
        boolean contained = getShape().contains(e.getX()-getX(), e.getY()-getY());

        //switch whether the button is hovered over accordingly
        if (contained && !active){
            active = true;
            repaint();
        }
        else if (!contained && active) {
            active = false;
            repaint();
        }
        //

        //main.dispatchEvent(e);

    }

    public void mouseDragged(MouseEvent e) {
        //main.dispatchEvent(e);
    }

    public void mousePressed(MouseEvent e) {
        //if active...
        //main.dispatchEvent(e);
        
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        mouseMoved(e); //covers edge cases where the mouse enters the bounds and the polygon
    }

    public void mouseExited(MouseEvent e) {
        if (active){
            active = false;
            repaint();
        } //covers edge cases where the mouse exits the bounds and the polygon
    }

    public void addPOI(POI poi) {
        
        
        
    }
    
    /*public Building getBuilding() {
        
    }*/
    
    //reimplement when pois implemented
    public void mouseClicked(MouseEvent e, JLayeredPane layerPanel) {

        if (active && ListPopup == null) {
          
            ListPopup = new POIListPopup(this, getPOIs());
            layerPanel.add(ListPopup, JLayeredPane.POPUP_LAYER);
            ListPopup.setSize(ListPopup.getPreferredSize());
            ListPopup.setLocation(e.getPoint());
            
        }
        
    }
    
    public void deletePopup() {
        ListPopup = null;
    }
    
}