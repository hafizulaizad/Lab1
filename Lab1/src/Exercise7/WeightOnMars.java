package Exercise7;
import java.util.Scanner;

public class WeightOnMars {
	
		static double weightIn;
		static double marsWeight;
		
	    public static void main(String[] args) {
	        System.out.println("Know your weight in planet Mars! ");
	        weightEarth();
	        calculateOut();
	    }
	    
	    public static void weightEarth() {
	    
	    	Scanner in = new Scanner(System.in);
	    	
	    	System.out.println("Please enter your weight(KG) on Earth  ");
	    	weightIn = in.nextDouble();	
	    }
	    
	    public static void calculateOut() {
	    	
	    	marsWeight = (weightIn/9.81) * 3.711;
	    	System.out.printf("Your weight on Mars is: %.2f KG", marsWeight);
	        
	    }
}


