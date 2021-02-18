package com.homework6.part1;

/*
Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
Create array Bird and add different birds to it.
Call fly() method for all of it. Output the
information about each type of created bird.
*/


abstract class Bird{
    boolean feathers;
    boolean layEgg;

    void fly(){
    }
}

    abstract class FlyingBird extends Bird {
        @Override
        void fly() {
            System.out.println("I'm fly " + toString());
           // super.fly();
        }

        @Override
        public String toString() {
            return "FlyingBird{" +
                    "feathers='" + feathers + '\'' +
                    ", layEgg=" + layEgg +
                    '}';
        }
    }
    abstract class NonFlyingBird extends Bird{
        @Override
        void fly() {
            System.out.println("I'm can't fly " + toString());
            //super.fly();
        }

        @Override
        public String toString() {
            return "NonFlyingBird{" +
                    "feathers=" + feathers +
                    ", layEgg=" + layEgg +
                    '}';
        }
    }
    class Orel extends FlyingBird{
    Orel(){
        this.feathers = true;
        this.layEgg = false;    }
    }
    class Lastivka extends  FlyingBird{
    Lastivka(){
        this.feathers = true;
        this.layEgg = false;    }
    }
    class Kurka extends NonFlyingBird{
    Kurka(){
        this.feathers = true;
        this.layEgg = false;    }
    }



public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Orel(), new Lastivka(), new Kurka()};
        for (Bird bird : birds) {
            bird.fly();

        }
    }
}