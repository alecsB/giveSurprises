import java.util.ArrayList;
import java.util.List;

public class LIFOBag implements IBag {	// last surprise in first surprise out

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

		int lastIndex = surprises.size() - 1;
		ISurprise iSurprise = surprises.get(lastIndex);
		surprises.remove(lastIndex);

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

