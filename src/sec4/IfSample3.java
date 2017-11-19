package sec4;

public class IfSample3 {
	public static void main(String[] args) {
		int age = 20;
		boolean student = true;
		
		if (age >= 20) {
			if (student == true) {
				System.out.println("OK");
			}else{
				System.out.println("OK");
			}
		}else if (age < 20) {
			if (student == true) {
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
	}
}
