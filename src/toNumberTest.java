/**
 * {@link Integer#valueOf(String)} などにどんな文字列を渡したときに {@link NumberFormatException} が発生するのか
 * 
 * @author KID / @blueberrystream
 */
public class toNumberTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// System.out.println(Integer.valueOf("1.000"));
		System.out.println(Integer.valueOf("0001"));
		// System.out.println(Integer.valueOf("adfasd"));

		// System.out.println(Long.valueOf("1L"));
		System.out.println(Long.valueOf("0001"));
		// System.out.println(Long.valueOf("adfasd"));

		System.out.println(Double.valueOf("1"));
		System.out.println(Double.valueOf("0001"));
		System.out.println(Double.valueOf("1.01264584"));
		// System.out.println(Double.valueOf("adfasd"));
	}
}
