import java.math.BigInteger;
import java.util.HashMap;

public class Euler53 {

	public static HashMap<String, BigInteger> map = new HashMap<String, BigInteger>();
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int n = 1; n < 101; n++)
			for(int r = 0; r < n; r++)
				if(pascal(n, r).compareTo(new BigInteger("1000000")) > 0) 
					count++;
		System.out.println(count);
	}
	
	public static BigInteger pascal(int n, int r) {
		if(n == 0) return new BigInteger("1");
		if(r == 0 || r == n) return new BigInteger("1");
		if(map.containsKey(n + "" + r)) return map.get(n + "" + r);
		else map.put(n + "" + r, pascal(n-1, r-1).add(pascal(n-1, r)));
		return pascal(n-1, r-1).add(pascal(n-1, r));
	}

}
