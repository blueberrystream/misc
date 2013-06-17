/**
 * もともと存在する参照をループの中で受け皿を作って代入するのと ループの外に受け皿を用意しておいて代入するのとではどちらが速いか
 * 
 * @author KID / @blueberrystream
 */
public class StringInLoop {
	public static void main(final String[] args) {
		final long loopCount = Integer.MAX_VALUE * 2L;
		final String test = "test";

		// ループあたため？
		for (long i = 0; i < loopCount; i++) {
			final String string = test;
		}

		// ループの中バージョン
		final long start1 = System.currentTimeMillis();
		for (long i = 0; i < loopCount; i++) {
			final String string = test;
		}
		final long end1 = System.currentTimeMillis();

		// ループの外バージョン
		final long start2 = System.currentTimeMillis();
		String string = null;
		for (long i = 0; i < loopCount; i++) {
			string = test;
		}
		final long end2 = System.currentTimeMillis();

		System.out.format("試行回数: %d%n", loopCount);
		System.out.format("ループの中: %dms%n", end1 - start1);
		System.out.format("ループの外: %dms%n", end2 - start2);
	}

}
