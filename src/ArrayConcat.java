/**
 * 配列のコピー
 * 
 * @author KID / @blueberrystream
 */
public class ArrayConcat {
	public static final void main(final String... args) {
		final int[] array1 = new int[] {
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		};
		final int[] array2 = new int[] {
				9, 8, 7, 4, 5, 6, 3, 2, 1, 0
		};
		final int[] result = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);

		dumpArray(array1);
		dumpArray(array2);
		dumpArray(result);
	}

	private static void dumpArray(final int[] array) {
		for (final int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
