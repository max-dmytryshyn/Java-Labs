# Lab 9

## Task 
  + Create REST service and implement CRUD(GET/POST/PUT/DELETE) operations on object from 8-th lab
  + GET operation with id provided should return object with requested id, 
  + Get operation without id provided should return list of all objects
  + Code should be checked with checkstyle and pmd plugins
  + Code should be in a different pull request than lab8
  + Controller and RestApplication should be in a different packages
  + Objects should be stored in a `Map`

## Project description 
Project consist of 4 packages in ua.lviv.iot.saws package, App.java and pom.xml:
  + `models` package contains all classes and enums from lab-8 with modified class `Saw`(addded field id and constructor with all args except id
  + `manager` package contains class `SawManager`(class to find saw in list of saws or to sort list of saws) and enum `SortOrder` from lab-8
  + `services` package contains only one class `SawService` aim of which is to provide business logic for project data. (in this lab it is used to create hashmap of saws, to add, modify, get and delete saws from this hashmap and to automatically provide id's for saws. 
  + `controllers` package contains only one class `SawController` aim of which is to deal with GET/POST/PUT/DELETE requests with the help of `SawService`
  + `App.java` aim of which is to run spring boot site on the local host
  + `pom.xml` which contains dependencies for Lombok, Spring Web, Spring Data Jpa, H2 Database, JDBC API, PMD, Checkstyle

## How to run
  + Clone this repository with command `git clone https://github.com/max-dmytryshyn/Java-Labs.git`
  + `cd` into folder where you stored thus repository
  + Choose branch Lab_9 with command `git checkout Lab_9`
  + Run `mvn install` (you have to install maven on your system, if you haven't done so before; also you have to choose 11 version of Java)
  + Run `java -jar target/Lab_9-VERSION.jar`, where `VERSION` is version of the app (can be found in `pom.xml`, under `<version>` tag)
  + Open http://localhost:8080/swagger-ui.html in your browser
