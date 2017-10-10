#!/bin/sh

yaml2json types --pretty --save
jsonlint types/*.json --quiet
