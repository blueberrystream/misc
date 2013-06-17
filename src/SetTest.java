import java.util.HashSet;
import java.util.Set;

/**
 * @author KID / @blueberrystream
 */
public class SetTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Set<String> set = new HashSet<String>();
		set.add(null);
		set.add("");
		System.out.println(set.size());
		for (final String e : set) {
			System.out.println(e);
		}

		set.remove(null);
		set.remove("");
		System.out.println(set.size());
		for (final String e : set) {
			System.out.println(e);
		}

		set.remove(null);
		set.remove("");
		System.out.println(set.size());
		for (final String e : set) {
			System.out.println(e);
		}
	}
}
