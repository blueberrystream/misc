import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * null なものを instanceof にかけたらどうなるの？
 * 
 * @author KID / @blueberrystream
 */
public class NullInstanceOfTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final List<String> s = new ArrayList<String>();
		System.out.println(s instanceof LinkedList);
	}
}
