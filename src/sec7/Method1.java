package sec7;

public class Method1 {
	public static void main(String[] args) {
		int result = sum(2, 4, 6);
		System.out.println(result);
	}

	static int sum(int a, int b, int c) {
		int x = a + b + c;
		return x;
	}
}
