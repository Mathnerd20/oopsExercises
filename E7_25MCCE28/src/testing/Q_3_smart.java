package testing;
import backend.SmartHouse;

public class Q_3_smart {
	public static void main(String[] args) {
	SmartHouse k = new SmartHouse("Batcave", 0);
	SmartHouse.SmartThermostat b = k.new SmartThermostat();
	System.out.println(k.toString());
	b.adjustTemperature(30);
	System.out.println(k.toString());
	}
}
