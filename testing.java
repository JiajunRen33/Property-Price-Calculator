package Assignment3;
/*
 * Class name: testing
 * Created by: Jiajun Ren
 * Date: Aug 4th
 * this class is testing class
 */
import java.util.ArrayList;

import Assignment3.House.HouseType;
import Assignment3.Office.OfficeType;

public class testing {
	public static void main(String[] args)throws BadProperty{
	    ArrayList<Property> propertyDB = new ArrayList<Property>();

	    Property prop1 = new Office(120, 3, 1500, true, OfficeType.SERVICE);
	    propertyDB.add(prop1);
	    Property prop2 = new Farm(250, 3400, "vegetables");
	    propertyDB.add(prop2);
	    System.out.println(Property.compareTo(prop1,prop2));
	    Property prop3 = new Cottage(100, 2, 3, 10, 12, 23, HouseType.WATERFRONT_HOME,30);
	    propertyDB.add(prop3);
	    Property prop4 = new Land (180, 15);
	    propertyDB.add(prop4);
	    System.out.println(Property.compareTo(prop3,prop4));
	    Property prop5 = new ApartmentBuilding(120, 6, true, 125, 5, 25);
	    propertyDB.add(prop5);
	    Property prop6 = new House(240, 3, 4, 15, 17, 123, HouseType.WATERFRONT_HOME);
	    propertyDB.add(prop6);
	    System.out.println(Property.compareTo(prop5,prop6));
	    for (Property element : propertyDB) {
	    	System.out.println(element);
	    	System.out.println("Listing Price = " + String.format("%.3f", element.getListingPrice()));
	}
	}
}
    