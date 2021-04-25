package Assignment3;

/*
 * Class name: Land
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property class and add the hectares to the land
 */
public class Land extends Property{
	//set private attribute hectares (double)
	private double hectares;
	
	//set Land's name for compareTo method
	private String landName = "Land";
	
	/*
	 * method name: Land
	 * parameter: listingPrice, hectares
	 * this method is a constructor of the Land class and it throws the illegalvalue to the BadProperty
	 */
	public Land (double listingPrice, double hectares) throws BadProperty{
		super(listingPrice);
		setHectares(hectares);
	}
	
	/*
	 * method name: setHectares
	 * parameter: Hectares(double)
	 * this method is setter for hectares attribute
	 */
	protected void setHectares(double Hectares) throws BadProperty{
		if(Hectares < 0)
			throw new BadProperty("The hectares should be bigger than 0.");
		this.hectares = Hectares;
	}
	
	//this method is the getter of hectares
	public double getHectares() {
		return this.hectares;
	}
	
	//this method is the getter of landName
	public String getName() {
		return this.landName;
	}
	//this method calculate the tax of land The tax for a vacant land property is $100 dollars per hectare. 
	public double calculateTax() {
		double tax = 0.0;
		
		// The tax for a vacant land property is $100 dollars per hectare.
		tax = hectares * 100;
		return tax;
		
	}
	
	//toString method to return the string of farm
	public String toString() {
		String LandInformation = "Land, " + getHectares() + "heactares, " + "asking price: " + getListingPrice() + "dollars";
		return LandInformation;
	}
	
	
}
