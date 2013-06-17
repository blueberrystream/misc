import java.util.HashMap;
import java.util.Map;

/**
 * @author KID / @blueberrystream
 */
public class MapTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Map<String, String> map = new HashMap<String, String>();

		System.out.println(map.remove("存在しないキー"));
	}
}
