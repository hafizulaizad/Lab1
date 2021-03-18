package Exercise7;
import java.util.Scanner;

public class WeightOnMars {
	// Variable initialize
	static double earthWeight;
	static double marsWeight;
	static char repeat;
	static Scanner in = new Scanner(System.in);
	
    // Get weight on Earth
    public static void earthWeight( ) {
    	System.out.println("Please enter your weight(KG) on Earth  ");
    	earthWeight = in.nextDouble();	
    }
    
    // Calculate weight on Mars
    public static void calculateMars() {
    	marsWeight = (earthWeight/9.81) * 3.711;
    	System.out.printf("Your weight on Mars is: %.2f KG \n", marsWeight);
    }
    
    // Loop
    	public static void loopQues() {
    	System.out.println("Again?! (y/n) ");
	    repeat = in.next().charAt(0);	
    }
    	
    // Setter
    public void setEarthWeight(double earthWeight) {
    this.earthWeight = earthWeight;
    }
    	
    public void setMarsWeight(double marsWeight) {
    this.marsWeight = marsWeight;
    }
    
    // Getter
	public double getEarthWeight() {
	return earthWeight;
	}
	
	public double getMarsWeight() {
		return marsWeight;
	}
	
	public static void main(String[] args) {
		do {
        System.out.println("Know your weight in planet Mars! ");
        earthWeight();
        calculateMars();
        loopQues();	
		}
        while(repeat=='y');
		System.out.println("Thanks");
    }
}



