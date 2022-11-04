## Description

A demo use grpc and bazel

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `BUILD`: bazel build file

## Prerequisites

- java installation

- bazel installation

<!-- - proto compiler installation -->

## build command

- build all

> bazel build //...

## run command

- make sure the 8080 port is available

> bazel-bin/jdemo_server

- another terminal run the client

> bazel-bin/jdemo_client
