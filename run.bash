#!/bin/bash
set -e
./gradlew shadowJar
docker build -t atf-test .
docker-compose up