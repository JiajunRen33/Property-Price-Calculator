package Assignment3;
/*
 * Class name: MultiUnitBuilding
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property class and add the new atrributes
 */
public abstract class MultiUnitBuilding extends Property{
	
	//set private attributes
	private Integer unitsNum;
	private boolean elevator;
	private double floorSpace;
	private String multiName = "MultiUnitBuilding";
	
	//constructor for MultiUnitBuilding
	public MultiUnitBuilding(double listingPrice, Integer unitsNum, boolean elevator, double floorSpace) throws BadProperty{
		super(listingPrice);
		setUnitsNum(unitsNum);
		setFloorSpace(floorSpace);
		setElevator(elevator);
		
	}
	
	//setter of unitNum
	protected void setUnitsNum(Integer UnitsNumber) throws BadProperty{
		if(UnitsNumber <= 0)
			throw new BadProperty("The number of units should be bigger than 0.");
		this.unitsNum = UnitsNumber;
	}
	
	//setter of floor space
	protected void setFloorSpace(double FloorSpace) throws BadProperty{
		if(FloorSpace <= 0)
			throw new BadProperty("The number of units should be bigger than 0.");
		this.floorSpace = FloorSpace;
	}
	
	//setter of elevator
	public void setElevator(boolean Elevator) {
		this.elevator = Elevator;
	}
	
	//getter of unitnum
	public int getUnitsNum() {
		return this.unitsNum;
	}
	
	//getter of floor space
	public double getFloorSpace() {
		return this.floorSpace;
	}
	
	//getter of elevator
	public boolean getElevator() {
		return this.elevator;
	}
	
	//getter of name
	public String getName() {
		return this.multiName;
	}
	
	//toString method
	public String toString() {
		String MultiUnitBuildingInformation = "MultiUnitBuilding, " + unitsNum + " units, " + "have elevator: " + 
	elevator + " Floor Space: " + floorSpace +  " asking price: " + getListingPrice();
		return MultiUnitBuildingInformation;
	}

}
