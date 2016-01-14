# Walmart product search app

Following are the prerequisites for executing the app.
  - JDK 1.6 or higher
  - Apache Maven (I used 3.2.3 should work with lower versions as well)

# Compile
```sh
mvn clean compile
```
# Executing the server
```sh
mvn jetty:run
```
# Access the app from browser
Go to following URL
```
http://localhost:8080/wmt-hw-app
```
# Assumptions
- Developed the app totally in java with embedded jetty so this can be run witout a web server configuration
- This app could have been developed as a UI app using a JS library, however I though I should demonstrate more of my java skills than UI skills. Also I am not a very good UI developer.