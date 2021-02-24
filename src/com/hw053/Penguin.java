package com.hw053;

public class Penguin extends NonFlyingBird{

    public Penguin(String name) {
        super(name);
    }

    private boolean feathers = false;

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
        return layEggs;
    }

    @Override
    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }
}
