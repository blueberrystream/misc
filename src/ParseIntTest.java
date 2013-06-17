/**
 * @author KID / @blueberrystream
 */
public class ParseIntTest {

	/**
	 * {@link Integer#parseInt(String)}の挙動チェック
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println(Integer.parseInt("100"));
		System.out.println(Integer.parseInt("011"));
		// System.out.println(Integer.parseInt("0xff"));
		// System.out.println(Integer.parseInt("0b1000"));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("011", 16));
		// System.out.println(Integer.parseInt("0xff", 16));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("011", 8));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("011", 2));
		System.out.println(Integer.parseInt("011", 3));
	}
}
