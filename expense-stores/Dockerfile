FROM openjdk:8
MAINTAINER Adi

WORKDIR /usr/share/expense

ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

ADD ./start.sh start.sh
RUN chmod +x start.sh

CMD ["./start.sh"]

ADD target/expense-store-0.0.1-SNAPSHOT.jar expense-store.jar