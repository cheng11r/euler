import java.math.BigInteger;

public class Euler65 {

	public static void main(String[] args) {
		// GIVES THE N+1TH
		int n = 99, k = 0, sum = 0;
		BigInteger numerator, denominator = new BigInteger("1"), nextdenom, temp;
		
		if(n % 3 == 0) {
			k = n / 3 + 1;
		}
		else if((n+1) % 3 == 0) k = (n+1) / 3;
		else if((n+2) % 3 == 0) k = (n+2) / 3;
		if((n+1) % 3 == 0) {
			denominator = new BigInteger(Integer.toString(2 * k));
		}
		numerator = new BigInteger("1");
		
		for(; n > 1; n--) {
			if(n % 3 == 0) {
				k--;
				nextdenom = new BigInteger(Integer.toString(2 * k)); 
			}
			else {
				nextdenom = new BigInteger("1");
			}
			numerator = numerator.add(nextdenom.multiply(denominator));
			temp = numerator;
			numerator = denominator;
			denominator = temp;
			
		}
		numerator = numerator.add(denominator.multiply(new BigInteger("2"))); // finally add 2
		
		System.out.println(numerator + " / " + denominator);
		String numeratorStr = numerator.toString();
		for(char c : numeratorStr.toCharArray()) {
			sum += Integer.parseInt(c + "");
		}
		System.out.println(sum);
	}
	
}
