
public class BagFactoryArrayList implements IBagFactory {

	private static BagFactoryArrayList instance = null;

	private BagFactoryArrayList() {

	}

	public static BagFactoryArrayList getInstance() {

		if (instance == null) {
			instance = new BagFactoryArrayList();
		}
		return instance;
	}

	@Override
	public IBag makeBag(String type) {

		switch (type) {
			case "RANDOM":
				return new RandomBag();
			case "FIFO":
				return new FIFOBag();
			case "LIFO":
				return new LIFOBag();
			default:
				return null;
		}
	}
}
