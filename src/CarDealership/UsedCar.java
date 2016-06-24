package CarDealership;

public class UsedCar extends Car {
	private int carMiles;

	public UsedCar(String make, String model, int year, double price,
			int carMiles) {
		super(make, model, year, price);
		this.carMiles = carMiles;

	}

	public int getCarMiles() {
		return carMiles;
	}

	public void setCarMiles(int carMiles) {
		this.carMiles = carMiles;
	}

}
