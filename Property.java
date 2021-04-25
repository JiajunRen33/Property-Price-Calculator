package Assignment3;
/*
 * Class Name: Property
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * This class is the abstract class with the abstract method
 */

import java.util.ArrayList;//import arraylist for compareTo method


public abstract class Property {
	private double listingPrice;//set private attribute listingPrice
	
	private String propertyName = "Property";
	/*
	 * method name: Property
	 * parameter: listingPrice(double)
	 * This method is a constructor for the Property class
	 */
	public Property (double listingPrice) throws BadProperty{
		setListingPrice(listingPrice);
	}
	
	/*
	 * method name: setListingPrice
	 * parameter:price(double)
	 * This method is the setter of listingPrice and it throws illegal listingPrice to BadProperty
	 */
	protected void setListingPrice(double price) throws BadProperty{
		if(price < 0)
			throw new BadProperty("The price must be bigger than 0.");
		this.listingPrice = price;
	}
	
	//This is the getter of listingPrice
	public double getListingPrice() {
		return this.listingPrice;
	}
	
	public String getName() {
		return this.propertyName;
	}
	//This is the abstract method
	public abstract double calculateTax();
	
	//This method compare the prices of two properties
	public static double compareTo(Property property1, Property property2) {
		double difference = 0.0;
		difference = property1.getListingPrice() - property2.getListingPrice();
		if(difference > 0) {
			System.out.println("The " + property1.getName() + " is more expensive than " + 
		property2.getName() + " the differences is " + difference);
		}
		if(difference < 0) {
			difference = Math.abs(difference);
			System.out.println("The " + property2.getName() + " is more expensive than " + property1.getName() + " the differences is " + difference);
		}
		else {
			System.out.println("They are equal");
		}
		return difference;
			
	}
}
		


