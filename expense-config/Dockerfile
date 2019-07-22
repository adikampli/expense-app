FROM openjdk:8-jre-alpine
MAINTAINER Adi

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/expense/expense-config.jar"]

ADD target/expense-config-0.0.1-SNAPSHOT.jar /usr/share/expense/expense-config.jar