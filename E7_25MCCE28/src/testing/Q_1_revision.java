package testing;
import reviseClasses.*;
public class Q_1_revision {
	enum Colors{
		RED("red"),
		BLUE("blue"),
		GREEN("green");
		private String color;
		private Colors(String k){
			this.color = k;
		}
		public String getColor() {
			return this.color;
		}
	}
	public static void main(String[] args) {
		bird pigeon = new bird() {
			public void canFly() {
				System.out.println("pigeon can fly");
			}
		};
		pigeon.canFly();
		pigeon.type();
		System.out.println(Colors.RED.getColor());
		for(Colors k : Colors.values()) {
			System.out.println(k + " the color is: " + k.getColor());
		}
	}
}
