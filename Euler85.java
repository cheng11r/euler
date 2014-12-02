import java.util.HashMap;
import java.math.BigInteger;

public class Euler85 {
	public static HashMap<BigInteger,BigInteger> map = new HashMap<BigInteger, BigInteger>();
	
	//FUCK THIS QUESTION I GOT LUCKY
	public static void main(String[] args) {		
		BigInteger len, wid = new BigInteger("1"), eM = new BigInteger("8000000");
		BigInteger one = new BigInteger("1");
		BigInteger LHS, RHS;
		BigInteger range = new BigInteger("200000");
		BigInteger least = new BigInteger("200000"), leastLen = null, leastWid = null;
		BigInteger test;
		BigInteger testrange = new BigInteger("1");
		boolean exit = false;
		map.put(new BigInteger("0"), new BigInteger("1"));
		map.put(new BigInteger("1"), new BigInteger("1"));

		for(len = one; ;len = len.add(one)) {
			for(; ;wid = wid.add(one)) {
				LHS = getFactorial(len.add(one)).multiply(getFactorial(wid.add(one)));
				LHS = LHS.divide(getFactorial(len.subtract(one)));
				LHS = LHS.divide(getFactorial(wid.subtract(one)));
				//System.out.println(LHS.subtract(eM).abs().compareTo(range));
				if((test = LHS.subtract(eM)).abs().compareTo(range) < 0) {
					if(test.compareTo(least) < 0) {
						least = test;
						leastLen = len;
						leastWid = wid;
					}
					break;
				}
				if(wid.compareTo(len.add(testrange)) > 0) break;
			}
			if(testrange.compareTo(new BigInteger("20")) > 0) {
				testrange = new BigInteger("1");
				continue;
			}
			else testrange = testrange.add(one);
			if(len.compareTo(new BigInteger("2000")) > 0) break;
		}
		System.out.println(leastLen + " x " + leastWid);
		System.out.println("It's actually 44 x 63");
	}
	
	public static BigInteger getFactorial(BigInteger n) {
		if(map.containsKey(n)) 
			return map.get(n);
		else {
			map.put(n , n.multiply(getFactorial(n.subtract(new BigInteger("1")))));
			return n.multiply(getFactorial(n.subtract(new BigInteger("1"))));
		}
	}

}
