package Exercise5.boxClasses;

public class Box {
	int length;
	int breadth;
	int height;
	public Box(){
		this.length = 1;
		this.breadth = 1;
		this.height = 1;
	}
	public Box(int x,int y,int z){
		this.length = x;
		this.breadth = y;
		this.height = z;
	}
	public Box(Box a) {
		this.length = a.length;
		this.breadth = a.breadth;
		this.height = a.height;
	}
	public Box(BoxWeight a) {
		this.length = a.length;
		this.breadth = a.breadth;
		this.height = a.height;
	}
	public void display() {
		System.out.printf("Dimensions are (%d, %d, %d) \n", this.length, this.breadth, this.height);
	}
	public void increment() {
		this.length += 1;
		this.breadth += 1;
		this.height += 1;
	}
}
