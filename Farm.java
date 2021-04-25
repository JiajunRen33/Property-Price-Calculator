package Assignment3;

/*
 * Class name: Farm
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property class and add the Farm class
 */
public class Farm extends Land{
	
	//create attribute crops and name
	private String crop;
	private String farmName = "Farm";
	
	//this is the constructor for farm
	public Farm(double listingPrice, double hectares, String crop) throws BadProperty{
		super(listingPrice, hectares);
		setCrop(crop);
	}
	
	//setter for crops
	protected void setCrop(String Crop) throws BadProperty{
		if(Crop.equals("") || Crop.equals(null))
			throw new BadProperty("There must be a kind of crops.");
		this.crop = Crop;
	}
	
	//getter for crops
	public String getCrop() {
		return this.crop;				
	}
	
	//getter for farmName
	public String getName() {
		return this.farmName;
	}
	public double calculateTax() {
		double tax = 0.0;
		tax = getHectares() * 50;
		return tax;
	}
	
	//toString method
	public String toString() {
		String FarmInformation = "Farm, " + getHectares() + " heactares, " + "type of crop: " + crop +  " asking price: " + getListingPrice();
		return FarmInformation;
	}
}
