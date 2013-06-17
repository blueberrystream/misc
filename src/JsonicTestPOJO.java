import net.arnx.jsonic.JSONHint;

/**
 * @author KID / @blueberrystream
 */
public class JsonicTestPOJO {
	private String key1;
	private Boolean key2;
	private int key3;
	private boolean key4;
	@JSONHint(name = "違う名前にする")
	public String key5;

	/**
	 * key1を取得します。
	 * 
	 * @return key1
	 */
	public String getKey1() {
		return key1;
	}

	/**
	 * key1を設定します。
	 * 
	 * @param key1
	 *            key1
	 */
	public void setKey1(final String key1) {
		this.key1 = key1;
	}

	/**
	 * key2を取得します。
	 * 
	 * @return key2
	 */
	public Boolean getKey2() {
		return key2;
	}

	/**
	 * key2を設定します。
	 * 
	 * @param key2
	 *            key2
	 */
	public void setKey2(final Boolean key2) {
		this.key2 = key2;
	}

	/**
	 * key3を取得します。
	 * 
	 * @return key3
	 */
	public int getKey3() {
		return key3;
	}

	/**
	 * key3を設定します。
	 * 
	 * @param key3
	 *            key3
	 */
	public void setKey3(final int key3) {
		this.key3 = key3;
	}

	/**
	 * @return key4
	 */
	public boolean isKey4() {
		return key4;
	}

	/**
	 * @param key4
	 *            セットする key4
	 */
	public void setKey4(final boolean key4) {
		this.key4 = key4;
	}

	@Override
	public String toString() {
		return "key1: " + key1 + ", key2: " + key2 + ", key3: " + key3 + ", key4: " + key4 + ", key5: " + key5;
	}
}
