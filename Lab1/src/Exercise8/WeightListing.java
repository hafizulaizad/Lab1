package Exercise8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exercise7.WeightOnMars;

	//Variable declaration
	public class WeightListing 
		{
		static String EarthObj;
	   	static String MarsObj;
	   	static List<Double> Marslist;
	   	static List<Double> Earthlist;
	   	static Scanner in = new Scanner(System.in);
	
	// Display 
	public static void main(String[] args) 
		{
		listingWeight();
		System.out.println("Earth weight ="+ Earthlist);
		System.out.println("Mars weight ="+ Marslist);
		}
	
	//Populate list from getter
	public static void listingWeight() 
		{
		WeightOnMars e7obj = new WeightOnMars();
		Earthlist = new ArrayList<Double>();
		Earthlist.add(e7obj.getEarthWeight());
		Marslist = new ArrayList<Double>();
	    Marslist.add(e7obj.getEarthWeight());
		}
}