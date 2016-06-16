#!/bin/bash
set -e

docker-compose stop
docker-compose rm --all -f

./gradlew clean assemble
docker build -t atf-test .
docker-compose up