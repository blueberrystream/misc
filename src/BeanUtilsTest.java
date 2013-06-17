import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * {@link org.apache.commons.beanutils.BeanUtils#copyProperties(Object, Object)} で型の違う同名プロパティがあった場合どうなるのか
 * 
 * @author KID / @blueberrystream
 */
public class BeanUtilsTest {
	public static final void main(final String... args) {
		final BeanUtilsTestPOJO1 bean1 = new BeanUtilsTestPOJO1();
		final BeanUtilsTestPOJO2 bean2 = new BeanUtilsTestPOJO2();

		final List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		final Map<String, String> map1 = new HashMap<String, String>();
		final Map<String, String> map2 = new HashMap<String, String>();
		map1.put("k11", "v11");
		map1.put("k12", "v12");
		map1.put("k13", "v13");
		map2.put("k11", "v11");
		map2.put("k12", "v12");
		map2.put("k13", "v13");
		list.add(map1);
		list.add(map2);
		bean1.setList(list);

		try {
			BeanUtils.copyProperties(bean2, bean1);
		} catch (final IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (final InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (final NoClassDefFoundError e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}