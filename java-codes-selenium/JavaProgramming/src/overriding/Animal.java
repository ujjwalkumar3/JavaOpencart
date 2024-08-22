package overriding;

public class Animal {
	String color = "white";
	
	void eat() {
		System.out.println("eating");
	}

}

//super is applicable only in class
class Dog extends Animal{
	String color = "black";
	//even though overriding but want old value
	//invoke immediate parent class
	
	void displayColor() {
		System.out.println(super.color);
	}
	
	void eat() {
		super.eat();
		System.out.println("eat bread");
	}
}
