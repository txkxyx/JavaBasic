package sec6;

public class Array2 {
	public static void main(String[] args) {
		int[] points = { 64, 76, 58, 72, 48 };
		int total = 0;
		for (int i = 0; i < points.length; i++) {
			total += points[i];
		}
		System.out.println(total);
	}
}
