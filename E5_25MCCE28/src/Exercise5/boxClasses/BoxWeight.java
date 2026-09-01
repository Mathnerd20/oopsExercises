package Exercise5.boxClasses;

public class BoxWeight extends Box{
	double weight;
    public BoxWeight(){
        this.length = 1;
        this.breadth = 1;
        this.height = 1;
        this.weight = 1;
    }
    public BoxWeight(int length, int breadth, int height, double weight){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.weight = weight;
    }
    public BoxWeight(Box a) {
        this.length = a.length;
        this.breadth = a.breadth;
        this.height = a.height;
        this.weight = 2;
    }
    public BoxWeight(BoxWeight a) {
        this.length = a.length;
        this.breadth = a.breadth;
        this.height = a.height;
        this.weight = a.weight;
    }

    public void increment() {
    	super.increment();
    	this.weight++;
    }
	public void display() {
		System.out.printf("Dimensions are (%d, %d, %d, %.2f) \n", this.length, this.breadth, this.height, this.weight);
	}
}
