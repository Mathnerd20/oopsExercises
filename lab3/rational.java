package lab3;

public class rational {
    int num;
    int den;

    rational(){
        num = 1;
        den = 1;
    }

    rational(int n, int d)
    {
        num = n;
        den = d;
    }

    /* My co-prime theory:
        We take any 2 numbers(a,b), and their difference/distance (d) between them.
        now i take the lowest prime factor of d (let k); (breaking the distance d in equal parts of k)
        if either of a or b is divisible by k, then they are not co-prime;
        proof:
        if a > b:
        a - b = d;
        n * k = d; (k is the lowest prime factor of d)
        now if a is divisible by k
        a = p * k;
        b = a - d
        = p * k - n * k;
        = (p-n) * k;
        implies b is also divisible by k
        so a,b are not co-primes
        same proof can be done for b>a
     */

    int lpf(int a){ // calculate lpf (lowest prime factor)
    	for(int i = 2; i <= a/2; i++) // this is lpf
    	{
    		if(a % i == 0)
    		{
    			return i;
    		}
    	}
    	return a;
    }

    public void simplify(){
    	//dealing with negative coefficients
        int neg = num*den < 0 ? -1 : 1;
        if(neg == -1)
        {
            if(num < 0) num *= neg;
            else den *= neg;
        }
        if(num < 0 && den < 0){
            num *= -1;
            den *= -1;
        }
        //directly handling simple cases
        logic:
        {
			if(num % den == 0)
			{
				num = num/den;
				den = 1;
				break logic;
			}
			else if(den % num == 0)
			{
				den = den/num;
				num = 1;
				break logic;
			}
			//main logic
			while(num > 0 && den > 0)
			{
				int diff = Math.max(num,den) - Math.min(num,den);
	            if(diff > num) //if diff is huge, then normal logic is more efficient
	            {
	            	for(int i = Math.min(num, den)/2; i > 1; i--)
	            	{
	            		if(num % i == 0 && den % i == 0) {
	            			num /= i;
	            			den /= i;
	            			break;
	            		}
	            	}
	            }
				int r = lpf(diff);
				if(r == 1 || (num % r != 0 && den % r != 0)){
					break;
				}
				num = num/r;
				den = den/r;
			}
        }
        if(neg == -1) {
            num *= neg;
        }
    }

    public static rational add (rational a, rational b)
    {
        rational sum = new rational();
        sum.num = a.num*b.den + a.den*b.num;
        sum.den = a.den*b.den;
        sum.simplify();
        return sum;
    }

    public static rational subtract(rational a, rational b)
    {
        rational diff = new rational();
        diff.num = a.num*b.den - a.den*b.num;
        diff.den = a.den*b.den;
        diff.simplify();
        return diff;
    }

    public static rational multiply(rational a, rational b)
    {
        rational pdt = new rational();
        pdt.num = a.num*b.num;
        pdt.den = a.den*b.den;
        pdt.simplify();
        return pdt;
    }

    public static rational divide(rational a, rational b)
    {
        rational result = new rational();
        result.num = a.num*b.den;
        result.den = a.den*b.num;
        result.simplify();
        return result;
    }
}
