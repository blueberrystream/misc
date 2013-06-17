import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * なんも入れてないMapから適当にgetして…？
 * 
 * @author KID / @blueberrystream
 */
public class NullMap {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (final String string : map.get("")) {

		}
	}

}
