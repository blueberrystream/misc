import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * {@link String#format(String, Object...)}と{@link DateFormat#format(Date)}, new {@link Date}()と {@link Calendar#getInstance()#getTime()}の戦い
 * 
 * @author KID / @blueberrystream
 */
public class StringFormatVSDateFormat {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int loop = 1000000;

		String formatted = null;
		final DateFormat format = DateFormat.getDateTimeInstance();

		final long start1 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			formatted = format.format(Calendar.getInstance().getTime());
			// System.out.println(formated);
		}
		final long end1 = System.currentTimeMillis();

		formatted = null;
		final long start2 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			formatted = String.format("%tF %<tT", Calendar.getInstance().getTime());
			// System.out.println(formated);
		}
		final long end2 = System.currentTimeMillis();

		formatted = null;
		final long start3 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			formatted = format.format(new Date());
			// System.out.println(formated);
		}
		final long end3 = System.currentTimeMillis();

		formatted = null;
		final long start4 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			formatted = String.format("%tF %<tT", new Date());
			// System.out.println(formated);
		}
		final long end4 = System.currentTimeMillis();

		System.out.format("試行回数: %d%n", loop);
		System.out.format("DateFormat & Calendar: %dms%n", end1 - start1);
		System.out.format("StringFormat & Calendar: %dms%n", end2 - start2);
		System.out.format("DateFormat & Date: %dms%n", end3 - start3);
		System.out.format("StringFormat & Date: %dms%n", end4 - start4);
	}
}
