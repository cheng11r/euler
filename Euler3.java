import java.math.*;

public class Euler3 {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("600851475143");
		long number = x.longValue();
		long bpf = 2;
		while(number != 1) {
			while(true) {
				bpf++;
				if(isPrime(bpf))
					break;
			}
			if(number % bpf == 0) 
				number /= bpf;
		}
		
		System.out.println(bpf);
		
	}

	public static boolean isPrime(long number) {
		for(int i = 3; i < Math.sqrt((double)number); i +=2) {
			if(number % i == 0) return false;
		}
		return true;
	}
}
