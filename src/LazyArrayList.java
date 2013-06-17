import java.util.ArrayList;

/**
 * 遅延リストの実装
 * 
 * @author KID / @blueberrystream
 * @param <E>
 *            リスト要素
 */
public class LazyArrayList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 9073662387787069040L;
	private final E defaultElement;

	public LazyArrayList(final E defaultElement) {
		super();
		this.defaultElement = defaultElement;
	}

	@Override
	public E get(final int i) {
		// アクセスしようとしたインデックスに要素がない場合
		if (size() - 1 < i) {
			while (size() - 1 < i) {
				// アクセスインデックスまで要素追加
				add(defaultElement);
			}

			return defaultElement;
		}
		// 普通に返す
		return super.get(i);
	}

	@Override
	public E set(final int i, final E element) {
		// アクセスしようとしたインデックス-1に要素がない場合
		if (size() - 1 < i - 1) {
			while (size() - 1 < i - 1) {
				// アクセスインデックス-1まで要素追加
				add(defaultElement);
			}
			add(element);

			return element;
		}
		// 普通にやる
		return super.set(i, element);
	}
}
