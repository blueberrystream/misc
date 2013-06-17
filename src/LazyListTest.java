/**
 * 遅延リストのテスト
 * 
 * @author KID / @blueberrystream
 */
public class LazyListTest {

	public static void main(final String[] args) {
		// 要素数ゼロのリスト
		final LazyArrayList<String> lazyList = new LazyArrayList<String>("default");
		System.out.println(lazyList.size());

		// いきなり4番目を取得→普通なら例外送出
		System.out.println(lazyList.get(4));
		System.out.println(lazyList.size());
		// いきなり10番目に設定→普通なら例外送出
		System.out.println(lazyList.set(10, "10番目"));
		System.out.println(lazyList.size());

		// 普通に9番目を取得
		System.out.println(lazyList.get(9));

		// 中身全部
		for (int i = 0; i < lazyList.size(); i++) {
			System.out.println(lazyList.get(i));
		}
	}

}
