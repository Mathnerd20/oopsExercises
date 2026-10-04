package backend;

public class SmartHouse {
	private String houseName;
	private double currentTemperature;
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public double getCurrentTemperature() {
		return currentTemperature;
	}
	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}
	//constructors
	public SmartHouse() {
		this.houseName = null;
		this.currentTemperature = 0;
	}
	public SmartHouse(String houseName, double temp) {
		this.houseName = houseName;
		this.currentTemperature = temp;
	}
	
	public String toString() {
		return "House Name: " + this.houseName + "\nTemperature: " + this.currentTemperature;
	}
	public class SmartThermostat{
		public void adjustTemperature(double targetTemp) {
			System.out.println(houseName + " Thermostat: Changing temperature from " + currentTemperature + " to " + targetTemp);
			currentTemperature = targetTemp;
		}
	}
}
