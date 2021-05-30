package day39_inheritance_review;

public class Vehicle {
	
	private String name;
	private int size;
	private int currentVelocity;
	private int currentDriection;
	
	/*
	public Vehicle() {
		this("BMW",3,60,50);
	}
	*/
	
	public Vehicle(String name,int size) {
		this.name=name;
		this.size=size;
		this.currentVelocity=0;
		this.currentDriection=0;
	}
	
	public Vehicle(String name, int size, int currentVelocity, int currentDriection) {
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDriection = currentDriection;
	}
	
	public void steer(int direction) {
		this.currentDriection += direction;
		System.out.println("Vehicle.steer():Steering at " + currentDriection + " degrees.");
	}
	
	void move(int velocity,int direction) {
		this.currentDriection=direction;
		this.currentVelocity=velocity;
		System.out.println("Vehicle.moce():Moving at " + currentVelocity + " in direction " + currentDriection);
	}
	
	public void stop() {
		this.currentVelocity=0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCurrentDriection() {
		return currentDriection;
	}
	public void setCurrentDriection(int currentDriection) {
		this.currentDriection = currentDriection;
	}
	
	
	
	
	
	
	

}
