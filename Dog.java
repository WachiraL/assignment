package assignment1;

public class Dog {

	private String breed;
	private String name;
	private String color;
	private int age;
	
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
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
		if (age > 0)
		this.age = age;
	}
	public void wagTail() {
		System.out.println("Dogs wag tails");
	}
	public void eating() {
		System.out.println("Dogs eat");
}
	public void barking() {
		System.out.println("Dogs bark");
	}
	
	
}
