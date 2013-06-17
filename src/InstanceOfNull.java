/**
 * instanceofにnullチェックは必要ないのか
 * 
 * @author KID / @blueberrystream
 */
public class InstanceOfNull {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Object obj = null;
		String str = null;
		if (obj instanceof String) {
			str = (String) obj;
		}

		System.out.println(str);
	}
}
