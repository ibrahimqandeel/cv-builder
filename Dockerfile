FROM ibm-semeru-runtimes:open-17-jre
EXPOSE 8080
ADD target/cv-builder.jar cv-builder.jar
ENTRYPOINT ["java","-jar","/cv-builder.jar"]