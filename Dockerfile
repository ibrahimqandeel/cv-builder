FROM ibm-semeru-runtimes:open-17-jre
EXPOSE 8080
ADD target/cv-builder.jar cv-builder
ENTRYPOINT ["java","-jar","/cv-builder"]