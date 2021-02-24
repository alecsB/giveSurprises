import java.util.Arrays;
import java.util.List;
import java.util.Random;

// ___ class Fortune Cookie represents a type of surprise in which the person will receive a symbolic message ___ 

/* The class receives the message (i.e. String) when constructing the object. It will be displayed at the output when the "surprise" opens.*/

public class FortuneCookie implements ISurprise {   

	private static final Random random = new Random();
	private static final List<String> zicale = Arrays.asList("..A bad workman always blames his tools..", 
															 "..A bird in hand is worth two in the bush..", 
															 "..A chain is only as strong as its weakest link..", 
															 "..Actions speak louder than words..",
															 "..Adversity and loss make a man wise..",
															 "..A journey of thousand miles begins with a single step..",
															 "..Among the blind the one-eyed man is king..",
															 "..Appearances can be deceptive..",
															 "..Beauty is in the eye of the beholder..");

	private String message;

	public FortuneCookie(String message) {

		this.message = message;
	}

	public static ISurprise generate() {   //  this method will create the surprise

		int randomNumber = random.nextInt(4);
		String randomZicala = zicale.get(randomNumber);

		return new FortuneCookie(randomZicala);
	}

	public String getMessage() {		// returns message from list

		return message;
	}

	public void setMessage(String message) {	// sets message from List

		this.message = message;
	}

	@Override
	public void enjoy() {

		System.out.println(message);
	}
}
