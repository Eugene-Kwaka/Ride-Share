/**
 * Your ride-sharing app/taxi driver.
 * 
 * TODO Requirements: 
 * 1. Create a constructor that takes a Vehicle object to store as
 * 	  the instance variable 'vehicle' but you also need a no-argument constructor.
 *    You must have one constructor Driver() and another constructor Driver(Vehicle)
 *
 * 2. Implement the 'drive' method so that it tells the vehicle to drive. Since vehicle has
 *    a drive method, you only need to call this method. This is called the delegation pattern.
 * 
 * 3. The Driver is-a User, so they also have 'name' and 'email' properties. Hint: extend User
 *
 * 4. Ensure this class is properly encapsulated with getters/setters for each field.
 *    Hint: Getters and setters must conform to JavaBean specification. 
 *    Use the Ride class as an example for how to write these methods properly.
 *    You should not have any public variables in this class. All fields must be private.
 */
public class Driver extends User{

	private Vehicle vehicle;
    private String name;
    private String email;
   
    // non-parameterized constructor
    public Driver(){
        //this.vehicle = vehicle;
        //this.name = name;
        //this.email = email;
    }
    
    //parameterized constructor
    public Driver(Vehicle vehicle){
        //super(name, email);
        this.vehicle = vehicle;
    }
    
    public Vehicle getVehicle(){
        return this.vehicle;
    }
    
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
   
    public String getName(){
        return this.name;
    }
   
    public void setName(String name){
        this.name = name;
    
    }
    
    public String getEmail(){
        return this.email;
        
    }
    
    public void setEmail(String email){
        this.email = email;
       
    }
    
	public void drive(){
		// drive the vehicle
        vehicle.drive();
	}

}
