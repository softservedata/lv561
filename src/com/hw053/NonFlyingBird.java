package com.hw053;

public class NonFlyingBird extends Bird{

    public boolean fly() {
        System.out.print("No");
        return false;
    }

    public NonFlyingBird(String name) {
        super(name);
    }

}
