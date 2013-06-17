import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 最終行を超えて{@link BufferedReader#readLine()}したときどうなるか
 * 
 * @author KID / @blueberrystream
 */
public class ReadLine {
	private static final File ACCOUNT_FILE = new File("TumblingFolder.act");

	public static void main(final String[] args) {
		BufferedReader reader = null;
		String _wait = null;
		final String _acceptableExtension = null;
		try {
			reader = new BufferedReader(new FileReader(ACCOUNT_FILE));
			_wait = reader.readLine();
			_wait = reader.readLine();
			_wait = reader.readLine();
			_wait = reader.readLine();
			_wait = reader.readLine();
			_wait = reader.readLine();
		} catch (final FileNotFoundException e) {
			System.out.println("アカウント情報ファイルがないからだーめ！");
			return;
		} catch (final IOException e) {
			System.out.println("アカウント情報ファイルが読み込めないからだーめ！");
			return;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (final IOException e) {
					// do nothing
				} finally {
					reader = null;
				}
			}
		}
	}
}
