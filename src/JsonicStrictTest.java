import java.util.Map;

import net.arnx.jsonic.JSON;
import net.arnx.jsonic.JSONException;

/**
 * @author KID / @blueberrystream
 */
public class JsonicStrictTest {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		new JsonicStrictTest().process();
	}

	private void process() {
		Map<String, Object> map = null;
		map = JSON.decode(""); // STRICTじゃないので通過する

		try {
			map = StrictJSONIC.decode(""); // -> net.arnx.jsonic.JSONException: 1: 入力が空です。
		} catch (final JSONException e) {
			e.printStackTrace();
		}
		map = StrictJSONIC.decode("{}");
		map = StrictJSONIC.decode("{\"key3\":null,\"key4\":null,\"key2\":\"-1\",\"key1\":\"value\"}");

		JSON.prototype = StrictJSONIC.class;
		try {
			map = JSON.decode(""); // -> net.arnx.jsonic.JSONException: 1: 入力が空です。
		} catch (final JSONException e) {
			e.printStackTrace();
		}
		map = JSON.decode("{}");
		map = JSON.decode("{\"key3\":null,\"key4\":null,\"key2\":\"-1\",\"key1\":\"value\"}");

		final JSON json = new JSON();
		map = json.parse(""); // これは大丈夫
	}
}
