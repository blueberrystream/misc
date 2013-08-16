/**
 * nullなString配列にアクセスしてみたり、可変長引数にnull突っ込んでみたり
 * 
 * @author KID / @blueberrystream
 */
public class VariableParameter {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final String[] strings = null;
		// for (final String string : strings) {
		// System.out.println(string);
		// }

		test();
		System.out.println("---------------------------");
		// test(null);
		// System.out.println("---------------------------");
		test(null, null);
		System.out.println("---------------------------");
		test("aaaaa");
		System.out.println("---------------------------");
		test("aaaaa", "bbbbbb");
		System.out.println("---------------------------");
	}

	private static void test(final String... strings) {
		for (final String string : strings) {
			System.out.println(string);
		}
	}
}
