/**
 * nullなプリミティブラッパークラスをUnboxingしたら
 * 
 * @author KID / @blueberrystream
 */
public class NullUnboxing {
	public static void main(final String[] args) {
		final Long l = null;
		method(l);
	}

	private static void method(final long l) {
		System.out.println(l);
	}
}
