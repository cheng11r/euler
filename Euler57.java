import java.math.BigInteger;

public class Euler57 {

	public static void main(String[] args) {
		
		BigInteger numerator = null, denominator = null, temp;
		BigInteger two = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		int count = 0;
		
		for(int i = 0; i < 1000; i++) {
			numerator = new BigInteger("1");
			denominator = new BigInteger("2");
			for(int n = 0; n < i; n++) {
				temp = two.multiply(denominator).add(numerator);
				numerator = denominator;
				denominator = temp;
			}
			temp = one.multiply(denominator).add(numerator);
			numerator = temp;
			if(numerator.toString().length() > denominator.toString().length()) count++;
		}
		System.out.println(count);

	}

}
