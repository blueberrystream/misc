/**
 * @author KID / @blueberrystream
 */
public class CollectionElementReferencePOJO {
	private String name;
	private String message;

	public CollectionElementReferencePOJO() {
		name = "";
		message = "";
	}

	public CollectionElementReferencePOJO(final String name, final String message) {
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return name + ": " + message;
	}
}