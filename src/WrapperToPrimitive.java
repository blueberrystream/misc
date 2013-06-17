import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections.primitives.ArrayLongList;
import org.apache.commons.collections.primitives.LongList;
import org.apache.commons.lang3.ArrayUtils;

/**
 * プリミティブラッパークラスのListからプリミティブな配列にする方法の時間比較
 * 
 * @author KID / @blueberrystream
 */
public class WrapperToPrimitive {
	public static void main(final String[] args) {
		final int size = 10000;
		final Random random = new Random();

		System.out.println("LongList#toarray()する方法");
		final LongList longlist = new ArrayLongList();
		for (int test = 0; test < 10; test++) {
			longlist.clear();
			for (int i = 0; i < size; i++) {
				longlist.add(random.nextLong());
			}
			final long start = System.currentTimeMillis();
			final long[] array = longlist.toArray();
			final long finish = System.currentTimeMillis();
			System.out.println(test + "回目: " + (finish - start) + "ms");
		}

		System.out.println("List<Long>をtoArrayしてさらにtoPrimitiveする");
		final List<Long> listLong = new LinkedList<Long>();
		for (int test = 0; test < 10; test++) {
			listLong.clear();
			for (int i = 0; i < size; i++) {
				listLong.add(random.nextLong());
			}
			final long start = System.currentTimeMillis();
			final Long[] array = listLong.toArray(new Long[listLong.size()]);
			final long[] array_ = ArrayUtils.toPrimitive(array, 0);
			final long finish = System.currentTimeMillis();
			System.out.println(test + "回目: " + (finish - start) + "ms");
		}
	}
}
