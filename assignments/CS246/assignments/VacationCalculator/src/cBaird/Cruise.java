package cBaird;

public class Cruise implements cBaird.Expense {
	public Cruise(cBaird.Destination destination) {
		this.destination = destination;
	}

	private cBaird.Destination destination;
	public float getCost() {
		float cost = 0;
		switch (destination) {
			case Mexico:
				cost = 1000;
				break;
			case Europe:
				cost = 2000;
				break;
			case Japan:
				cost = 30000;
				break;
		}
		return cost;
	}
}
