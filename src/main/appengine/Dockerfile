FROM gcr.io/google_appengine/openjdk8
VOLUME /tmp
ADD helloworldservice-1.0-SNAPSHOT.jar helloworld.jar
ENTRYPOINT [ "java","-jar","/helloworld.jar","server","helloworld.yaml"]