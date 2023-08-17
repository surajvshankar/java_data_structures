# java_data_structures
Java: Data Structures (LinkedIn Learning)

## To add Maven support (to an empty project)
1. Add a pom.xml file to the Project root, with the following content

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.surshank</groupId>
  <artifactId>java_data_structures</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>java_data_structures</name>
  <description>java_data_structures</description>
  <properties>
    <java.version>17</java.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.9.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.platform</groupId>
      <artifactId>junit-platform-runner</artifactId>
      <version>1.10.0</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-params</artifactId>
      <version>5.9.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
```

2. Then, Right click the pom.xml file and Select "+ Add as Maven Project"

## To run tests from command-line
mvn test
