#base image, img is available in docker hub
FROM openjdk:17.0.1
#make port 8080 available outside the container
EXPOSE 8080
#specify path of jar
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar", "/spring-boot-docker.jar"]
# Run 'mvn install' it will create jar file.