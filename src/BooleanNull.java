/**
 * nullを{@link Boolean#valueOf(String)}したらどうなるのか
 * 
 * @author KID / @blueberrystream
 */
public class BooleanNull {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final String nullString = null;
		System.out.println(Boolean.valueOf(nullString));
	}
}
