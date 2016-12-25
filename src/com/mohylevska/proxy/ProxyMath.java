package com.mohylevska.proxy;

/**
 * Created by cs.ucu.edu.ua on 25.12.2016.
 */
public class ProxyMath implements IMath {

    private Math math;

    @Override
    public double add(double x, double y) {
        if(math == null) {
            math = new Math();
        }
        return math.add(x, y);
    }

    @Override
    public double div(double x, double y) {
        if(math == null) {
            math = new Math();
        }
        return math.div(x, y);
    }
}
