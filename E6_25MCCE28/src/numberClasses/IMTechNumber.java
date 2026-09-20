package numberClasses;

public interface IMTechNumber {
	public String toString();
	public boolean equalsTo(Object num);
	public int compareTo(Object num);
	public Object addTo(Object num);
	public Object subFrom(Object num);
	public Object multWith(Object num);
	public Object divideBy(Object num);
}
/* Note to self:
While methods are resolved dynamically at runtime based on the actual object, 
attributes are resolved at compile-time based entirely on the reference type.
so a parent reference can point to its subclass object and can access the subclass's methods but not it's attributes
 */