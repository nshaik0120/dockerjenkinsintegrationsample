FROM openjdk:17
LABEL maintainer="spring boot docker jenkins"
ADD target/dockerjenkinsintegrationsample-0.0.1.jar dockerjenkinsintegrationsample-0.0.1.jar
ENTRYPOINT ["java","-jar","/dockerjenkinsintegrationsample-0.0.1.jar"]