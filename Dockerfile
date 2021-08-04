FROM openjdk:11
EXPOSE 8080
ADD target/TankSpringMongo.jar TankSpringMongo.jar
ENTRYPOINT ["java", "-jar", "/TankSpringMongo.jar"]