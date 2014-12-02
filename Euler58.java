
public class Euler58 {

	public static void main(String[] args) {
		
		// top right : i^2 - 3i + 3
		// top left: i^2 - 2i + 2
		// bottom left: i^2 - i + 1
		// bottom right: i^2
		int numprimes = 0, total = 1;
		int temp;
		int i;
		for(i = 3; ; i += 2) {
			temp = 0;
			if(PrimeHelperClass.isPrime(i * i - 3 * i + 3)) temp++;
			if(PrimeHelperClass.isPrime(i * i - 2 * i + 2)) temp++;
			if(PrimeHelperClass.isPrime(i * i - i + 1)) temp++;
			if(PrimeHelperClass.isPrime(i * i)) temp++;
			numprimes += temp;
			total += 4;
			if(numprimes * 10 < total) break;
		}
		System.out.println(i);
		System.out.println(numprimes);
		System.out.println(total);
	}

}
