import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class GatherSurprises {  // this class generates random surprises

	private static final Random random = new Random();
	private static final List<String> surpriseTypes = Arrays.asList("Candies", "FortuneCookie", "MinionToy");

	private GatherSurprises() {	}

	public static List<ISurprise> gather(int n) {

		List<ISurprise> surprises = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			ISurprise surprise = createRandomSurprise();
			surprises.add(surprise);
		}

		return surprises;
	}

	public static ISurprise gather() {

		return createRandomSurprise();
	}

	private static ISurprise createRandomSurprise() {

		ISurprise surprise = null;
		String type = surpriseTypes.get(random.nextInt(3));

		if (type.equals("Candies")) {
			surprise = Candies.generate();
		} else if (type.equals("FortuneCookie")) {
			surprise = FortuneCookie.generate();
		} else if (type.equals("MinionToy")){
			surprise = MinionToy.generate();
		}
		return surprise;
	}
}
