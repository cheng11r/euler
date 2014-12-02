
public class Euler46 {

	public static void main(String[] args) {
		
		int prime = 2, n = 3;
		while(true) {
			while(prime < n) {
				if(isSquare((n - prime)/2)) break;
				else prime = Prime.getNextPrime(prime);
			}
			if(prime > n) break;
			n += 2;
			prime = 2;
		}
		System.out.println(n);
	}
	
	public static boolean isSquare(int n) {
		return Math.sqrt(n) == Math.floor(Math.sqrt(n));
	}

}
