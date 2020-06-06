#https://qiita.com/qphsmt/items/10520fa92c06df022ef7
FROM openjdk:14
VOLUME /tmp
RUN mkdir /work
COPY . /work
WORKDIR /work
RUN /work/gradlew build
RUN mv /work/build/libs/*.jar /work/app.jar
ENTRYPOINT ["java","-jar","/work/app.jar"]