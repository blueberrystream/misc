import java.text.NumberFormat;

/**
 * @author KID / @blueberrystream
 */
public class DoubleTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Long longMax = Long.MAX_VALUE;
		Double d = longMax.doubleValue();

		final NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(false);
		System.out.println(nf.format(longMax));
		System.out.println(nf.format(d));

		d = Double.MIN_VALUE;
		final String s = d.toString();
		d = Double.valueOf(s);
		System.out.println(s);
		System.out.println(d);
	}
}
