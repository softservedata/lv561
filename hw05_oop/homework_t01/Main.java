package homework_t01;

public class Main {
	public static void main(String[] args) {
		
		Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};
		for(Bird b : birds) {
			b.fly();
		}
	}
}

abstract class Bird {
	String type;
	boolean feathers;
	boolean layEggs;
	
	abstract void fly();
}

abstract class FlyingBird extends Bird {
	
	@Override
	void fly() {
		System.out.println("I can fly. " + toString());
	}

	@Override
	public String toString() {
		return "FlyingBird [type=" + type + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
		
}

abstract class NonFlyingBird extends Bird {
	
	@Override
	void fly() {
		System.out.println("I cannot fly. " + toString());
	}
	
	@Override
	public String toString() {
		return "NonFlyingBird [type=" + type + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
}

class Eagle extends FlyingBird {

	Eagle() {
		this.type = "Eagle";
		this.feathers = true;
		this.layEggs = true;
	}	
}

class Swallow extends FlyingBird {
	
	Swallow(){
		this.type = "Swallow";
		this.feathers = true;
		this.layEggs = true;
	}
	
}

class Penguin extends NonFlyingBird {
	
	Penguin(){
		this.type = "Penguin";
		this.feathers = false;
		this.layEggs = true;
	}
	
}

class Kiwi extends NonFlyingBird {
	
	Kiwi(){
		this.type = "Kiwi";
		this.feathers = false;
		this.layEggs = true;
	}
	
}

