package com.hw053;

public abstract class Bird {

    private String name;
    private boolean feathers = false;
    private boolean layEggs = false;

    public Bird(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(){

    }

    public abstract boolean fly();

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        System.out.print("YEEEEEEEEEESSSSSSSS");
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }


}
