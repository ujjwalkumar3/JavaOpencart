package static_and_this;

public class StaticKeyword {
	
	static int a = 10; //static variable
	//static methods can access static stuff directly
	int b = 20; //non-static variable
	
	static void m1() {
		System.out.println("this is m1 static method");
	}
	
	void m2() {
		System.out.println("this is m2 non static method");
	}
	
	void m() { //non static methods can access everything directly
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		//static has only restrictions
		// direct access of static variable without creating object because main itself is static
//		System.out.println(a);
//		StaticKeyword.m1();
		
//		System.out.println(b); //cannot access, b is non static
//		m2();
		 //with object it can be called
		StaticKeyword sd = new StaticKeyword();
//		System.out.println(sd.b);
//		sd.m2();
		
		sd.m();
	}

}
