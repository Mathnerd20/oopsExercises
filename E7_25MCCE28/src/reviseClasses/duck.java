package reviseClasses;

public class duck implements bird, fish{
	@Override
	public void canFly() {
		System.out.println("Duck can fly"); 
	}
	@Override
	public void canSwim() {
		System.out.println("Duck can swim");
	}
}
