/*
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 *
 *
 *Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
import java.math.BigInteger;

public class Euler48 {

	public static void main(String[] args) {
		
		BigInteger result = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger k = new BigInteger("1000");
		for(BigInteger i = new BigInteger("1"); i.compareTo(k) <= 0; i = i.add(one))
			result = result.add(i.pow(i.intValue()));
		System.out.println(result.toString().substring(result.toString().length() - 10));
	}

}
