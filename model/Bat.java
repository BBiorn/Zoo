package model;

public class Bat {
	String name;
	String color;
	double wingSpan;
	public Bat(String name, String color, double wingSpan) {
		super();
		this.name = name;
		this.color = color;
		this.wingSpan = wingSpan;
	}
	public Bat() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	public String speak() {
		return "Squeak";
	}
}
