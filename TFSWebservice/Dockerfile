FROM java:8
VOLUME /tmp
ADD target/TFSWebservice-0.0.1-SNAPSHOT.jar TFSWebservice.jar
RUN bash -c 'touch /TFSWebservice.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /TFSWebservice.jar","-Dspring.profiles.active=container"]
