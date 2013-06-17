/**
 * 空文字列と結合して文字列とするのと{@link String#valueOf(long)}とではどちらが速いか
 * 
 * @author KID / @blueberrystream
 */
public class StringCast {
	private final static String EMPTY = "";

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int loop = 10000000;

		String time = null;
		final long start1 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			time = "" + System.currentTimeMillis();
		}
		final long end1 = System.currentTimeMillis();

		time = null;
		final long start2 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			time = EMPTY + System.currentTimeMillis();
		}
		final long end2 = System.currentTimeMillis();

		time = null;
		final long start3 = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			time = String.valueOf(System.currentTimeMillis());
		}
		final long end3 = System.currentTimeMillis();

		System.out.format("試行回数: %d%n", loop);
		System.out.format("\"\"な空文字列: %dms%n", end1 - start1);
		System.out.format("定数な空文字列: %dms%n", end2 - start2);
		System.out.format("String#valuOf:  %dms%n", end3 - start3);
	}

}
