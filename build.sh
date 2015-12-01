#!/bin/sh

# requires node to be installed.
# initial install:
# npm install yaml-to-json -g
# npm install -g swagger-tools

yaml2json types --output types
yaml2json Payment-Integration-Api.swagger.yml > Payment-Integration-Api.swagger.json
swagger-tools validate Payment-Integration-Api.swagger.json
