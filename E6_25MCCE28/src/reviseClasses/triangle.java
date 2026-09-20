
package reviseClasses;

public class triangle extends figure{
	public triangle(double dim1, double dim2) {
        super(dim1,dim2);
	}
	public final double area(){
		return (dim1*dim2)/2.0;
	}
}
