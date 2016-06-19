package innerclasses;

public class A {
	public int a = 10;
	public static int b = 65;

	public void GetClassData() {
		System.out.println(" value of a is " + a);
		System.out.println(" value of b is " + b);
	}

}

class munish {
	public static void main(String args[]) {
		A obj1 = new A();
		obj1.GetClassData();

		obj1.a = 2500;
		obj1.b = 5000;
		A obj2 = new A();
		obj2.GetClassData();
		obj1.GetClassData();
	}
}
