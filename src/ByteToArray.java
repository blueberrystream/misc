import java.util.Arrays;

/**
 * @author KID / @blueberrystream
 */
public class ByteToArray {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final String string = "test";
		final byte[] element = string.getBytes();
		final Double d = 1.124156486451;
		// final byte[] element = new byte[] {
		// 0, 1, 2, 3, 4, 5, 6, 78, 9, 9
		// };
		System.out.println('[' + Arrays.toString(element) + ',' + d + ']');

	}
}
