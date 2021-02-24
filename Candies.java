import java.util.Arrays;
import java.util.List;
import java.util.Random;

// this class represents a type of surprise in which the person will receive a random number of candies of a certain type

/*******  The class constructor will receive the number of candies and their type. 
 *  When executing the surprise, a relevant message will be displayed, depending on the internal state of the surprise object. *******/

public class Candies implements ISurprise {

	private static final Random random = new Random();
	private static final List<String> candyTypes = Arrays.asList("chocolate", "jelly", "fruits", "vanilla");

	private int amount;
	private String type;

	public Candies(int amount, String type) {

		this.amount = amount;
		this.type = type;
	}

	public static ISurprise generate() {		//  this method will create the surprise

		String randomCandyType = candyTypes.get(random.nextInt(4));
		int randomCandiesAmount = random.nextInt(10);
		while (randomCandiesAmount <= 0) {
			randomCandiesAmount = random.nextInt(10);
		}

		return new Candies(randomCandiesAmount, randomCandyType);

	}

	public int getAmount() {		// returns amount of candies for surprise

		return amount;
	}

	public void setAmount(int amount) {    // sets the number of candies for surprise

		this.amount = amount;
	}

	public String getType() {    	// returns type of candies for surprise

		return type;
	}

	public void setType(String type) {			// sets the type of candies for surprise

		this.type = type;
	}

	@Override
	public void enjoy() {

		System.out.println("Good child! Santa gotcha " + amount + " " + type + "s only for you");
	}
}
