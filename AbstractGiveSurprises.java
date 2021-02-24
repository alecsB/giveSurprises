import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

	private IBag bag;
	private int waitTime;  

	public AbstractGiveSurprises(String bagType, int waitTime) {  // constructor

		switch (bagType) {
			case "RANDOM":
				this.bag = new RandomBag();
				break;
			case "FIFO":
				this.bag = new FIFOBag();
				break;
			case "LIFO":
				this.bag = new LIFOBag();
				break;
			default:
				this.bag = null;
		}
		this.waitTime = waitTime;
	}

	public IBag getBag() {		// returns bag type

		return bag;
	}

	public void setBag(IBag bag) {		// sets bag type

		this.bag = bag;
	}

	public int getWaitTime() {		// returns time set for surprise

		return waitTime;
	}

	public void setWaitTime(int waitTime) {  // sets wait time for surprise

		this.waitTime = waitTime;
	}

	abstract void giveWithPassion();	// represents an action that will be performed after each surprise (eg: applause, a hug, etc.).


	public void put(ISurprise newSurprise) {  // adds mew surprise in container

		bag.put(newSurprise);
	}

	public void put(IBag surprises) {	// moves all surprises from the parameter container to this container

		while (!surprises.isEmpty()) {
			bag.put(surprises.takeOut());
		}
	}

	public void give() {		// gives a surprise
		bag.takeOut().enjoy();
		giveWithPassion();
	}

	public void giveAll() {		// gives all surprises from bag in order

		while (!bag.isEmpty()) {
			bag.takeOut().enjoy();
			giveWithPassion();
			sleep();
		}
	}

	public boolean isEmpty() {  	// returns true if empty
									//         false if not
		return bag.isEmpty();
	}

	private void sleep() {  // method used for setting time between surprises

		try {
			TimeUnit.SECONDS.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}