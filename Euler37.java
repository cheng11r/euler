
public class Euler37 {

	public static void main(String[] args) {
		int count = 0, sum = 0;
		Integer prime;
		
		System.out.println(Prime.isPrime(25));
		prime = 11;
		while(count < 11) {
				if(isValid(prime)) {
					count++;
					sum += prime;
					System.out.println(prime);
				}
			prime = Prime.getNextPrime(prime);
		}
		System.out.println(sum);
	}
	
	public static boolean isValid(int prime) {
		int temp = prime;
		int len = 0;
		while(temp > 0) {
			len++;
			temp /= 10;
		}	
		temp = prime;
		while(prime > 0) {
			if(!Prime.isPrime(temp)) return false;
			if(!Prime.isPrime(prime)) return false;
			prime /= 10;
			temp = temp % (int)Math.pow(10, len - 1);
			len--;
		}
		return true;
	}
}
