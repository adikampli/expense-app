#!/bin/sh
java -jar -Dspring.profiles.active=docker /usr/share/expense/expense-zuul.jar
