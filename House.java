package Assignment3;
/*
 * Class name: House
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class extend the property class and add the farm
 */
public class House extends Property{
	
	//set the private attributes for House 
	private Integer bathroomNum;
	private Integer bedroomNum;
	private double lotDepth;
	private double lotWidth;
	private double floorSpace;
	
	//set the enum attribute
	private HouseType classification;
	enum HouseType{
		 TOWNHOUSE, DETACHED, DUPLEX, WATERFRONT_HOME
		}
	private String houseName = "House";
	
	
	//this method is the constructor for the house and it throws the illegal value to BadProperty
	public House(double listingPrice, Integer bathroomNum, Integer bedroomNum, double lotDepth, double lotWidth, double floorSpace, HouseType classification)
			throws BadProperty {
		super(listingPrice);
		setBathroomNum(bathroomNum);
		setBedroomNum(bedroomNum);
		setLotDepth(lotDepth);
		setLotWidth(lotWidth);
		setFloorSpace(floorSpace);
	}
	
	//this is the setter of the number of bathrooms
	protected void setBathroomNum(Integer BathroomNumber) throws BadProperty{
		if(BathroomNumber <= 0)
			throw new BadProperty("The number of bathrooms should be bigger than 0.");
		this.bathroomNum = BathroomNumber;
	}
	
	//this is the setter of the number of bedrooms
	protected void setBedroomNum(Integer BedroomNumber) throws BadProperty{
		if(BedroomNumber <= 0)
			throw new BadProperty("The number of bedrooms should be bigger than 0.");
		this.bedroomNum = BedroomNumber;
	}
	
	//this is the setter of the depth of lot
	public void setLotDepth(double Depth){
		this.lotDepth = Depth;
	}
	
	//this is the setter of the width of lot
	public void setLotWidth(double Width) {
		this.lotWidth = Width;
	}
	
	//this is the setter of the floor space
	public void setFloorSpace(double Space) {
		this.floorSpace =Space;
	}
	
	//this is the getter of the number of bathrooms
	public int getBathroomsNum(){
		return this.bathroomNum;
	}
	
	//this is the getter of the number of bedrooms
	public int getBedroomsNum(){
		return this.bedroomNum;
	}
	
	//this is the getter of the lotDepth
	public double getLotDepth() {
		return this.lotDepth;
	}
	
	//this is the getter of the lotWidth
	public double getLotWidth() {
		return this.lotWidth;
	}
	
	//this is the getter of the floor space
	public double getFloorSpace() {
		return this.floorSpace;
	}
	
	//this is the getter for houseName
	public String getName() {
		return this.houseName;
	}
	
	//calculate tax
	public double calculateTax() {
		double tax = 0.0;
		tax = 1000 + (bedroomNum * 50) + (floorSpace * 10);
		return tax;
	}
	
	//toString method
	public String toString() {
		String HouseInformation = "House, " + bathroomNum + "bathrooms, " + bedroomNum + " bedrooms, " + " depth of lot:" + 
	lotDepth + " width of lot: " + lotWidth + " floor space" + floorSpace + "House Type: " + classification + " asking price: " + getListingPrice();
		return HouseInformation;
	}
	
}
