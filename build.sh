#!/bin/sh

yaml2json types --output types
jsonlint types/*.json --quiet
yaml2json Payment-Integration-Api.swagger.yml > Payment-Integration-Api.swagger.json
swagger-tools validate Payment-Integration-Api.swagger.json
