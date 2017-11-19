package sec6;

public class Array4 {
public static void main(String[] args) {
	int[] points = {64, 76, 58, 72, 48};
	int min = points[0];
	for (int i = 0; i < points.length; i++) {
		if (points[i] <= min) {
			min = points[i];
		}
	}
	System.out.println(min);
}
}
