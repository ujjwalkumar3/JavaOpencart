package static_and_this;

public class ThisKeyword {
	//class variable/instance variables
	int x, y;
	
	void get(int x, int y) {
		x=y=0;
	}
	
	void set(int a, int b) {
		//local variable a and b
		x=a;
		y=b;
	}
	
	void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	ThisKeyword(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	ThisKeyword(){
		
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	static public void main(String[] args) {
		//obj is object reference
		//new ThisKeyword(); is instatiate object
//		ThisKeyword obj = new ThisKeyword();
		ThisKeyword obj1 = new ThisKeyword(14,15);
//		obj.set(100, 200);
//		obj.setData(10, 20);
//		obj.get(5, 10);
		obj1.display();
	}
}