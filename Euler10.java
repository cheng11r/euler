public class Euler10 {

	public static void main(String[] args) {
		
		long sum = 0;
		
		for(int i = 2; i < 2000000; i = PrimeHelperClass.next(i))
			if(isPrime(i)) 
				sum += i;
		
		System.out.println(sum);
	}
	
	public static boolean isPrime(int number) {
		if(number % 2 == 0) return number == 2;
		if(number % 3 == 0) return number == 3;
		for(int i=5; i < (int)Math.sqrt(number) + 1; i=PrimeHelperClass.next(i)) {
			if(number % i == 0) return false;
		}
		return true;
	}
}
