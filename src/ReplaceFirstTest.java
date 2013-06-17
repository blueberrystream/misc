/**
 * {@link String#replaceFirst(String, String)}のテスト
 * 
 * @author KID / @blueberrystream
 */
public class ReplaceFirstTest {

	public static void main(final String[] args) {
		final String profileImageUrl = "http://a3.afralkjhdgafr/faskjfkladsf/asdfasfoawsfds/dasfs_normal.jpg._normal.jpg";
		System.out.println(profileImageUrl.replaceFirst("_normal\\.(jpeg|jpg|gif|png)$", "_mini\\.$1"));
	}
}
