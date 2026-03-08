package Hari;

import Hari.Animal;
import Hari.Animal.Cat;

public class Animal {
	private String name;
			
	public Animal (String name) {
		this.name = name;
	}
	public void eat() {
	System.out.println(name + " is eating");
	}
	public void sleep() {
		System.out.println(name + " is Sleeping");
	}
	public void food() {
		System.out.println(name + " is Hunting");
	}

    public static class Cat extends Animal{
	  public Cat(String name) {
		  super(name);
	  }
	  public void meow() {
		 System.out.println("The cat is meowing.");
	  }
    }
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //Animal a = new Animal(null);
	   
		Cat mycat = new Cat("Whiskers");
		mycat.eat();
		mycat.sleep();
		mycat.food();
		mycat.meow();
	}

}



	
		// TODO Auto-generated method stub


