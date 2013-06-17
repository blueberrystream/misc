import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.arnx.jsonic.JSON;
import net.arnx.jsonic.JSONException;

/**
 * JSONICを試してみる
 * 
 * @author KID / @blueberrystream
 */
public class JsonicTest {
	public static final void main(final String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "value");
		map.put("key2", Boolean.TRUE);
		map.put("key3", null);
		map.put("key4", null);

		System.out.println(JSON.encode(map));
		// System.out.println(JSON.encode(map, true));

		String json = "{\"key3\":null,\"key4\":null,\"key2\":\"-1\",\"key1\":\"value\"}";
		JsonicTestPOJO pojo = JSON.decode(json, JsonicTestPOJO.class);
		System.out.println(pojo);

		json = "{\"key3\":null,\"key4\":true,\"key2\":\"-1\",\"key1\":\"value\",\"違う名前にする\":\"違う名前のところの値\"}";
		pojo = JSON.decode(json, JsonicTestPOJO.class);
		System.out.println(pojo);

		final JsonicTestPOJO pojo2 = new JsonicTestPOJO();
		pojo2.setKey1("key1_value");
		pojo2.setKey2(null);
		pojo2.setKey3(200);
		pojo2.setKey4(true);
		pojo2.key5 = "これでどや";
		System.out.println(JSON.encode(pojo2));

		map = JSON.decode(json);
		for (final Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// map = JSON.decode((String) null); // -> java.lang.NullPointerException
		map = JSON.decode(""); // 通る
		map = JSON.decode("{}");

		json = "{\"key3\":,\"key4\":null,\"key2\":\"-1\",\"key1\":\"value\"}";
		map = JSON.decode(json);
		for (final Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		final JSON jsonic = new JSON(JSON.Mode.STRICT);
		try {
			map = jsonic.parse(""); // -> net.arnx.jsonic.JSONException: 1: 入力が空です。
		} catch (final JSONException e) {
			e.printStackTrace();
		}
		map = jsonic.parse("{}");

		json = "{\"key3\":null,\"key4\":null,\"key2\":\"-1\",\"key1\":\"value\"}";
		map = jsonic.parse(json);
	}
}
