import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KID / @blueberrystream
 */
public class MultidimensionalArrayTest {
	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(final String[] args) throws UnsupportedEncodingException {
		// 配列の中に入る配列のもとになる文字列
		final String[] strings = new String[] {
				"test", "test2", "はげ", "foobar", "ほげほげ"
		};
		// 配列の中に入る配列をまとめるリスト
		final List<byte[]> byteArrayList = new ArrayList<byte[]>();
		// もととなる文字列をbyte配列にしてリストに追加
		for (final String string : strings) {
			byteArrayList.add(string.getBytes("UTF-8"));
		}
		// リストを配列にする
		final byte[][] byteArrayArray = byteArrayList.toArray(new byte[0][0]);

		// 配列の中に入った配列の要素数を出力してみる
		for (final byte[] byteArray : byteArrayArray) {
			System.out.println(byteArray.length);
		}
	}
}
