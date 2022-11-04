package com.demo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {

    GreeterGrpc.GreeterBlockingStub stub;
    ManagedChannel managedChannel;

    public static void main(String[] args) {
        Client client = new Client();

        HelloReply reply = client.stub.sayHello(HelloRequest.newBuilder().setName("wajo").build());
        System.out.println(reply.getMessage());

    }

    public Client(){
        managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        stub = GreeterGrpc.newBlockingStub(managedChannel);
    }
}
