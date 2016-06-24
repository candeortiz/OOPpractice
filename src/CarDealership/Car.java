package CarDealership;

public class Car {
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;

	// constuctor
	public Car(String make, String model, int year, double price) {
		this.carMake = make;
		this.carModel = model;
		this.carYear = year;
		this.carPrice = price;

	}

	public String getCarMake() {
		return carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

}
