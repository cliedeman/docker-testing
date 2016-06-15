#!/bin/sh
set -e
unzip ${JAR} > /dev/null
rm ${JAR} > /dev/null
java -classpath ${PWD}:${PWD}/lib/* "$@"