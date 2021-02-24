import java.util.ArrayList;
import java.util.List;

public class FIFOBag implements IBag {			// first surprise in first surprise out

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

		ISurprise iSurprise = surprises.get(0);
		surprises.remove(0);

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
