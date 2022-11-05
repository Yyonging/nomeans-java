## Description

A rpc demo use thrift and bazel

## Folder Structure

The workspace contains two folders by default, where:

- `gen-java`: code that thrift genrate
- `src`: the folder to maintain sources
- `BUILD`: bazel build file

## Prerequisites

- thrift installation

- java installation

- bazel installation

## build command

- thrift generate code

> thrift -r -gen java src/thrift/Hello.thrift

- build all

> bazel build //...

## run command

- make sure the 8080 port is available

> bazel-bin/jdemo_server

- another terminal run the client

> bazel-bin/jdemo_client
