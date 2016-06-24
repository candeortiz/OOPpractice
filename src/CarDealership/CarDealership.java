package CarDealership;

import java.util.ArrayList;

public class CarDealership {
	public static void main(String[] args) {
		// Hier wird eine ArrayList generiert mit alle Felder Daten , die in der
		// Car Klasse deklariert sind
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Ford", "Explorer", 2016, 27999.99));
		carList.add(new Car("Chevy", "Tahoe", 2016, 31999.99));
		carList.add(new UsedCar("Pontiac", "Aztek", 2003, 2999.99, 235000));
		carList.add(new UsedCar("Saturn", "Vue", 2001, 1999.99, 150000));

		carList.get(1).setCarMake("Fiat");
		carList.get(1).setCarModel("Spyder");
		carList.get(1).setCarYear(2017);
		carList.get(1).setCarPrice(29999.50);

		// Mit der For Loop geht druch jede einzelne Auto in der Liste

		for (Car c : carList) {
			if (c instanceof UsedCar) {
				System.out.print("USED: ");
				System.out.print(c.getCarMake() + "\t" + c.getCarModel() + "\t"
						+ c.getCarYear() + "\t($" + c.getCarPrice() + ")");
				// Casting ((UsedCar)c) um das gebrauchte Auto in einem zu
				// konvertieren und somit den extra getCarMiles Methode lesen zu
				// können.
				System.out.print("\t" + ((UsedCar) c).getCarMiles());
			} else {
				System.out.print("NEW: ");
				System.out.print(c.getCarMake() + "\t" + c.getCarModel() + "\t"
						+ c.getCarYear() + "\t($" + c.getCarPrice() + ")");
			}

			System.out.println();
		}
	}
}
