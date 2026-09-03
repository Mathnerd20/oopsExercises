package E4_25MCCE28;
import Math_25MCCE28.MyMath; 
public class Q_N_mathtest {
	public static void main(String[] args)
	{
		double a = -3.141592;
		System.out.println(MyMath.roundoff(a));
		double x = 17.1624;
		double y = 14.2288;
		System.out.println(MyMath.distance(x, y));
		System.out.println(MyMath.max(x, y));
		System.out.println(MyMath.min(x, y));
		int k = 12;
		int b = -10;
		System.out.println(MyMath.distance(k, b));
		System.out.println(MyMath.max(k, b));
		System.out.println(MyMath.min(k, b));
		b = MyMath.absolute(b);
		System.out.println(MyMath.distance(k, b));
		System.out.println(MyMath.max(k, b));
		System.out.println(MyMath.min(k, b));
	}
}
