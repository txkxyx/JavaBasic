package sec7;

public class Method3 {
	public static void main(String[] args) {
		String result = addMark("onish");
		System.out.println(result);
	}

	static String addMark(String str) {
		return "*" + str + "*";
	}
}
