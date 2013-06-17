import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * JDK標準のZlibを使ってみる
 * 
 * @author KID / @blueberrystream
 */
public class ZlibTest {

	/**
	 * @param args
	 */
	public static void main(final String[] args) throws Exception {
		// Encode a String into bytes
		final String inputString = "あいうあいうあいうあああああああああ";
		System.out.println(inputString);
		final byte[] original = inputString.getBytes("UTF-8");

		// Compress the bytes
		final byte[] compressed = new byte[100];
		final Deflater compresser = new Deflater();
		compresser.setInput(original);
		compresser.finish();
		final int compressedDataLength = compresser.deflate(compressed);

		// Decompress the bytes
		final Inflater decompresser = new Inflater();
		decompresser.setInput(compressed, 0, compressedDataLength);
		final byte[] decompressed = new byte[100];
		final int resultLength = decompresser.inflate(decompressed);
		decompresser.end();

		// Decode the bytes into a String
		final String outputString = new String(decompressed, 0, resultLength, "UTF-8");

		System.out.println(outputString);
	}
}
