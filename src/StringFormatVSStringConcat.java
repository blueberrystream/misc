import java.text.DateFormat;
import java.util.Date;

/**
 * {@link String#format(String, Object...)}とStringを+で連結するのとStringBuilderどれが速い？
 * 
 * @author KID / @blueberrystream
 */
public class StringFormatVSStringConcat {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int loop = 10000;
		final String format = "%% %d %o %x %c %s %tF %<tT";

		String formatted = null;
		final long start1 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			formatted = String.format(format, 1000, 1024, 512, 'A', "TEST", new Date());
		}
		final long end1 = System.currentTimeMillis();

		formatted = null;
		final long start2 = System.currentTimeMillis();
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		for (int i = 0; i < loop; i++) {
			formatted = "% " + 1000 + " " + Integer.toOctalString(1024) + " " + Integer.toHexString(512) + " " + 'A' + " TEST " + dateFormat.format(new Date());
		}
		final long end2 = System.currentTimeMillis();

		formatted = null;
		dateFormat = null;
		final long start3 = System.currentTimeMillis();
		final StringBuilder builder = new StringBuilder();
		dateFormat = DateFormat.getDateTimeInstance();
		for (int i = 0; i < loop; i++) {
			builder.append("% ").append(1000).append(" ").append(Integer.toOctalString(1024)).append(" ").append(Integer.toHexString(512)).append(" ").append('A').append(" ").append("TEST")
					.append(" ").append(dateFormat.format(new Date()));
			formatted = builder.toString();
		}
		builder.setLength(0);
		final long end3 = System.currentTimeMillis();

		formatted = null;
		dateFormat = null;
		final long start4 = System.currentTimeMillis();
		final StringBuffer buffer = new StringBuffer();
		dateFormat = DateFormat.getDateTimeInstance();
		for (int i = 0; i < loop; i++) {
			buffer.append("% ").append(1000).append(" ").append(Integer.toOctalString(1024)).append(" ").append(Integer.toHexString(512)).append(" ").append('A').append(" ").append("TEST")
					.append(" ").append(dateFormat.format(new Date()));
			formatted = buffer.toString();
		}
		buffer.setLength(0);
		final long end4 = System.currentTimeMillis();

		System.out.format("試行回数: %d%n", loop);
		System.out.format("String.format: %dms%n", end1 - start1);
		System.out.format("String連結:    %dms%n", end2 - start2);
		System.out.format("StringBuilder: %dms%n", end3 - start3);
		System.out.format("StringBuffer:  %dms%n", end4 - start4);
	}
}
