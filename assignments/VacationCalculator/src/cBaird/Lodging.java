package cBaird;

public class Lodging implements Expense {
	public Lodging(Destination destination) {
		this.destination = destination;
	}

	private Destination destination;
	private int days;
	public float getCost() {return 0;}
}
