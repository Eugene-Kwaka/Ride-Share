/**
 *	Operations for our ride sharing application
 *
 * TODO Requirements: 
 * 1. Implement the process method, which creates a new Ride and returns it. 
 *    You need to create a new Ride object, set the driver and passenger fields,
 *    and then return the Ride object.
 * 2. Ride cannot have more than 4 passengers. If ride has more than 4 passengers, throw InvalidRideException  
	  Ride must have a driver and at least 1 passenger. Hint: if driver is null, a driver hasn't been assigned. 
      If the ride does not have a driver, throw InvalidRideException. If the ride has less than 1 passenger, throw InvalidRideException. 
	 
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

        //Optionally, to check if everything is set correctly, you might print some details
        System.out.println("Driver: " + ride.getDriver().getName());
        for (Passenger passenger : ride.getPassengers()) {
            System.out.println("Passenger: " + passenger.getName());
        }

        
    }

	public Ride process(Driver driver, Passenger[] passengers) {
        Ride ride = new Ride(driver,passengers);
		return ride; // create a Ride and return it
	}

    public void validate (Ride ride) throws InvalidRideException{
        if (ride.getPassengers() == null || ride.getPassengers().length > 4 || ride.getPassengers().length <= 0){
            throw new InvalidRideException();
        }


        if (ride.getDriver() == null || ride == null){
            throw new InvalidRideException();
        }
        
        System.out.println("Ride is valid");
	}
    

    /**
	 * Return the number of passengers with 
	 * accountType = BUSINESS.
	 * 
	 * Hint: Use the equals method in String class
	 * to compare Strings.
	 * 
	 * @param ride
	 * @return
	 */
    public int business (Ride ride){
        int count = 0;
        for (Passenger passenger : ride.getPassengers()){
            if ("BUSINESS".equals(passenger.getAccountType())) {
                count++;
            }
        }
        return count;
    }
	
}
