FROM openjdk:17-oracle
COPY ./target/BookServices-0.0.1-SNAPSHOT.jar BookServices.jar
CMD ["java","-jar","BookServices.jar"]