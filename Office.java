package Assignment3;
/*
 * Class name: Office
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property and MultiUnitBuildingclass and add the new atrributes
 */
public class Office extends MultiUnitBuilding{
	
	//set enum
	private OfficeType classification;
	enum OfficeType{
		SERVICE, SALES, INDUSTRIAL
		}
	private String officeName = "Office";
	
	//constructor of Office
	public Office(double listingPrice, Integer unitsNum, double floorSpace, boolean elevator, OfficeType classification ) throws BadProperty{
		super(listingPrice, unitsNum, elevator, floorSpace);
	}
	
	//setter and getter for office type
	public void setOfficeType(OfficeType type) {
		this.classification = type;
	}
	
	public OfficeType getOfficeType() {
		return this.classification;
	}
	
	//getter for name
	public String getName() {
		return this.officeName;
	}
	
	//calculate the tax with different types of office
	public double calculateTax() {
		double tax = 0.0;
		if (classification.equals(OfficeType.SERVICE)) {
			tax = 0.95 * ((10*getFloorSpace()) + (20 * getUnitsNum()));
		}else if(classification.equals(OfficeType.SALES)) {
			tax =(10*getFloorSpace()) + (20 * getUnitsNum());
		}else if(classification.equals(OfficeType.INDUSTRIAL)) {
			tax = 0.85 * ((10*getFloorSpace()) + (20 * getUnitsNum()));
		}
		if(getElevator() == true) {
			tax = tax + 50;
		}
		return tax;
	}
	
	public String toString() {
		String OfficeInformation = "Office, " + getUnitsNum() + " units, " + "have elevator: " + 
	getElevator() + " Floor Space: " + getFloorSpace() + " asking price: " + getListingPrice();
		return OfficeInformation;
	}
}
