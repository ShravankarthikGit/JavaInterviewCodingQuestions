package oOPS;

class Demo {
	int num;

	Demo() {
		this(100);
		System.out.println("Default Constructor");
	}

	Demo(int n) {
		num = n;
		System.out.println("Parameterized Constructor");
	}
}

class Base {
    Base() {
        System.out.println("Base Constructor");
    }
}
class Derived extends Base {
    Derived() {
        System.out.println("Derived Constructor");
    }
}




public class InterQues {
	public static void main(String[] args) {
		Demo obj = new Demo();
		
		Derived obj1 = new Derived();
	}
}