/**
 * nullなインスタンスをキャストしたら
 * 
 * @author KID / @blueberrystream
 */
public class NullCast {

	public static void main(final String[] args) {
		final Object object = null;
		final Boolean bool = (Boolean) object;
		System.out.println(bool);
	}
}
