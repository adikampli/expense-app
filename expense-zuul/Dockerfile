FROM openjdk:8-jre-alpine
MAINTAINER Adi

ENTRYPOINT ["/usr/bin/java", "-jar", "-Dspring.profiles.active=docker", "/usr/share/expense/expense-zuul.jar"]

ADD target/expense-zuul-0.0.1-SNAPSHOT.jar /usr/share/expense/expense-zuul.jar