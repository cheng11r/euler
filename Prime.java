import java.util.Arrays;
import java.util.ArrayList;

public class Prime {

	// returns an array of primes <= n
	public static Integer[] getPrimes(int n) {
		if(n < 1) return null;
		ArrayList<Integer> l = new ArrayList<Integer>(n / 2);
		boolean[] bools = new boolean[++n];
		for(int i = 2; i < n; i++)
			bools[i] = true;
		for(int i = 2; i < Math.sqrt(n); i++)
			if(bools[i])
				for(int j = i * i; j < n; j += i)
					bools[j] = false;
		for(int i = 0; i < n; i++)
			if(bools[i]) l.add(i);
		
		return l.toArray(new Integer[l.size()]);
	}
	
	// returns true if given value is prime, false otherwise
	public static boolean isPrime(int n) {
		if(n <= 3) 
			return n > 1;
		else if(n % 2 == 0 || n % 3 == 0 || n == 25)
			return false;
		else
			for(int i = 5; i * i < n; i += 6)
				if(n % i == 0 || n % (i + 2) == 0)
					return false;
		return true;
	}
	
	public static boolean isPrime(long n) {
		if(n <= 3) 
			return n > 1;
		else if(n % 2 == 0 || n % 3 == 0 || n == 25)
			return false;
		else
			for(int i = 5; i * i < n; i += 6)
				if(n % i == 0 || n % (i + 2) == 0)
					return false;
		return true;
	}
	
	// returns the nth prime
	public static int getPrime(int n) {
		return 0;
	}
	
	// returns the lowest prime > n
	public static int getNextPrime(int n) {
		while(true) 
			if(isPrime(++n)) return n;
	}
	
	
}
