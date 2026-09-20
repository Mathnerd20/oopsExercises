package numberClasses;

public class IMTechComplex implements IMTechNumber{
	int real;
	int imag;

	//constructors
	public IMTechComplex() {
		this.real = 0;
		this.imag = 0;
	}
	public IMTechComplex(int x, int y) {
		this.real = x;
		this.imag = y;
	}

	//getters and setters
	public void setReal(int real) {
		this.real = real;
	}
	public int getReal() {
		return real;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public int getImag() {
		return imag;
	}
	// methods
	public double getMag() {
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
	}

	//interface methods
	public String toString() {
		return ("The number is " + this.real + " + " + this.imag + "i");
	}
	public boolean equalsTo(Object num) {
		IMTechComplex k = (IMTechComplex) num;
		if(k.real == this.real && k.real == this.real) return true;
		return false;
	}
	public int compareTo(Object num) { //since complex numbers can can't be compared, i'm comparing their magnitudes
		IMTechComplex k = (IMTechComplex) num;
		return ((this.getMag() > k.getMag()) ? 1 : (this.getMag() < k.getMag()) ? -1 : 0);
	}
	public IMTechComplex addTo(Object num) {
		if(num instanceof IMTechComplex) {
			IMTechComplex k = (IMTechComplex) num;
			var result = new IMTechComplex(this.real + k.real, this.imag + k.imag);
			return result;
		}
		else {
			IMTechInteger p = (IMTechInteger) num;
			var result = new IMTechComplex(this.real + p.num, this.imag);
			return result;
		}
	}
	public Object subFrom(Object num){
		IMTechComplex k = (IMTechComplex) num;
		var result = new IMTechComplex(this.real - k.real, this.imag - k.imag);
		return result;
	}
	public Object multWith(Object num){
		IMTechComplex k = (IMTechComplex) num;
		var result = new IMTechComplex(this.real*k.real - this.imag*k.imag, this.imag*k.real + this.real*k.imag); 
		return result;
	}
	public Object divideBy(Object num){
		IMTechComplex k = (IMTechComplex) num;
		k.setImag(-1 * k.getImag());
		IMTechComplex result = (IMTechComplex)this.multWith(k);
		result.setReal((int)Math.round(result.getReal()/Math.pow(k.getMag(), 2)));
		result.setImag((int)Math.round(result.getImag()/Math.pow(k.getMag(), 2)));
		return result;
	}

}
