
public class Euler41 {

	public static void main(String[] args) {
		
		int prime = 2;
		while(prime < 10000000) {
			prime = Prime.getNextPrime(prime);
			if(Cheng11r.isPandigitalN(prime + "", (prime + "").length()))
				System.out.println(prime);
		}
	}
}
