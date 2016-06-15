#!/bin/bash
set -e
./gradlew clean assemble
docker build -t atf-test .
docker-compose up