
public class StringReverser {

	public static void main(String[] args) {
		String initial = "absd";
		System.out.println(reversedString1(initial));
		System.out.println(reversedString2(initial));

	}

	public static String reversedString1(String initial) {
		return new StringBuffer(initial).reverse().toString();
	}

	public static String reversedString2(String initial) {
		String reversed = "";
		for (int i = initial.length() - 1; i >= 0; i--) {
			reversed = reversed + initial.charAt(i);
		}
		return reversed;
	}
}
