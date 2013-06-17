/**
 * {@link Boolean#valueOf(String)} にいろんな文字列を渡してみるテスト
 * 
 * @author KID / @blueberrystream
 */
public class BooleanTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println(Boolean.valueOf("true"));
		System.out.println(Boolean.valueOf("TRUE"));
		System.out.println(Boolean.valueOf("True"));
		System.out.println(Boolean.valueOf("trUe"));
		System.out.println(Boolean.valueOf("1"));
		System.out.println(Boolean.valueOf("yes"));
		System.out.println(Boolean.valueOf("YES"));
		System.out.println(Boolean.valueOf("Yes"));
		System.out.println(Boolean.valueOf("yEs"));

		final Boolean b = null;
		if (b != null && b) {
			System.out.println("どうなるの？");
		} else {
			System.out.println("だめだった");
		}
	}
}
