import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBag implements IBag {	// random surprises

	private static final Random random = new Random();

	private List<ISurprise> surprises = new ArrayList<>();

	@Override
	public void put(ISurprise newSurprise) {
		surprises.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			surprises.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {

		int randomIndex = random.nextInt(surprises.size());
		ISurprise iSurprise = surprises.get(randomIndex);
		surprises.remove(randomIndex);

		return iSurprise;
	}

	@Override
	public boolean isEmpty() {

		return surprises.isEmpty();
	}

	@Override
	public int size() {

		return surprises.size();
	}
}

