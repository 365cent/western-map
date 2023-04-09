# Campus Map Application
## Description
This software is a map viewer for western university. It allows you to add and find points of interest in Middlesex College, Western Science Center, and the Physics and Astronomy building.
## Dependencies and 3rd party software
1. the iknoli remixicon pack version 12.3.1
2. iknoli-swing version 12.3.1 (the order of this and the last item in the pom.xml file is important)
3. gson version 2.10
4. guava version 18.0
5. The AbsoluteLayout from netbeans.external Release160
6. The junit-platform version 1.1.0
7. junit-jupiter version 5.6.0
8. mockito version 4.1.0
9. The maven-jar-plugin version 2.4
10. The maven-shade-plugin version 2.2
11. The maven-surefire-plugin version 2.19.1
## How to build
1. Clone/Download the project into NetBeans
2. Open the project
3. Click the clean and build project option from the menu (this will obtain any dependencies automatically)
4. The resulting jar executable will be in the project folder under target with the name group22-1.0-SNAPSHOT.jar
## How to run
1. Locate the executable compiled in the last step or go to group22/target if already compiled
2. If java is configured correctly you should be able to just double click the jar file
3. Otherwise, run java -jar /path/to/jar

## User guide
Logging in: you can use any of the users given below or sign up a new account. Alternatively, you login as guest by clicking signup and then continue as guest.
Once you're logged in you can add POIs by clicking the edit button in the bottom right corner and then circle button that shows up. Clicking on a room will then add a POI to that room
If you wish to add information to the POI click on the room and then select the POI. Use the edit and save buttons to alter the information in the POI and then save it.
you can switch floors using the up and down arrows on the left and switch buildings using the top menu.

## Account information/Edit mode
The edit mode is accessed through the admin user which has the username "admin" and the password "password". There is one user for each group member with usernames Liam, Karen, Maxwell, Emma, Valentina and the password for each of those users is "1234"

## Screenshots
### Login Window
![Login Window](https://res.cloudinary.com/alt/image/upload/v1679891964/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.36.05_oyxu6w.png)

### Login Window (On Focus)
![Login Window (On Focus)](https://res.cloudinary.com/alt/image/upload/v1679892152/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.41.52_mqa1hw.png)

### Login Window (Strong Password Indicator)
![Login Window (Strong Password Indicator)](https://res.cloudinary.com/alt/image/upload/v1679892153/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.42.18_a5p8hh.png)

### Login Window (Sign Up)
![Login Window (Sign Up)](https://res.cloudinary.com/alt/image/upload/v1681072145/assets/Capture_d_e%CC%81cran_le_2023-04-09_a%CC%80_16.28.33_vrsvoi.png)

### Login Window (Error)
![Login Window (Error)](https://res.cloudinary.com/alt/image/upload/v1679891963/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.36.45_yxafqu.png)

### Login Window (Success)
![Login Window (Success)](https://res.cloudinary.com/alt/image/upload/v1679891964/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.37.02_ydk4qk.png)

### Weather API
![Weather API](https://res.cloudinary.com/alt/image/upload/v1680808516/assets/Capture_d_e%CC%81cran_le_2023-04-06_a%CC%80_15.14.17_ptbb7h.png)

### Weather API (No Network)
![Weather API (No Network)](https://res.cloudinary.com/alt/image/upload/v1680808747/assets/Capture_d_e%CC%81cran_le_2023-04-06_a%CC%80_15.17.46_spw1qm.png)

### Weather API (No Network) (No Cache)
![Weather API (No Network) (No Cache)](https://res.cloudinary.com/alt/image/upload/v1680809006/assets/Capture_d_e%CC%81cran_le_2023-04-06_a%CC%80_15.23.05_qebe2m.png)

### Main Window
![Main Window](https://res.cloudinary.com/alt/image/upload/v1679891964/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.37.11_eouehn.png)

### Main Window (Search POIs)
![Main Window (Search POIs)](https://res.cloudinary.com/alt/image/upload/v1679891964/assets/Capture_d_e%CC%81cran_le_2023-03-27_a%CC%80_00.37.22_nsmmsd.png)

### Switching Buildings
![Switching Buildings](https://res.cloudinary.com/alt/image/upload/v1681072289/assets/Capture_d_e%CC%81cran_le_2023-04-09_a%CC%80_16.31.20_ul8lcm.png)

### Switching floors
![Switching floors](https://res.cloudinary.com/alt/image/upload/v1681072376/assets/Capture_d_e%CC%81cran_le_2023-04-09_a%CC%80_16.32.48_nwkhxw.png)

(Hosted on Cloudinary)