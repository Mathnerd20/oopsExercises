package Math_25MCCE28;

public class MyMath {
	static final double pi = 3.141592;
	static final double e = 2.71828;
	
	public static int max(int a, int b) {
		if(a > b) return a;
		return b;
	}
	
	public static int min(int a, int b) {
		if(max(a,b) == a) return b;
		return a;
	}

	public static double max(double a, double b) {
		if(a > b) return a;
		return b;
	}
	
	public static double min(double a, double b) {
		if(max(a,b) == a) return b;
		return a;
	}
	
	public static int absolute(int a) {
		if( a < 0) return -1 *a;
		return a;
	}

	public static int roundoff(double a) {
		return (int)a;
	}

	public static double distance(double a, double b) {
		if(a - b < 0) return b-a;
		return a-b;
	}

	public static int distance(int a, int b) {
		if(a - b < 0) return b-a;
		return a-b;
	}
}
