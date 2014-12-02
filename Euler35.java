
public class Euler35 {

	public static void main(String[] args) {
		
		Integer[] primes = Prime.getPrimes(1000000);
		boolean candidate;
		boolean[] yn = new boolean[primes.length];
		int total = 0;
		char[][] primeChars = new char[primes.length][];
		
		for(int i = 0; i < primes.length; i++) 
			primeChars[i] = primes[i].toString().toCharArray();
		
		for(int i = 0; i < primeChars.length; i++) {
			candidate = true;
			for(char c : primeChars[i])
				candidate = candidate && (c % 2 != 0 || c % 5 != 0);
			yn[i] = candidate;
		}
		yn[0] = true;
		for(int i = 0; i < yn.length; i++) 
			if(yn[i]) 
				if(isCircular(primes[i]))
					total++;
		
		System.out.println(total);

	}

	public static boolean isCircular(Integer candidate) {
		String prime = candidate.toString();
		boolean ans = true;
		char end;
		for(int i = 0; i < prime.length() - 1; i++) {
			end = prime.charAt(prime.length() - 1);
			prime = end + prime.substring(0, prime.length() - 1);
			ans = ans && Prime.isPrime(Integer.parseInt(prime));
		}
		return ans;
	}
}
