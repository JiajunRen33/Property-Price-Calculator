package Assignment3;
/*
 * Class name: ApartmentBuilding
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property and MultiUnitBuildingclass and add the new atrributes
 */
public class ApartmentBuilding extends MultiUnitBuilding{
	
	//create private attributes
	private Integer tenantsNum;
	private double individualSpace;
	private String apartmentName = "Apartment";
	
	//set the constructor
	public ApartmentBuilding(double listingPrice, Integer unitsNum, boolean elevator, double floorSpace, Integer tenantsNum, double individualSpace)
			throws BadProperty {
		super(listingPrice, unitsNum, elevator, floorSpace);
		setTenantsNum(tenantsNum);
		setIndividualSpace(individualSpace);
	}
	
	//setter for tenants number
	protected void setTenantsNum(Integer TenantsNumber) throws BadProperty{
		if(TenantsNumber <= 0)
			throw new BadProperty("The number of tenants should be bigger than 0.");
		this.tenantsNum = TenantsNumber;
	}
	
	//setter for individual space
	protected void setIndividualSpace(double IndividualSpace) throws BadProperty{
		if(IndividualSpace <= 0)
			throw new BadProperty("The number of individual space should be bigger than 0.");
		this.individualSpace = IndividualSpace;
	}
	
	//getters for tenants number
	public int getTenantsNum() {
		return this.tenantsNum;
	}
	
	//getters for infividual space
	public double getIndividualSpace() {
		return this.individualSpace;
	}
	
	//getter for name
	public String getName() {
		return this.apartmentName;
	}
	
	//calculate tax
	public double calculateTax() {
		double tax = 0.0;
		tax = 35 * individualSpace * getUnitsNum();
		return tax;
	}
	
	//toString method
	public String toString() {
		String ApartmentInformation = "Apartment, " + getUnitsNum() + " units, " + "have elevator: " + 
	getElevator() + " Floor Space: " + getFloorSpace() + " number of tenants: " + tenantsNum + 
	" Individual space: " + individualSpace + " asking price: " + getListingPrice();
		return ApartmentInformation;
	}
}