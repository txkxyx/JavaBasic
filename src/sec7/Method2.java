package sec7;

public class Method2 {
	public static void main(String[] args) {
		String result = checkAge(20);
		System.out.println(result);
	}

	static String checkAge(int age) {
		if (age >= 20) {
			return "OK";
		} else {
			return "NG";
		}
	}
}
