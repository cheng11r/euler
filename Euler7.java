
public class Euler7 {

	public static void main(String[] args) {
		int i;
		int count = 2;
		for(i = 3; count < 10002; i+=2) {
			if(isPrime(i)) {
				count++;
			}
		}

		System.out.println(i-2);
	}

	public static boolean isPrime(int number) {
		if(number % 2 == 0) return number == 2;
		if(number % 3 == 0) return number == 3;
		for(int i=5; i < number; i=next(i)) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static int next(int i) {
		if((i-1) % 6 == 0) return i + 4; 
		return i + 2;
	}
}
