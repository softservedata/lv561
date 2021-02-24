package com.hw053;

public class FlyigBird extends Bird{

    public boolean fly() {
        System.out.print("This shit can fly");
       return true;
    }

    public FlyigBird(String name) {
        super(name);
    }
}
