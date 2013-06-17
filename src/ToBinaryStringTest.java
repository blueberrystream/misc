/**
 * {@link Integer#toBinaryString(int)}の使い方
 * 
 * @author KID / @blueberrystream
 */
public class ToBinaryStringTest {
	public static final void main(final String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println(toBinaryStringOf8Digits(i));
			System.out.println(toReverseBinaryStringOf8Digits(i));
		}
	}

	private static final String toBinaryStringOf8Digits(final int i) {
		final StringBuilder b = new StringBuilder(16);
		// あらかじめ8～2桁目を0にしておく
		b.append("0000000");
		// 目的の数字をビット文字列にして追加
		b.append(Integer.toBinaryString(i));
		// 下8桁を返す
		return b.substring(b.length() - 8, b.length());
	}

	private static final String toReverseBinaryStringOf8Digits(final int i) {
		final StringBuilder b = new StringBuilder(16);
		// あらかじめ8～2桁目を0にしておく
		b.append("0000000");
		// 目的の数字をビット文字列にして追加
		b.append(Integer.toBinaryString(i));
		// ひっくり返す
		b.reverse();
		// 上8桁を返す
		return b.substring(0, 8);
	}
}
