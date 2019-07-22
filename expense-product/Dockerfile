FROM openjdk:8-jre-alpine
MAINTAINER Adi

ENTRYPOINT ["/usr/bin/java", "-jar",  "-Dspring.profiles.active=docker", "/usr/share/expense/expense-product.jar"]

ADD target/expense-product-0.0.1-SNAPSHOT.jar /usr/share/expense/expense-product.jar