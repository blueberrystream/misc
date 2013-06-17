import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

/**
 * TimeZoneのテスト？
 * 
 * @author KID / @blueberrystream
 */
public class TimeZoneTest {
	public static void main(final String[] args) throws ParseException {
		final DateFormat df = DateFormat.getDateTimeInstance();
		df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
		final String year = year();
		final Date _0101_000000 = df.parse(year + "/01/01 0:00:00");
		final Date _0103_235959 = df.parse(year + "/01/03 23:59:59");
		final Date now = new Date();
		System.out.println(0 <= now.compareTo(_0101_000000) && now.compareTo(_0103_235959) <= 0);
		System.out.println(now);
		System.out.println(df.format(now));
	}

	public static final String year() {
		final DateFormat df = DateFormat.getDateInstance();
		df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
		return df.format(new Date()).substring(0, 4);
	}
}
