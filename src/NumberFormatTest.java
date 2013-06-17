import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * @author KID / @blueberrystream
 */
public class NumberFormatTest {

	/**
	 * @param args
	 */
	public static void main(final String[] args) throws ParseException {
		final NumberFormat numberFormat = NumberFormat.getNumberInstance();
		numberFormat.setGroupingUsed(false);

		Long l = new Date().getTime();
		final Double d = l.doubleValue();

		System.out.println(l);
		System.out.println(d);

		String s = l.toString();
		l = Long.valueOf(s);

		System.out.println(s);
		System.out.println(l);

		s = d.toString();
		// l = Long.valueOf(s); // ->NumberFormatException
		l = numberFormat.parse(s).longValue();

		System.out.println(s);
		System.out.println(l);

		System.out.println(numberFormat.format(d));

		s = "123,456,789";
		l = numberFormat.parse(s).longValue();

		System.out.println(s);
		System.out.println(l);
	}
}
