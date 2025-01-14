package interfaces;

interface Shape{
	int length = 10; //final & static
	int width = 20;
	
//	//declaration allowed not implementation
//	void square() {
//		System.out.println("this is a square");
//	}
	
	//default method allowed
	default void square() {
		System.out.println("this is a square");
	}
	
	//by default access modifier is public
	void circle(); //abstract method allowed
	
	//static method implementation allowed
	static void rectangle() {
		System.out.println("this is a rectangle");
	}
}

public class InterfaceDemo implements Shape {
	
	void triangle() {
		System.out.println("this is triangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();
		idobj.square();
//		idobj.rectangle(); //wrong can't possible
//		rectangle(); //this also wrong because static is in interface not in Class
		idobj.triangle();
		//static method can directly access from interface
		Shape.rectangle();
		
		
		//Scenario 2
//		Shape sh = new Shape(); //wrong
		Shape sh = new InterfaceDemo();
		sh.circle(); //abstract
		sh.square(); //default
		Shape.rectangle();
//		sh.triangle(); //wrong not allowed as this is in class not interface
		
		System.out.println(Shape.length * Shape.width);
	}
	
	//always method should be public and always implementation of method should be done when implementing interface
	//by default access modifier is default in method so make it public as interface method is public 
	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("this is a circle");
		
	}

}
