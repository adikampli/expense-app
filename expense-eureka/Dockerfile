FROM openjdk:8-jre-alpine
MAINTAINER Adi

ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

ADD ./start.sh /usr/local/bin/start.sh
RUN chmod +x /usr/local/bin/start.sh

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/usr/share/expense/expense-eureka.jar"]

ADD target/expense-eureka-0.0.1-SNAPSHOT.jar /usr/share/expense/expense-eureka.jar