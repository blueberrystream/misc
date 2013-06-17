import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正規表現のマッチングテスト
 * 
 * @author KID / @blueberrystream
 */
public class RegexpMatcher {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		/*
		 * String[] targets = { "はらったーかわいいよはらったー", "はらったー可愛いよはらったー", "はらったーかわいいよ祓ったー", "はらったー可愛いよ祓ったー",
		 * "祓ったーかわいいよはらったー", "祓ったー可愛いよはらったー", "祓ったーかわいいよ祓ったー", "祓ったー可愛いよ祓ったー", "祓ったー可愛いよyo祓ったー", };
		 * 
		 * Matcher matcher = null; for (String target: targets) { matcher =
		 * Pattern.compile(".*(はら|祓)ったー(かわい|可愛)いよ(はら|祓)ったー.*").matcher(target); if (matcher.matches()) {
		 * System.out.println(target + ": match!!"); } else { System.out.println(target + ": unmatch!!"); } }
		 */
		final Matcher matcher = Pattern.compile("@haratter (.*)って呼んで.*").matcher("@haratter ぶるべりって呼んで！");
		final Matcher matcher2 = Pattern.compile("^@haratter /(active|inactive)$").matcher("@haratter /active");
		final String newNickname = null;
		if (matcher.matches()) {
			System.out.println(matcher.group(1));
		}
		System.out.println(matcher2.matches());
	}

}
