package reviseClasses;

public class rectangle extends figure{
	public rectangle(double dim1, double dim2) {
        super(dim1,dim2);
	}
	public final double area(){
		return dim1*dim2;
	}
	public final double volume(){
		return 0;
	}
}
