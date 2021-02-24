package com.hw053;

public class Eagle extends FlyigBird{

    public Eagle(String name) {
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

    private boolean layEggs = false;

    @Override
    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }
}
