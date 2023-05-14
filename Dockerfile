FROM openjdk:17

ADD target/spring-boot-github-cicd-action-docker-learn-this-is-docker-repo.jar spring-boot-github-cicd-action-docker-learn-this-is-docker-repo.jar
ENTRYPOINT ["java","-jar","spring-boot-github-cicd-action-docker-learn-this-is-docker-repo.jar"]