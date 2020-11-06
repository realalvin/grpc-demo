FROM centos
RUN yum install -y \
         java-1.8.0-openjdk \
         java-1.8.0-openjdk-devel
RUN yum install -y  unzip

ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk/

VOLUME /tmp
COPY ./target/*.jar  /user/src/
WORKDIR /user/src/

EXPOSE 8080 6565 27017
ENTRYPOINT ["java" ,"-jar", "log-service.jar"]