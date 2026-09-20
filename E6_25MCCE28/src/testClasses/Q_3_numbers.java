package testClasses;
import numberClasses.IMTechComplex;
import numberClasses.IMTechInteger;
import numberClasses.IMTechNumber;

public class Q_3_numbers {
	public static void main(String[] args) {
		IMTechNumber a = new IMTechInteger(36);
		IMTechInteger b = new IMTechInteger(13);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.equalsTo(b));
		System.out.println(a.compareTo(b));
		if(a.addTo(b) instanceof IMTechInteger)
		{
			IMTechInteger result = (IMTechInteger)a.addTo(b);
			System.out.println("After addition: " + result.toString());
		}
		if(a.subFrom(b) instanceof IMTechInteger)
		{
			IMTechInteger result = (IMTechInteger)a.subFrom(b);
			System.out.println("After subtraction: " + result.toString());
		}
		if(a.multWith(b) instanceof IMTechInteger)
		{
			IMTechInteger result = (IMTechInteger)a.multWith(b);
			System.out.println("After mutliplication: " + result.toString());
		}
		if(a.divideBy(b) instanceof IMTechInteger)
		{
			IMTechInteger result = (IMTechInteger)a.divideBy(b);
			System.out.println("After division: " + result.toString());
		}
		System.out.println("\n ---------COMPLEX NUMBERS--------- \n");
		var c = new IMTechComplex(1,1);
		var d = new IMTechComplex(1,2);
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(c.equalsTo(d));
		System.out.println(c.compareTo(d));
		if(c.addTo(d) instanceof IMTechComplex)
		{
			IMTechComplex result = (IMTechComplex)c.addTo(d);
			System.out.println("After addition: " + result.toString());
		}
		if(c.subFrom(d) instanceof IMTechComplex)
		{
			IMTechComplex result = (IMTechComplex)c.subFrom(d);
			System.out.println("After subtraction: " + result.toString());
		}
		if(c.multWith(d) instanceof IMTechComplex)
		{
			IMTechComplex result = (IMTechComplex)c.multWith(d);
			System.out.println("After mutliplication: " + result.toString());
		}
		if(c.divideBy(d) instanceof IMTechComplex)
		{
			IMTechComplex result = (IMTechComplex)c.divideBy(d);
			System.out.println("After division: " + result.toString());
		}
		System.out.println("Adding integer to complex number");
		System.out.println("Adding " + b.toString() + " to " + d.toString());
		System.out.println(d.addTo(b).toString());
		System.out.println("Adding " + a.toString() + " to " + c.toString());
		System.out.println(a.addTo(c).toString());
	}
}
