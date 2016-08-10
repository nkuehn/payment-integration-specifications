#!/bin/sh

# installs required dependencies to run tests
# requires node to be installed.
npm uninstall yaml-to-json -g
npm install yamljs -g
npm install swagger-tools -g
npm install jsonlint -g
