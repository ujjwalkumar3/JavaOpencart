package encapsulation;

public class OverloadingMainMethod {
	//one can have many forms -> polymorphism
	
	void main(int x) {
		System.out.println(x);
	}
	
	int main(double x) {
		return 123;
	}
	
	void main(String s) {
		System.out.println(s);
	}
	
	void main(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMainMethod obj = new OverloadingMainMethod();
		obj.main(100);
		int ans = obj.main(1234.5);
		System.out.println(ans);
		obj.main("John");
		obj.main("hello","john");
	}

}
