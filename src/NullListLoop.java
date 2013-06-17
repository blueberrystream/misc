import java.util.List;

/**
 * null な List をループさせたら
 * 
 * @author hacc
 */
public class NullListLoop {
	public static final void main(final String... args) {
		final List<String> list = null;
		for (final String string : list) {
			System.out.println(string);
		}
	}
}
