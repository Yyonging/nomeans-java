package com.demo;

import service.demo.Hello;

public class HelloServiceImpl implements Hello.Iface {
    public String sayHello(String s) {
        return "server: " + s;
    }
}