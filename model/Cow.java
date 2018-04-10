package model;
public class Cow {

	private int weight;
	private int age;
	private String name;

	/**
	 * @param weight
	 * @param age
	 * @param name
	 */
	public Cow(int weight, int age, String name) {
		this.weight = weight;
		this.age = age;
		this.name = name;
	}

	public Cow() {
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String speak() {
		return "Moo";
	}
}
