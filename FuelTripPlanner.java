public class FuelTripPlanner {
	public static void main(String[] args) {
		int backRoadMiles = 25, highwayMiles = 60, hillyMiles = 10; 
		int currentGasGallons = 20, numberOfPeople = 5;
		double gallonsPerPerson = 0;

		gallonsPerPerson += 2*backRoadMiles;
		gallonsPerPerson += 1*highwayMiles;
		gallonsPerPerson += 5*hillyMiles;
		gallonsPerPerson -= currentGasGallons;
		gallonsPerPerson /= numberOfPeople;

		System.out.printf("Each passenger is responsible for %.1f gallons of gas.\n", gallonsPerPerson);
	}
}