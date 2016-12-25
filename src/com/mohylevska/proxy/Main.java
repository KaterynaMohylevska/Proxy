package com.mohylevska.proxy;

public class Main {

    public static void main(String[] args) {
        IMath p = new ProxyMath();

        System.out.println("10 + 2 = " + p.add(10, 2));
        System.out.println("10 / 2 = " + p.div(10, 2));
    }

}
