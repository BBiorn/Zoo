//Jacob Johnson
package model;

public class Zebra {
	private String name;
	private String color;
	private int age;
	
	public Zebra() {
		super();
	}
	//constructor
	public Zebra(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "Errrrrrrrr!";
	}
	

}