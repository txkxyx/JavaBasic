package sec5;

public class ForSample6 {
	public static void main(String[] args) {

		int total = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				total = total + i;
			}
		}
//		for (int i = 2; i <= 10; i += 2) {
//			total = total + i;
//		}
		System.out.println(total);
	}
}
