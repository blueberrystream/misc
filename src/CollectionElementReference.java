import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Collectionをfor文でまわしたときに要素をいじるとどうなるのか
 * 
 * @author KID / @blueberrystream
 */
public class CollectionElementReference {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final List<CollectionElementReferencePOJO> list = new ArrayList<CollectionElementReferencePOJO>();
		for (int i = 0; i < 5; i++) {
			list.add(new CollectionElementReferencePOJO(String.valueOf(new Random().nextInt()), String.valueOf(new Random().nextInt())));
		}

		for (final CollectionElementReferencePOJO element : list) {
			System.out.println(element);
			element.setMessage("");
		}
		for (final CollectionElementReferencePOJO element : list) {
			System.out.println(element);
		}
	}
}
