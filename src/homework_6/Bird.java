package homework_6;

public abstract class Bird {
    boolean feathers;
    boolean layEggs;
    String name;

    void fly(){
    }
}

abstract class FlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("\n I`m " + name + ". I know to fly: \n" + toString());
    }

    @Override
    public String toString() {
        return "feathers - " + feathers + "\n" +
                "layEgg - " + layEggs;
    }
    }

    abstract class NonFlyingBird extends Bird {
        @Override
        void fly() {
            System.out.println("\n I`m " + name + ". I do not know to fly: \n" + toString());
        }

        @Override
        public String toString() {
            return "feathers - " + feathers + "\n" +
                    "layEgg - " + layEggs;
        }
    }

    class Eagle extends FlyingBird{
        public Eagle() {
            this.feathers = true;
            this.layEggs = false;
            this.name = "Eagle";
        }
    }

    class Swallow extends  FlyingBird{
        public Swallow() {
            this.feathers = true;
            this.layEggs = true;
            this.name = "Swallow";
        }
    }

    class Penguin extends NonFlyingBird{
        public Penguin() {
            this.feathers = false;
            this.layEggs = true;
            this.name = "Penguin";
        }
    }

    class Chicken extends NonFlyingBird{
        public Chicken() {
            this.feathers = true;
            this.layEggs = true;
            this.name = "Chicken";
        }
    }

    class Appl {
        public static void main(String[] args) {
            Bird[] bird = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};

        for (Bird bird1 : bird)
            bird1.fly();
        }
    }


