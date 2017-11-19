package sec4;

public class IfSample2 {
	public static void main(String[] args) {
		int height = 180;
		
		if (height >= 180) {
			System.out.println("Large");
		}else if (height >= 170 && height <=179) {
			System.out.println("Medium");
		}else if (height <= 169) {
			System.out.println("Small");
		}
	}
}
