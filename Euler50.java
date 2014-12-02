
public class Euler50 {

	public static void main(String[] args) {

		boolean exit = false;
		int i, j;
		Integer[] primes = Prime.getPrimes(1000000);
		long total = 0, testTotal = -1;
		for(Integer n : primes) {
			if(total + n > 1000000) break;
			total += n;
		}
		
		for(int len = 0; len < primes.length; len++) {
			i = 0;
			j = len;
			while(j > -1) {
				testTotal = total - getLHSum(primes, i) - getRHSum(primes, j);
				if(testTotal < 1000000 && Prime.isPrime((int)testTotal)) {
					exit = true;
					break;
				}
				i++;
				j--;
			}
			if(exit) break;
		}
		System.out.println(testTotal);
	}
	
	public static int getLHSum(Integer[] primes, int n) {
		if(n < 1) return 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += primes[i];
		}
		return sum;
	}
	
	public static int getRHSum(Integer[] primes, int n) {
		if(n < 1) return 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += primes[primes.length - 1 - i];
		}
		return sum;
	}
}
