public class PrimeHelperClass {
	
	// returns the next number that is 6k +- 1 **given a number of that type** 
	// first number it *should* be given is 2
	public static int next(int i) {
		if((i-1) % 6 == 0) return i + 4; 
		if(i == 2) return 3;
		return i + 2;
	}
	
	public static boolean isPrime(int number) {
		if(number < 0) return false;
		if(number % 2 == 0) return number == 2;
		if(number % 3 == 0) return number == 3;
		for(int i=5; i < (int)Math.sqrt(number) + 1; i=next(i)) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static int getLowestPrimeFactor(int number) {
		for(int i = 2; i < (int)Math.sqrt(number); i=next(i)) {
			if(isPrime(i) && number % i == 0) return i;
		}
		return number;	// only prime factor is itself 
	}
}