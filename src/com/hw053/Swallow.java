package com.hw053;

public class Swallow extends FlyigBird{

    public Swallow(String name) {
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
        return layEggs;
    }

    @Override
    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }
}
