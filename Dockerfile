FROM openjdk:11
EXPOSE 8080
ADD target/belajar-springboot.jar belajar-springboot.jar
ENTRYPOINT ["java", "-jar","/belajar-springboot.jar"]