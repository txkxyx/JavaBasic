package sec7;

public class Method5 {
	public static void main(String[] args) {
		int[] points = { 20, 42, 15 };
		System.out.println(maxValue(points));
	}

	static int maxValue(int[] points) {
		int max = 0;
		for (int i = 0; i < points.length; i++) {
			if (points[i] >= max) {
				max = points[i];
			}
		}
		return max;
	}
}
