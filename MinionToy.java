import java.util.Arrays;
import java.util.List;

// class MinionToy is another type of surprise in which the person will receive a Minion toy.

/********  The class receives the name of the minion when creating objects. 
 *  When the surprise is opened, a suggestive message will be displayed at the output, which includes the details of the received toy.*******/

public class MinionToy implements ISurprise{

	private static final List<String> names = Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim");
	private static int lastNameUsedIndex = 0;

	private String name;

	public MinionToy(String name) {

		this.name = name;
	}

	public static ISurprise generate() {       //  this method will create the surprise

		String minionName = names.get(lastNameUsedIndex);
		lastNameUsedIndex++;

		return new MinionToy(minionName);
	}

	public String getName() {   // return name of minion for surprise

		return name;
	}

	public void setName(String name) {			// sets name for minion 

		this.name = name;
	}

	@Override
	public void enjoy() {

		System.out.println("Meet "  + name + ". It is your new toy friend!");
	}
}
