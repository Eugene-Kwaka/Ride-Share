/**
 * The Vehicle that the Driver uses for work.
 * 
 * TODO Requirements: 
 * 1. Ensure the Vehicle class is-a Driveable so it can be
 * 	  assigned in the Driver class.
 *    Hint: implement Driveable
 *
 * 2. When anyone calls drive method, set 'inTransit' to the value of "true"
 *
 * 3. Ensure this class is properly encapsulated with getters/setters for each private field. 
 *    Hint: Getters and setters must conform to JavaBean specification. 
 *    Use the Ride class as an example for how to write these methods properly.
 *    You should not have any public variables in this class. All fields must be private.
 *    Note: getter methods are named differently for boolean values.
 */
public class Vehicle implements Driveable {

	private String year;
	private String make;
	private String model;
	private String plateNumber;
	private boolean inTransit;
    
    public String getYear(){
        return year;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public String getMake(){
        return make;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getPlateNumber(){
        return plateNumber;
    }
    
    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }
    
    public boolean isInTransit(){
        return inTransit;
    }
    
    public void setInTransit(boolean inTransit){
        this.inTransit = inTransit;
    }
    
    
    public void drive(){
        inTransit = true;
    }
    
	
	

}
