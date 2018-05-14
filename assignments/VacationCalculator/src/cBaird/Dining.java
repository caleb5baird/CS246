package cBaird;

public class Dining implements cBaird.Expense {
	public Dining(Destination destination) {
		this.destination = destination;
	}

	private Destination destination;
	private int days;

	public float getCost() {
		return 0;
	}
}
