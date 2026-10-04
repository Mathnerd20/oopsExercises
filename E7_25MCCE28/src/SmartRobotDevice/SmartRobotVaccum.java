package SmartRobotDevice;

public class SmartRobotVaccum implements PowerDevice,SmartDevice{
	private boolean powerOn, connected;
	public SmartRobotVaccum() {
		powerOn = false;
		connected = false;
	}
	public void turnOn() {
		powerOn = true;
		System.out.println("The device is tuned on");
	}
	public void connectToWiFi() {
		connected = true;
		System.out.println("The device is connected to wifi");
	}
}
