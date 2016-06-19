package innerclasses;

public class Outer2 {

	private static int i = 1000;
	private static int j = 25000;

	static class innerclass1 {
		public innerclass1()// constructor
		{
			System.out.println("innerclass constructor");
		}

		public static void GetInnerClass1Data()// method
		{
			System.out.println("inner class1 calling and value of i is " + i);
		}
	}

	static class innerclass2 {
		public innerclass2()// constructor
		{
			System.out.println("innerclass 2 constructor");
		}

		public static void GetInnerClass2Data()// method
		{
			System.out.println(" inner class2 calling and value of j is" + j);
		}

	}

	public void GetOuter2ClassData() {
		System.out.println("outer class calling");

		innerclass1.GetInnerClass1Data();// calling directly the inner class1 as
											// it is a static class

		innerclass2.GetInnerClass2Data();// calling directly the inner class2 as
											// it is a static class

	}

}

class Program1 {
	public static void main(String args[]) {
		Outer2 obj = new Outer2();
		obj.GetOuter2ClassData();
		Outer2.innerclass1 obj3 = new Outer2. innerclass1();
		obj3.GetInnerClass1Data();
	}
}
