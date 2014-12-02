import java.util.ArrayList;
import java.util.Arrays;

public class Euler47 {

	public static void main(String[] args) {
		
		// 134043 is there a better way?
		int i;
		Integer[] primes = Prime.getPrimes(169);
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(primes));
		
		for(i = 210; true; i++) {
			if(list.contains(i)) continue;
			if(getNumPrimeFactors(i) == 4)
				if(getNumPrimeFactors(i + 1) == 4)
					if(getNumPrimeFactors(i + 2) == 4)
						if(getNumPrimeFactors(i + 3) == 4)
							break;
		}
		System.out.println(i);

	}

	public static int getNumPrimeFactors(int n) {
		Integer[] primes = Prime.getPrimes(n);
		int count = 0;
		for(int x : primes) {
			if(n % x == 0) count++;
			if(count > 4) return count;
		}
		return count;
	}
	
}
