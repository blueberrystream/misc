import java.util.ArrayList;
import java.util.List;

/**
 * 空の List をループさせたら
 * 
 * @author KID / @blueberrystream
 */
public class EmptyListLoop {
	public static final void main(final String... args) {
		final List<String> list = new ArrayList<String>();
		for (final String string : list) {
			System.out.println(string);
		}
	}
}
