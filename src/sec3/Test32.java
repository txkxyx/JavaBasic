package sec3;

public class Test32 {
	public static void main(String[] args) {
		int a = 10;
		int b = a++ + a + --a - a-- + ++a;
		System.out.println("a = " + a + ": b = " + b);	}

}
