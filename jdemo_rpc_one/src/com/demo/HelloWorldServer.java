package com.demo;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class HelloWorldServer extends GreeterGrpc.GreeterImplBase{
    public static void main(String[] args) throws IOException {
        ServerBuilder.forPort(8080)
                .addService(new HelloWorldServer())
                .build()
                .start();
        System.out.println("server start at 8080");
        while (true){

        }
    }

    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver){
        String s = hello(request.getName());
        responseObserver.onNext(HelloReply.newBuilder().setMessage(s).build());
        responseObserver.onCompleted();
    }

    private String hello(String s){
        return "hello, " + s;
    }
}
