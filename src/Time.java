import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * よくわかんない
 * 
 * @author KID / @blueberrystream
 */
public class Time {
	public static final void main(final String[] args) {
		System.out.println(time());
	}

	private static final String time() {
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 9);
		return "[" + new SimpleDateFormat("yyyy.MM.dd HH:mm:ss 'JST'").format(cal.getTime()) + "] ";
	}
}
