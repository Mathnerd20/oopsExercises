package SmartRobotDevice;

public interface PowerDevice {
	void turnOn();
	default void checkBattery() {
		System.out.println("Battery status: Good");
	}
}
