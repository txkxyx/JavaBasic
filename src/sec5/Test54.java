package sec5;

public class Test54 {
	public static void main(String[] args) {
		int dan = 5;
		for (int i = dan; i > 0; i--) {
			for (int j = 0; j < dan - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
