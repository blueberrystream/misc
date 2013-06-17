import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Long.MAX_VALUEをFloatにキャストしたらどうなるのか
 * 
 * @author KID / @blueberrystream
 */
public class LongToFloat {
	public static void main(final String... args) throws ParseException {
		final NumberFormat numberFormat = NumberFormat.getIntegerInstance();
		final Long longValue = Long.MAX_VALUE;
		System.out.println(numberFormat.format(longValue));

		String string = "123456789" + Long.MAX_VALUE;
		Number number = numberFormat.parse(string);
		System.out.println(numberFormat.format(number));

		Double doubleValue = Double.parseDouble(string);
		System.out.println(NumberFormat.getIntegerInstance().format(doubleValue));

		BigInteger big = new BigInteger(string);
		System.out.println(numberFormat.format(big));

		for (int i = 0; i < 100; i++) {
			string = "123456789" + string;
			number = numberFormat.parse(string);
			System.out.println(numberFormat.format(number));

			doubleValue = Double.parseDouble(string);
			System.out.println(NumberFormat.getIntegerInstance().format(doubleValue));

			big = new BigInteger(string);
			System.out.println(numberFormat.format(big));
		}
	}
}
