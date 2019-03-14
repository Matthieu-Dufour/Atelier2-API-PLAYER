FROM java:8
COPY target/pl-0.0.1-SNAPSHOT.jar apiplayer.jar
EXPOSE 8080
CMD ["java", "-jar", "apiplayer.jar"]