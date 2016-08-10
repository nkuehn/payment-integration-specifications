#!/bin/sh

yaml2json types --pretty --save
jsonlint types/*.json --quiet
yaml2json Payment-Integration-Api.swagger.yml > Payment-Integration-Api.swagger.json --pretty
swagger-tools validate Payment-Integration-Api.swagger.json
