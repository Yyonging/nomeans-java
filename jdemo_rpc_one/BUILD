load("@rules_proto//proto:defs.bzl", "proto_library")
load("@io_grpc_grpc_java//:java_grpc_library.bzl", "java_grpc_library")

java_binary(
    name = "jdemo_client",
    testonly = 1,
    main_class = "io.grpc.examples.helloworld.HelloWorldClient",
    runtime_deps = [
        ":examples",
    ],
)

java_binary(
    name = "jdemo_server",
    testonly = 1,
    main_class = "io.grpc.examples.helloworld.HelloWorldServer",
    runtime_deps = [
        ":examples",
    ],
)
