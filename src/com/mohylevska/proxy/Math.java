package com.mohylevska.proxy;

/**
 * Created by cs.ucu.edu.ua on 25.12.2016.
 */
public class Math implements IMath  {
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double div(double x, double y) {
        return x/y;
    }
}
