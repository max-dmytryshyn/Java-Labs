# Lab 10

## Task 
  + Rewrite `REST service` from lab 9 which implements CRUD(GET/POST/PUT/DELETE) operations on class Saw from 8-th lab
    to make it possible to connect to `MySQL DB and to perform CRUD operations in MySQL server.
  + `GET` operation with id provided via "/{id}" path should return object with requested id 
  + `GET` operation without id provided should return list of all objects
  + `POST` operation must be without id provided and should create Saw object row in DB and return JSON of created object
  + `PUT` operation must be with id provided via "/{id}" path and should update Saw object with provided id row in DB and return JSON of updated object
  + `DELETE` operation must be with id provided via "/{id}" path and should delete Saw object with provided id row in DB and return JSON of deleted object 
  + Code should be checked with checkstyle and pmd plugins
  + Code should be in a different pull requests than lab8 and lab9
  + Classes must be logically structured in packages
  + There must be Controller, Service classes and Repository interface
  + Connection to DB should be described in properties file

## Project description 
Project consist of 5 packages and App.java in ua.lviv.iot package, application.properties file  in resources folder and pom.xml:
  + `saws` package contains:
    + `models` package contains all classes and enums from lab-8 with modified class `Saw`(added field id and constructor with all args except id
    + `manager` package contains class `SawManager`(class to find saw in list of saws or to sort list of saws) and enum `SortOrder` from lab-8
  + `services` package contains only one class `SawService` aim of which is to provide business logic for project data. 
    (in this lab it is used to connect to DB with a table of saws, and to add, modify, get and delete saws from this DB. 
  + `controllers` package contains only one class `SawController` aim of which is to deal with GET/POST/PUT/DELETE requests with the help of `SawService`
  + `exceptions` package contains IdProvidedWhileUpdatingException and IdProvidedWhileCreationException RunTimeExceptions which are thrown in `SawService`
    and caught in `SawController`
  + `dal` package contains `SawRepository` interface which extends JpaRepository and which is used to perform operation directly with DB  
  + `App.java` is used to run spring boot site on the local host
  + `application.properties` contains properties to connect to local MySQL DB. This file should be changed in order to connect to your MySQL server
  + `pom.xml` contains dependencies for Lombok, Spring Web, Spring Data Jpa, MySQL connector, H2 Database, JDBC API, PMD, Checkstyle

##Requirements
  + `Maven` installed on your system
  + `JDK 11` installed and chosen as current JDK version on your system
  + `MySQL` installed on your system. Also, you should create DB.
  + `application.properties` fields which you have to change by yourself:
    + spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:{your port(usually3306)}/{Your Db name}
    + spring.datasource.username={Your username}
    + spring.datasource.password={Your password}

## How to run
  + Clone this repository with command `git clone https://github.com/max-dmytryshyn/Java-Labs.git`
  + `cd` into a folder where you stored thus repository
  + Choose branch Lab_9 with command `git checkout Lab_10`
  + Run `mvn install` 
  + Run `java -jar target/Lab_10-VERSION.jar`, where `VERSION` is version of the app (can be found in `pom.xml`, under `<version>` tag)
  + Open http://localhost:8080/swagger-ui.html in your browser or just send request to http://localhost:8080/saws via Postman or similar apps or terminal
