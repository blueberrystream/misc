import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author KID / @blueberrystream
 */
public class ListRemove {
	public static void main(final String[] args) {
		final List<String> list = new LinkedList<String>();
		list.add("");

		// NG
		// for (String string: list) {
		// list.remove(string);
		// }

		// OK
		for (final Iterator<String> it = list.iterator(); it.hasNext();) {
			it.next();
			it.remove();
		}
	}
}
