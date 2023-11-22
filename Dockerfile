FROM openjdk:17
EXPOSE 8080
LABEL authors="lfonkouo"
ADD target/springboot-ci-cd.jar springboot-ci-cd.jar
ENTRYPOINT ["java", "-jar", "/springboot-ci-cd.jar"]