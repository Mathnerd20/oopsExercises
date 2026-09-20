package numberClasses;

public class IMTechInteger implements IMTechNumber{
	//attributes

	int num;
	int num_digits;
	boolean is_prime;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
		this.num_digits = ("" + num).length();
		this.is_prime = this.isPrime();
	}

	//constructors
	public IMTechInteger(){
		this.num = 0;
		this.num_digits = 1;
		this.is_prime = false;
	}
	public IMTechInteger(int x){
		this.num = x;
		this.num_digits = ("" + x).length();
		this.is_prime = this.isPrime();
	}

	//methods
	public boolean isPrime() {
		for(int i = 2; i <= this.num/2; i++) {
			if(this.num % i == 0) return false;
		}
		return true;
	}
	public int getDigit(int index) {
		String number = "" + this.num;
		return (int)number.charAt(number.length() - 1 - index);
	}
	//interface methods
	public String toString() {
		return ("The number is " + this.num + ", its length is " + this.num_digits + ", it is a prime: " + this.is_prime);
	}
	public boolean equalsTo(Object num) {
		IMTechInteger k = (IMTechInteger) num;
		if(k.num == this.num /*&& k.hashCode() == this.hashCode()*/) return true;
		return false;
	}
	public int compareTo(Object num) {
		IMTechInteger k = (IMTechInteger) num;
		return ((this.num > k.num) ? 1 : (this.num < k.num) ? -1 : 0);
	}
	public Object addTo(Object num) {
		if(num instanceof IMTechInteger) {
			IMTechInteger k = (IMTechInteger) num;
			var result = new IMTechInteger(this.num + k.num);
			return result;
		}
		else if(num instanceof IMTechComplex) {
			IMTechComplex k = (IMTechComplex) num;
			return k.addTo(this);
		}
		else return null;
	}
	public Object subFrom(Object num){
		IMTechInteger k = (IMTechInteger) num;
		var result = new IMTechInteger(this.num - k.num);
		return result;
	}
	public Object multWith(Object num){
		IMTechInteger k = (IMTechInteger) num;
		var result = new IMTechInteger(this.num * k.num);
		return result;
	}
	public Object divideBy(Object num){
		IMTechInteger k = (IMTechInteger) num;
		var result = new IMTechInteger(this.num / k.num);
		return result;
	}

}
