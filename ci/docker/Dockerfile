FROM gradle:jdk11-openj9 as backend-compiler
LABEL mantainer="edwin.casav@gmail.com"
WORKDIR /app
COPY . .

ARG SEPS_MAVEN_USER_ARG
ARG SEPS_MAVEN_PASSWORD_ARG

ENV SEPS_MAVEN_USER=$SEPS_MAVEN_USER_ARG
ENV SEPS_MAVEN_PASSWORD=$SEPS_MAVEN_PASSWORD_ARG

RUN gradle build --refresh-dependencies || return 0

FROM openjdk:8-alpine

ARG ARG_VERSION
ENV VERSION=$ARG_VERSION

RUN apk add tzdata
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=backend-compiler /app/root-service/build/libs/root-service-$VERSION.jar /app/opt/service.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/app/opt/service.jar"]
