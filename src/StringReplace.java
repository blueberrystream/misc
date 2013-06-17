/**
 * {@link String#replace(CharSequence, CharSequence)}をしたときStringはどうなる？
 * 
 * @author KID / @blueberrystream
 */
public class StringReplace {
	public static void main(final String[] args) {
		final String test = "testhogehogefugafugafoobarwooboo";

		System.out.println(test);
		System.out.println(test.replace("hoge", "ハゲ"));
		System.out.println(test);
	}
}
