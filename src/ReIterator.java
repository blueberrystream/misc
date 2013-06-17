import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 一度iteratorでまわしたものをもっかい回したらどうなるか
 *
 * @author KID / @blueberrystream
 */
public class ReIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");

		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			it.next();
		}
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			it.next();
		}
	}

}
