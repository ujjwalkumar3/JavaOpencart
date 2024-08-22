package overriding;

class Test{
	int x = 100;
}

class Test1{
	final int x = 100;
}

//final class can't be extended in other class
//final method can't be overrided in other child class
//final variable is not changed
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.x);
		t.x=200;
		System.out.println(t.x);
		
		Test1 t1 = new Test1();
		System.out.println(t1.x);
//		t1.x=200; //incorrect, because x is a final variable/constant
	}

}
