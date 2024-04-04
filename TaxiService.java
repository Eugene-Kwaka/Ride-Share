/**
 *	Operations for our ride sharing application
 *
 * TODO Requirements: 
 * 1. Implement the process method, which creates a new Ride and returns it. 
 *    You need to create a new Ride object, set the driver and passenger fields,
 *    and then return the Ride object.
 * 
 */
public class TaxiService {

    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        Driver driver = new Driver();
        driver.setName("Mazda");
        Passenger[] passengers = new Passenger[2];
        passengers[0] = new Passenger();
        passengers[1] = new Passenger();

        passengers[0].setName("Kwaka");
        passengers[1].setName("Kirima");
        
        // Correct way to call process and pass the necessary objects
        Ride ride = taxiService.process(driver, passengers);

        // Optionally, to check if everything is set correctly, you might print some details
        System.out.println("Driver: " + ride.getDriver().getName());
        for (Passenger passenger : ride.getPassengers()) {
            System.out.println("Passenger: " + passenger.getName());
        }

        
    }

	public Ride process(Driver driver, Passenger[] passengers) {
        
        Ride ride = new Ride(driver,passengers);
        
		return ride; // create a Ride and return it
	}
	
}
