## Description

A demo use grpc and bazel

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `BUILD`: bazel build file

## Prerequisites

- java installation

- bazel installation

- proto compiler installation

## build command

- compile proto file

> protoc --java_out=src/com/demo src/proto/helloword.proto

- build client executable

> bazel build //:guice_one

- build client executable


## run command

> bazel-bin/guice_one
