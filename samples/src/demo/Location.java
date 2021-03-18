package demo;

public class Location {
	
	// Init private var 
	private String state = "Kuching";
	private String country = "Malaysia";
	private String name = "Hafizul";
	
	// Getter
	public String getState() {
	return state;
	}
	
	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	// Setter
	public void setState(String changeState) {
	this.state = changeState;
	}
	
	public void setCountry(String changeCountry) {
	this.state = changeCountry;
	}
	
	public void setName(String changeName) {
		this.state = changeName;
	}
}
