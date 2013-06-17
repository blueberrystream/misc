import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ArrayListをとある個数ずつに分割して配列にする時間を計測する
 * 
 * @author KID / @blueberrystream
 */
public class ArrayListToSplitedArray {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 10000000; i++) {
			intList.add(new Random().nextInt());
		}
		System.out.println(intList.size());

		final long start = System.currentTimeMillis();
		final int SPLIT_COUNT = 100;
		final int listSize = intList.size() / SPLIT_COUNT + (intList.size() % SPLIT_COUNT == 0 ? 0 : 1);
		final List<int[]> arrayList = new ArrayList<int[]>();
		for (int i = 0; i < listSize; i++) {
			final int from = i * SPLIT_COUNT;
			int to = (i + 1) * SPLIT_COUNT;
			if (intList.size() < to) {
				to = intList.size();
			}
			arrayList.add(list2array(intList.subList(from, to)));
		}
		final long end = System.currentTimeMillis();

		for (final int[] array : arrayList) {
			System.out.println(array.length);
		}

		System.out.println(arrayList.size() + "分割");
		System.out.println(end - start + "ms");
	}

	private static int[] list2array(final List<Integer> list) {
		final int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		return array;
	}
}
