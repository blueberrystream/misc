import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections.primitives.ArrayLongList;
import org.apache.commons.collections.primitives.LongList;
import org.apache.commons.lang3.ArrayUtils;

/**
 * 配列を分割する
 * 
 * @author KID / @blueberrystream
 */
public class ArraySplit {
	public static final void main(final String[] args) {
		final LongList list = new ArrayLongList();
		final Random random = new Random();
		final int arraySize = 5000; // random.nextInt(100);
		System.out.println("array size: " + arraySize);
		// for (int i = 0; i < arraySize; i++) {
		// final long l = random.nextLong();
		// list.add(l);
		// System.out.print(l + ", ");
		// }
		// System.out.println();

		for (int i = 0; i < 10; i++) {
			list.clear();
			for (int j = 0; j < arraySize; j++) {
				final long l = random.nextLong();
				list.add(l);
				// System.out.print(l + ", ");
			}

			final long start = System.currentTimeMillis();
			final List<long[]> splited = split(list.toArray(), 100);
			final long finish = System.currentTimeMillis();
			System.out.println(i + "回目: " + (finish - start) + "ms");
		}

		// final ListIterator<long[]> it = splited.listIterator();
		// while (it.hasNext()) {
		// final long[] array = it.next();
		// System.out.println("size: " + array.length);
		// for (final long l : array) {
		// System.out.print(l + ", ");
		// }
		// System.out.println();
		// }
	}

	public static final List<long[]> split(final long[] array, final int count) {
		final List<long[]> list = new LinkedList<long[]>();
		final int listSize = array.length / count + (array.length % count == 0 ? 0 : 1);
		for (int i = 0; i < listSize; i++) {
			final int from = count * i;
			int to = from + count;
			if (array.length < to) {
				to = array.length;
			}
			list.add(ArrayUtils.subarray(array, from, to));
		}

		return list;
	}
}
