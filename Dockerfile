FROM adoptopenjdk/openjdk12-openj9:alpine
VOLUME /tmp
ADD ./build/libs/*.jar app.jar
EXPOSE 7000
ENTRYPOINT ["java","-Djava.awt.headless=true","-Duser.timezone=America/Bogota","-jar","/app.jar"]