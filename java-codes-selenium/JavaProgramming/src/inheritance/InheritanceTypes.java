package inheritance;

class A{
	int a;
	void display(){
		System.out.println(a);
	}
}

//Single inheritance
class B extends A{
	int b;
	void show(){
		System.out.println(b);
	}
}

//multilevel
class C extends B{
	int c;
	
	void print() {
		System.out.println(c);
	}
}

public class InheritanceTypes {
	
	public static void main(String[] args) {
		/*
		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.display();
		obj.show();
		*/
		
		C obj = new C();
		obj.a = 200;
		obj.b = 5;
		obj.c  = 445;
		
		obj.display();
		obj.show();
		obj.print();
	}
}
