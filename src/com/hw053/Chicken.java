package com.hw053;

public class Chicken extends NonFlyingBird{

    public Chicken(String name) {
        super(name);
    }

    private boolean feathers = true;

    @Override
    public boolean isFeathers() {
        return feathers;
    }

    @Override
    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    private boolean layEggs = true;

    @Override
    public boolean isLayEggs() {
//        System.out.print("YEEEEEEEEEESSSSSSSS");
        return layEggs;
    }

    @Override
    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }
}
