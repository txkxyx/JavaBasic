package sec6;

public class Test62 {
	public static void main(String[] args) {
		int[][] points = { { 10, 20 }, { 30, 40, 50, 60 }, { 70, 80, 90 } };
		for (int[] is : points) {
			for (int i : is) {
				System.out.println(i);
			}
		}
	}
}
