# 2bPrecise task BE application


## Running the application
Open terminal in the project folder.<br />
Run command: ./mvnw spring-boot:run<br />
<br />
The server will start on port 8080.<br />
Port configuration can be found in the application.yml file.<br />
<br />

## DB configuration:
The project uses in memory DB (H2) which get populated at startup with data.<br />
The data being used can be found in src/main/resources data.sql.<br />
<br />
It is possible to inspect the content of the DB in: http://localhost:8080/h2-console with the following:<br />
url: jdbc:h2:mem:mydb<br />
user: root<br />
password: root<br />
Those configuration can be found in the application.yml<br />




