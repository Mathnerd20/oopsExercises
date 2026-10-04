package testing;

import SmartRobotDevice.*;

public class Q_4_Robot {
	public static void main(String[] args) {
		var k = new AmphibousCleaner() {
			@Override
			public void connectToWiFi() {
				System.out.println("The system is connected to wifi");
			}
			
			@Override
			public void turnOn() {
				System.out.println("The system is connected to internet");
			}
			
			@Override
			public void deepClean() {
				System.out.println("Performing Deep Clean");
			}
			public void checkBattery() {
				System.out.println("Battery at 80% capacity");
			}
		};
		k.connectToWiFi();
		k.turnOn();
		k.deepClean();
		k.checkBattery();
	}
}
