package interfaces;

//1st extend then implements n no. of interfaces
//hierarchy + multiple inheritance is hybrid
public class MutipleInheritance extends C2 implements Interface_Test, Interface_Test2 {
//this is Multiple inheritance
//public class MutipleInheritance implements Interface_Test, Interface_Test2 {
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}
	public static void main(String[] args) {
		MutipleInheritance mobj = new MutipleInheritance();
		mobj.m1();
		mobj.m2(); //from Interfaces
		
		mobj.m3(); //from C2
	}
}
