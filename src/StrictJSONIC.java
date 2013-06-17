import net.arnx.jsonic.JSON;

public class StrictJSONIC extends JSON {
	public StrictJSONIC() {
		setMode(Mode.STRICT);
	}

	public StrictJSONIC(final int maxDepth) {
		super(maxDepth);
		setMode(Mode.STRICT);
	}
}
