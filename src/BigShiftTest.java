/**
 *
 */

/**
 * @author KID / @blueberrystream
 * 
 */
public class BigShiftTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		long l = Long.MAX_VALUE;
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		l = l << 32;
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		l = l >> 32;
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		l = l >>> 32;
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
	}
}
