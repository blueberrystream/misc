import java.util.Arrays;
import java.util.List;

/**
 * @author KID / @blueberrystream
 * 
 */
public class ListFill {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// final List<String> list = new ArrayList<String>(200);
		// list.add("e");
		// list.add("e");
		// list.add("e");
		// list.add("e");
		// list.add(200, "");
		// Collections.fill(list, "a");
		//
		// for (final String e : list) {
		// System.out.println(e);
		// }

		final String[] array = new String[200];
		Arrays.fill(array, "");
		final List<String> list = Arrays.asList(array);

		for (final String e : list) {
			System.out.println(e);
		}
	}
}
