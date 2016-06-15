#
# docker build -t atf-test .
#
FROM java:8

ENV JAR atf-all.jar

ADD build/libs/$JAR /usr/app/
ADD entrypoint.sh /usr/app/

WORKDIR /usr/app
RUN chmod +x ./entrypoint.sh

ENTRYPOINT ["/usr/app/entrypoint.sh"]
CMD ["ciaran.liedeman.server.ServerController"]