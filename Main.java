import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lets give some surprises !!!");
		System.out.println();
// example for RANDOM BAG
		System.out.println(">>>>> RANDOM <<<<<");
		System.out.println();
		AbstractGiveSurprises giveSurpriseAndApplause = new GiveSurpriseAndApplause("RANDOM", 1);

		ISurprise randomSurprise = GatherSurprises.gather();
		giveSurpriseAndApplause.put(randomSurprise);
		giveSurpriseAndApplause.give();
	
// example for FIFO bag		
		System.out.println();
		System.out.println(">>>>> FIFO <<<<<"); 
		System.out.println();
		
		IBagFactory bagFactory = BagFactoryArrayList.getInstance();
		IBag fifoBag = bagFactory.makeBag("FIFO");
		List<ISurprise> randomSurprises = GatherSurprises.gather(5);
		for (ISurprise surprise : randomSurprises) {
			fifoBag.put(surprise);
		}

		AbstractGiveSurprises giveSurpriseAndSing = new GiveSurpriseAndSing("FIFO", 1);
		giveSurpriseAndSing.put(fifoBag);
		giveSurpriseAndSing.giveAll();
		
// example for LIFO bag		
		System.out.println();
		System.out.println(">>>>> LIFO <<<<<");
		System.out.println();
		
		IBagFactory bagFactory2 = BagFactoryArrayList.getInstance();
		IBag lifoBag = bagFactory2.makeBag("LIFO");
		List<ISurprise> randomSurprises2 = GatherSurprises.gather(5);
		for (ISurprise surprise2 : randomSurprises2) {
			lifoBag.put(surprise2);
		}
		
		AbstractGiveSurprises giveSurpriseAndHug = new GiveSurpriseAndHug("LIFO", 1);
		giveSurpriseAndHug.put(lifoBag);
		giveSurpriseAndHug.giveAll();

	}

}


