/**
 * {@link String#split(String)} でsplitterがない場合どうなる？
 * 
 * @author KID / @blueberrystream
 */
public class StringSplitTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		String s = "s1:s2";
		String[] ss = s.split(":");
		System.out.println(s);
		System.out.println(ss[0]);
		System.out.println(ss[1]);

		s = "s1s2";
		ss = s.split(":");
		System.out.println(s);
		System.out.println(ss[0]);
		System.out.println(ss[1]);
	}
}
