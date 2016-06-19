package innerclasses;

public class Outer1 {

	private int i = 10;
	private static int j = 25;

	class innerclass1 {
		public innerclass1()// constructor
		{
			System.out.println("innerclass constructor");
		}

		public void GetInnerClass1Data()// method
		{
			System.out.println("inner class1 calling and value of i is " + i);
		}
	}

	class innerclass2 {
		public innerclass2()// constructor
		{
			System.out.println("innerclass 2 constructor");
		}

		public void GetInnerClass2Data()// method
		{
			System.out.println(" inner class2 calling and value of j is" + j);
		}

	}

	public void GetOuter1ClassData() {
		System.out.println("outer class calling");
		innerclass1 obj1 = new innerclass1();
		obj1.GetInnerClass1Data();

		innerclass2 obj2 = new innerclass2();
		obj2.GetInnerClass2Data();

	}

}

class Program {
	public static void main(String args[]) {
		Outer1 obj = new Outer1();
		obj.GetOuter1ClassData();
		Outer1.innerclass1 obj3 = new Outer1().new innerclass1();
		obj3.GetInnerClass1Data();
		
	}
}
//outer class calling
//innerclass constructor
//inner class1 calling and value of i is 10
//innerclass 2 constructor
 //inner class2 calling and value of j is25
//innerclass constructor
//inner class1 calling and value of i is 10

