package patterns;

public class mun4 {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j =5-i; j >=1 ; j--) {
				System.out.print("  ");
			}
				for (int k = 1; k <= (i*2)-1; k++) {
					System.out.print("* ");
				}
			System.out.println(" ");
			
		}
	}
}
