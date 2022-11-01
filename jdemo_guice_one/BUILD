load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_binary(
    name = "guice_one",
    srcs = glob(["src/com/demo/*.java"]),
    main_class = "com.demo.App",
    deps = [
        "@maven//:com_google_inject_guice",
        "@maven//:javax_inject_javax_inject",
    ]
)


# use lib

# load("@rules_java//java:defs.bzl", "java_binary", "java_library")

# java_library(
#     name="java-maven-lib",
#     srcs = glob(["src/com/demo/*.java"]),
#     deps = [
#         "@maven//:com_google_inject_guice",
#         "@maven//:javax_inject_javax_inject"],
# )

# java_binary(
#     name = "guice_one",
#     main_class = "com.demo.App",
#     runtime_deps=[":java-maven-lib"]
# )