package com.revature.project0;

import java.util.Scanner;

public class OwnerService {

	public OwnerService() {
		
	}
	
	public String askName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name");
		String name = sc.next();
		return name;
	}
	
	public int askOwnerID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your user ID");
		
		int ID = sc.nextInt();
		return ID;
	}
	
	public int askNumDogs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many dogs do you have?");
			int numDogs = sc.nextInt();
			return numDogs;
	}
	
	public String askDogName(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter dog " + i + "'s name"); 
		String name = sc.next();
		return name;
	}
	
	
	
	public int askDogLevel(int i) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter dog " + i + "'s skill level \n 1: BEGINNER, 2: INTERMEDIATE, 3: EXPERT");	
		int skillLevel = sc.nextInt();
		
		return skillLevel;
	}
		
	//Creates a new owner with given information. Adds new owner and their dogs to database
	public Owner createOwner() {
		OwnerService ownerS = new OwnerService();
		Owner owner = new Owner();
		owner.setName(ownerS.askName());
		owner.setMemberID(askOwnerID());
		owner.setNumDogs(askNumDogs());
		for (int i = 0; i < owner.getNumDogs(); i++) {
			Dog dog = new Dog();
			dog.setName(askDogName(i));
			dog.setOwner(owner);
			dog.setSkillLevel(askDogLevel(i));
			owner.addDog(dog);
		}
		return owner;
	}

}
