import java.util.*;
import java.math.BigInteger;

public class Euler16 {

	public static void main(String[] args) {
		
		List<BigInteger> vals = new ArrayList<>();
		BigInteger previous, current = new BigInteger("0"), sum = new BigInteger("0");
		int i, answer = 0;
		
		vals.add(new BigInteger("1"));
		previous = new BigInteger("1");
		
		for(i = 0; i < 1000; i++) {
			current = previous.multiply(new BigInteger(Integer.toString(1000 - i)));
			current = current.divide(new BigInteger(Integer.toString(i + 1)));
			vals.add(current);
			previous = current;
		}
		
		for(BigInteger val : vals){
			sum = sum.add(val);
		}
		
		for(char c : sum.toString().toCharArray()) {
			answer += c - '0';
		}
		System.out.println(answer);
	}

}
