public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String bagType, int waitTime) {	// implements abstract method and displays a specific message

		super(bagType, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}							// example
}
