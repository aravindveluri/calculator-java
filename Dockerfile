FROM openjdk:8
RUN ls
COPY ./target/CalculatorMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"] 