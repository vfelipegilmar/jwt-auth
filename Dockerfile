FROM openjdk:8
EXPOSE 8080
ADD target/stein##0.0.1-SNAPSHOT.jar stein0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/stein0.0.1-SNAPSHOT.jar"]