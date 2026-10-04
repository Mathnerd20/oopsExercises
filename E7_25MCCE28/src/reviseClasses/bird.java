package reviseClasses;

public interface bird {
	void canFly();
	default void type() {
		System.out.println("This is a bird");
	}
}
