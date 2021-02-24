public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	public GiveSurpriseAndSing(String bagType, int waitTime) { // implements abstract method and displays specific message

		super(bagType, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}								// example
}
