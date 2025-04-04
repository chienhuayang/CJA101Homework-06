package hw7;

import java.io.Serializable;

public class Animal implements Serializable { //物件是動態產生，要永久存須實作Serializable
	
	private String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Animal " + name + " speaking!");
	}
	
	
}
