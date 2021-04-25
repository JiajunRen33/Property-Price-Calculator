package Assignment3;
/*
 * Class name: Cottage
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property class and add the Cottage
 */
public class Cottage extends House{
	
	//set the lakeFrontage attribute and name
	private double lakeFrontage;
	private String cottageName = "Cottage";
	
	//this is the constructor of cottage
	public Cottage(double listingPrice, Integer bathroomNum, Integer bedroomNum, double lotDepth, double lotWidth, double floorSpace, HouseType WATERFRONT_HOME, double lakeFrontage) 
			throws BadProperty{
		super(listingPrice, bathroomNum, bathroomNum, lotDepth, lotWidth, floorSpace, WATERFRONT_HOME);
		setLakeFrontage(lakeFrontage);
	}
	
	//setter of lake frontage
	protected void setLakeFrontage(double LakeFrontage) throws BadProperty{
		if(LakeFrontage <= 0)
			throw new BadProperty("The lake frontage can not be less than or equal to 0.");
		this.lakeFrontage = LakeFrontage;
	}
	
	//getter of lake frontage
	public double getLakeFrontage() {
		return this.lakeFrontage;
	}
	
	//getter of name
	public String getName() {
		return this.cottageName;
	}
	
	//calculate tax
	public double calculateTax() {
		double tax = 0.0;
		tax = 2000 + (lakeFrontage * 2);
		return tax;
	}
	
	//toString method
	public String toString() {
		String CottageInformation = "Cottage, " + getBathroomsNum() + "bathrooms, " + getBedroomsNum() + " bedrooms, " + " depth of lot:" + 
				getLotDepth() + " width of lot: " + getLotWidth() + " floor space" + getFloorSpace() + " lakeFrontage: " 
				+ lakeFrontage + " asking price: " + getListingPrice();
		return CottageInformation;
	}
}