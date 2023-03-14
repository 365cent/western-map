/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.western;

import com.google.gson.JsonObject;
import org.kordamp.ikonli.remixicon.RemixiconAL;
import org.kordamp.ikonli.remixicon.RemixiconMZ;
import org.kordamp.ikonli.swing.FontIcon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import static java.security.MessageDigest.getInstance;
import com.google.common.io.BaseEncoding;


/**
 * @author m
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        initLoginPanel();
        prepareIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerPanel = new javax.swing.JLayeredPane();
        bgPanel = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();
        loginLayer = new javax.swing.JLayeredPane();
        loginPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        honeyPot = new javax.swing.JTextField();
        userText = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        passwordText = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        submitPanel = new javax.swing.JPanel();
        onLogin = new javax.swing.JButton();
        condition = new javax.swing.JLabel();
        guestLogin = new javax.swing.JButton();
        mask = new javax.swing.JPanel();
        maskBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layerPanel.setPreferredSize(new java.awt.Dimension(600, 400));

        bgPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        bgPanel.setLayout(new java.awt.BorderLayout());

        bg.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/org/western/assets/bg.jpg")).getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH)));
        bgPanel.add(bg, java.awt.BorderLayout.CENTER);

        loginLayer.setPreferredSize(new java.awt.Dimension(300, 400));
        loginLayer.setLayout(new javax.swing.OverlayLayout(loginLayer));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setOpaque(false);
        loginPanel.setPreferredSize(new java.awt.Dimension(300, 400));

        logoPanel.setOpaque(false);
        logoPanel.setLayout(new java.awt.BorderLayout());

        logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        logo.setAlignmentX(0.5F);
        logo.setPreferredSize(new java.awt.Dimension(260, 80));
        logoPanel.add(logo, java.awt.BorderLayout.CENTER);

        loginPanel.add(logoPanel);

        title.setFont(new java.awt.Font("New York", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(78, 38, 131));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Campus Map Viewer");
        title.setPreferredSize(new java.awt.Dimension(300, 40));
        loginPanel.add(title);

        formPanel.setOpaque(false);
        formPanel.setPreferredSize(new java.awt.Dimension(300, 140));

        honeyPot.setBackground(new Color(0, 0, 0, 0));
        honeyPot.setForeground(new Color(0, 0, 0, 200));
        honeyPot.setBorder(null);
        honeyPot.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        honeyPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                honeyPotActionPerformed(evt);
            }
        });
        formPanel.add(honeyPot);

        userText.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(17, 51, 85));
        userText.setText("Username");
        userText.setToolTipText("");
        userText.setPreferredSize(new java.awt.Dimension(260, 20));
        formPanel.add(userText);

        user.setColumns(22);
        user.setText("Enter your username");
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        formPanel.add(user);

        passwordText.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(17, 51, 85));
        passwordText.setText("Password");
        passwordText.setPreferredSize(new java.awt.Dimension(260, 20));
        formPanel.add(passwordText);

        passwd.setColumns(22);
        passwd.setText("password");
        passwd.setBorder(null);
        passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdActionPerformed(evt);
            }
        });
        formPanel.add(passwd);

        loginPanel.add(formPanel);

        submitPanel.setOpaque(false);
        submitPanel.setPreferredSize(new java.awt.Dimension(280, 40));
        submitPanel.setLayout(new java.awt.GridBagLayout());

        onLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        onLogin.setText("Login");
        onLogin.setBorder(null);
        onLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoginActionPerformed(evt);
            }
        });
        submitPanel.add(onLogin, new java.awt.GridBagConstraints());

        condition.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        condition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        condition.setText("or");
        condition.setPreferredSize(new java.awt.Dimension(72, 20));
        submitPanel.add(condition, new java.awt.GridBagConstraints());

        guestLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        guestLogin.setText("Continue as guest");
        guestLogin.setBorder(null);
        guestLogin.setIgnoreRepaint(true);
        guestLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestLoginActionPerformed(evt);
            }
        });
        submitPanel.add(guestLogin, new java.awt.GridBagConstraints());

        loginPanel.add(submitPanel);

        loginLayer.setLayer(loginPanel, javax.swing.JLayeredPane.POPUP_LAYER);
        loginLayer.add(loginPanel);

        mask.setOpaque(false);
        mask.setLayout(new java.awt.BorderLayout());

        maskBg.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/org/western/assets/masked_bg.png")).getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
        maskBg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        maskBg.setMaximumSize(new java.awt.Dimension(300, 400));
        maskBg.setMinimumSize(new java.awt.Dimension(300, 400));
        maskBg.setPreferredSize(new java.awt.Dimension(300, 400));
        mask.add(maskBg, java.awt.BorderLayout.CENTER);

        loginLayer.add(mask);

        layerPanel.setLayer(bgPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerPanel.setLayer(loginLayer, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout layerPanelLayout = new javax.swing.GroupLayout(layerPanel);
        layerPanel.setLayout(layerPanelLayout);
        layerPanelLayout.setHorizontalGroup(
                layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                        .addGroup(layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerPanelLayout.createSequentialGroup()
                                        .addGap(0, 300, Short.MAX_VALUE)
                                        .addComponent(loginLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layerPanelLayout.setVerticalGroup(
                layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addGroup(layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(layerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(layerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwdActionPerformed

    private void onLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLoginActionPerformed
        handleLogin(user.getText(), new String(passwd.getPassword()));
    }//GEN-LAST:event_onLoginActionPerformed

    private void guestLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestLoginActionPerformed

    private void honeyPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_honeyPotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_honeyPotActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void initLoginPanel() {
        int padding = 10;
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        Border defaultBorder = BorderFactory.createLineBorder(Color.decode("#eaeaea")), // create default line border
                focusBorder = BorderFactory.createLineBorder(Color.decode("#666666")), // create focused line border
                underlineBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#2470cc")), // create underline border
                underlineFocusBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#666666")); // create underline focused border
        this.setLocation(center.x - this.getWidth() / 2, center.y - this.getHeight() / 2);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        onLogin.setBackground(Color.decode("#4e2683")); // set background color of onLogin button
        onLogin.setForeground(Color.WHITE); // set text color of onLogin button
        onLogin.setBorder(BorderFactory.createEmptyBorder()); // remove border of onLogin button
        onLogin.setContentAreaFilled(false); // remove background of onLogin button
        onLogin.setOpaque(true); // make onLogin button opaque
        onLogin.setCursor(new Cursor(Cursor.HAND_CURSOR)); // set cursor to hand cursor
        guestLogin.setForeground(Color.decode("#2470cc")); // set text color of guestLogin button
        guestLogin.setBorder(BorderFactory.createEmptyBorder()); // remove border of guestLogin button
        guestLogin.setContentAreaFilled(false); // remove background of guestLogin button
        guestLogin.setOpaque(false); // make guestLogin button opaque
        user.setForeground(Color.decode("#666666"));
        user.setBorder(
                BorderFactory.createCompoundBorder(
                        defaultBorder, BorderFactory.createEmptyBorder(padding, padding, padding, padding)
                )
        );
        passwd.setBorder(
                BorderFactory.createCompoundBorder(
                        defaultBorder, BorderFactory.createEmptyBorder(padding, padding, padding, padding)
                )
        );
        onLogin.setBorder(
                BorderFactory.createCompoundBorder(
                        defaultBorder, BorderFactory.createEmptyBorder(padding, 2 * padding, padding, 2 * padding)
                )
        );
        guestLogin.setBorder(underlineBorder);

        // add hover effect to onSearch button
        onLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // change background color gradually
                onLogin.setBackground(Color.decode("#7b5da2"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                onLogin.setBackground(Color.decode("#4e2683"));
            }
        });
        user.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                user.setForeground(Color.decode("#000000"));
                user.setBorder(
                        BorderFactory.createCompoundBorder(
                                focusBorder, BorderFactory.createEmptyBorder(padding, padding, padding, padding)
                        )
                );
                if (user.getText().equals("Enter your username")) {
                    user.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                user.setForeground(Color.decode("#666666"));
                user.setBorder(
                        BorderFactory.createCompoundBorder(
                                defaultBorder, BorderFactory.createEmptyBorder(padding, padding, padding, padding)
                        )
                );
                if (user.getText().equals("")) {
                    user.setText("Enter your username");
                }
            }
        });
        passwd.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                passwd.setForeground(Color.decode("#000000"));
                passwd.setBorder(
                        BorderFactory.createCompoundBorder(
                                focusBorder, BorderFactory.createEmptyBorder(padding, padding, padding, padding)
                        )
                );
                if (new String(passwd.getPassword()).equals("password")) {
                    passwd.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String username = "", password = "";
                passwd.setForeground(Color.decode("#666666"));
                passwd.setBorder(
                        BorderFactory.createCompoundBorder(
                                defaultBorder, BorderFactory.createEmptyBorder(padding, padding, padding, padding)
                        )
                );
                password = new String(passwd.getPassword());
                if (password.equals("")) {
                    passwd.setText("password");

                }
                // check password strength
                if (password.length() > 10 && password.matches("^(?=.*[A-Za-z])(?=.*\\d).+$")) {
                    FontIcon passwordIcon = (FontIcon) passwordText.getIcon();
                    passwordIcon.setIconColor(Color.decode("#30d158"));
                    passwordText.setIcon(passwordIcon);
                    passwordText.setForeground(Color.decode("#30d158"));
                } else {
                    FontIcon passwordIcon = (FontIcon) passwordText.getIcon();
                    passwordIcon.setIconColor(Color.decode("#666666"));
                    passwordText.setIcon(passwordIcon);
                    passwordText.setForeground(Color.decode("#666666"));
                }
            }
        });
        // add underline effect to guestLogin button
        guestLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                guestLogin.setForeground(Color.decode("#666666"));
                guestLogin.setBorder(underlineFocusBorder);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                guestLogin.setForeground(Color.decode("#2470cc"));
                guestLogin.setBorder(underlineBorder);
            }
        });
    }

    private void prepareIcon() {
        ImageIcon l = new ImageIcon(Objects.requireNonNull(getClass().getResource("/org/western/assets/logo.png")));
        FontIcon u = FontIcon.of(RemixiconMZ.USER_3_LINE, 20, Color.decode("#113355")),
                p = FontIcon.of(RemixiconAL.LOCK_PASSWORD_LINE, 20, Color.decode("#113355"));
        l = new ImageIcon(l.getImage().getScaledInstance(260, 260 * l.getIconHeight() / l.getIconWidth(), Image.SCALE_SMOOTH));
        logo.setIcon(l);
        userText.setIcon(u);
        passwordText.setIcon(p);
    }
    private int handleLogin(String username, String password) {
        byte[] b; // byte array of password
        String h; // hash of password
        JsonObject user;
        JDialog prompt = new JDialog(); // pop up dialog
        prompt.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        prompt.setModal(true);
        prompt.setSize(300, 200);
        prompt.setLocationRelativeTo(null);
        prompt.setLayout(new BorderLayout());
        if(!honeyPot.getText().isEmpty() || username.isEmpty() || password.isEmpty()) {
            return -1;
        }
        user = new JsonDB("user", username).getData();
        if(user.get("status") != null && user.get("status").getAsInt() != 200) {
            // pop up error message
            prompt.setTitle("Error");
            prompt.add(new JLabel("Username or password does not match"), BorderLayout.CENTER);
            prompt.setVisible(true);
            return -2;
        }
        b = password.getBytes(StandardCharsets.UTF_8);
        try {
            b = getInstance("MD5").digest(b);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        // https://stackoverflow.com/questions/9655181/how-to-convert-a-byte-array-to-a-hex-string-in-java
        h = BaseEncoding.base16().lowerCase().encode(b);
        if(user.get("password").getAsString().equals(h)) { // check hash password
            prompt.setTitle("Success");
            prompt.add(new JLabel("Login successful"), BorderLayout.CENTER);
            prompt.setVisible(true);
            // check if user is admin
            if(user.get("roleName").getAsString().equals("admin")) {
                return 0;
            }
            return 1;
        } else {
            // pop up error message
            prompt.setTitle("Error");
            prompt.add(new JLabel("Username or password does not match"), BorderLayout.CENTER);
            prompt.setVisible(true);
            return -2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel condition;
    private javax.swing.JPanel formPanel;
    private javax.swing.JButton guestLogin;
    private javax.swing.JTextField honeyPot;
    private javax.swing.JLayeredPane layerPanel;
    private javax.swing.JLayeredPane loginLayer;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mask;
    private javax.swing.JLabel maskBg;
    private javax.swing.JButton onLogin;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JLabel passwordText;
    private javax.swing.JPanel submitPanel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField user;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
