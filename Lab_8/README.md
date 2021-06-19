# Bonus lab

## Task
+ Add getHeaders() and toCSV() methods to classes from lab 8
+ Create Writer class which has to have writeToFile() method aim of which is to write provided list of objects to CSV file
+ Write tests for writeToFile() method

## Project description
Project consist of 3 packages in ua.lviv.iot.saws package and App.java in the main folder, one ua.lviv.iot package in 
the test folder and pom.xml:
+ `ua.lviv.iot.models` package in the `main` folder contains all classes and enums from lab-8 with getHeaders() and 
  toCSV() methods. Also, there are additionally modified classes `Saw`(added field id, user field replaced with userId 
  field) and `Person`(added field id)
+ `ua.lviv.iot.manager` package in the `main` folder contains class `SawManager`(class to find saw in list of saws or 
  to sort list of saws) and enum `SortOrder` from lab-8
+ `ua.lviv.iot.writers` package in the `main` folder contains `SawWriter` and `PersonWriter` classes which have method 
  writeToFile() to write list of `Saw` and `Person` objects respectively to CSV file   
+ `App.java` is the file with test code for `SawManager` from lab 8
+ `ua.lviv.iot` package in the `test` folder contains `SawWriterTest` and `PersonWriterTest` classes with tests for 
  `SawWriter` and `PersonWriter` respectively
+ `pom.xml` which contains dependencies for Lombok, Apache Commons IO, JUnit Jupiter API, PMD, Checkstyle

## How to run
+ Clone this repository with command `git clone https://github.com/max-dmytryshyn/Java-Labs.git`
+ `cd` into a folder where you stored this repository
+ Choose branch bonus-lab with command `git checkout bonus-lab`
+ Run `mvn test` (you have to install maven on your system, if you haven't done so before; also you have 
  to choose 11 version of Java)
+ Tests have to be successful
