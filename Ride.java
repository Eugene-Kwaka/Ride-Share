/**
 *	Domain object for a ride in our taxi service.
 *  There is nothing required to do in this class.
 *  However, a constructor that takes driver and passengers 
 *  might be useful for the requirement in TaxiService..
 */
public class Ride {

	private Driver driver;
	private Passenger[] passengers;
	private boolean completed;
	
	// Ride class constructor is using super() to call the Object class constructor
	public Ride() {
		super();
	}
    
    public Ride(Driver driver, Passenger[] passengers){
        this.driver = driver;
        this.passengers = passengers;
    }

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
