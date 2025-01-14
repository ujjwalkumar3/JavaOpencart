package overriding;

class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	//for overriding need extends always or 2 class at least
	void m1(int a) { //overriding changing implementation not declaration
		System.out.println(a * a);
	}
	
	//in both method are same
	
	//can be done without extend, polymorphism
	void m2(int a, int b) { //overloading changing declaration is important
		System.out.println(a + b);
	}
}

public class Overloading_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ obj = new XYZ();
		obj.m1(100);
		obj.m2(14);
		obj.m2(10, 50);

	}

}
