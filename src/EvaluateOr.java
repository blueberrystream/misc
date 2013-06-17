/**
 * 条件式をorでつないで先になったほうがtrueになったらそこで評価をやめるかどうか
 * 
 * @author KID / @blueberrystream
 */
public class EvaluateOr {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final String string = null;
		System.out.println(string == null || string.isEmpty());
		// System.out.println(string.isEmpty() || string == null);
	}
}
