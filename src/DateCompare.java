import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日付の大小比較
 * 
 * @author KID / @blueberrystream
 */
public class DateCompare {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println(is3ganichi("2010"));
	}

	public static Boolean is3ganichi(final String year) {
		final Calendar cal = Calendar.getInstance();
		// cal.add(Calendar.HOUR, 9);
		final Date now = cal.getTime();
		final SimpleDateFormat sdf = new SimpleDateFormat("_yyyyMMdd_HHmmss");
		Date _0101_000000 = null;
		Date _0103_235959 = null;
		try {
			_0101_000000 = sdf.parse("_" + year + "0101_000000");
			_0103_235959 = sdf.parse("_" + year + "0103_235959");
		} catch (final ParseException e) {
			return Boolean.FALSE;
		}

		return 0 <= now.compareTo(_0101_000000) && now.compareTo(_0103_235959) <= 0;
	}
}
