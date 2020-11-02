package com.revature.project0;

public class Pairing {

	private Dog dog;
	private Runner runner;
	
	public Pairing(Dog dog, Runner runner) {
		this.dog = dog;
		this.runner = runner;
	}
	
	public Pairing createPairing(Dog dog, Runner runner) {
		this.dog = dog;
		this.runner = runner;
		
		System.out.println("Looks like you found a match! " + runner.getName() + ", you will be running with " + dog.getName() 
		+". You are both " + runner.getSkillLevel() + ". Their owner's name is " + dog.getOwner().getName() + ".");
		
		Pairing pairing = new Pairing(dog, runner);
		Database data = new Database();
		data.addPairing(pairing);
		
		return pairing;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}
	

}
