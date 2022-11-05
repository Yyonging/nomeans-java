package com.demo;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import service.demo.Hello;

public class HelloServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server starting....");
            TServerSocket serverTransport = new TServerSocket(8080);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport)
            .processor(new Hello.Processor<Hello.Iface>(new HelloServiceImpl())));
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}