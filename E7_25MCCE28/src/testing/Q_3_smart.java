package testing;
import backend.SmartHouse;
import java.util.Scanner;

public class Q_3_smart {
	public static void main(String[] args) {
		var input = new Scanner(System.in);
		var k = new SmartHouse("Batcave", 0);
		SmartHouse.SmartThermostat b = k.new SmartThermostat();
		System.out.println(k.toString());
		System.out.println("Enter the temperature of room to be set");
		double t = input.nextDouble();
		b.adjustTemperature(t);
		System.out.println(k.toString());
	}
}
