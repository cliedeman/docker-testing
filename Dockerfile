FROM java:8
COPY build/jar /usr/app
WORKDIR /usr/app
RUN javac Main.java
CMD ["java", "Main"]