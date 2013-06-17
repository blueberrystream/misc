/**
 * 祓ったーが複数のキーワードを含むものをどう処理するか
 * 
 * @author KID / @blueberrystream
 */
public class MultiKeyword {
	/** お祓い対象キーワード */
	private static final String[] TARGET_KEYWORDS = {
			"を祓いたまえ", "を祓い給え", "円払ったー", "はらへったー", "祓ったーかわいいよ祓ったー", "はらったーかわいいよはらったー", "祓ったー可愛いよ祓ったー", "はらったー可愛いよはらったー", "@haratter おみくじ"
	};

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final String target = "@haratter おみくじ100円払ったーけどはらへったー取り敢えずはらったーかわいいよはらったーしながらみんなを祓い給えー。";

		/* 反応キーワードを探す */
		int keyword;
		int index = -1;
		for (keyword = 0; keyword < TARGET_KEYWORDS.length; keyword++) {
			if (target.contains(TARGET_KEYWORDS[keyword])) {
				index = target.indexOf(TARGET_KEYWORDS[keyword]);
				break;
			}
		}
		// もっかい反応キーワードを探す
		boolean multiKeyword = false;
		for (int i = 0; i < TARGET_KEYWORDS.length; i++) {
			// 既に検知したキーワードを飛ばす
			if (i == keyword) {
				continue;
			}
			if (target.contains(TARGET_KEYWORDS[i])) {
				multiKeyword = true;
				break;
			}
		}

		System.out.println(multiKeyword);
	}
}
