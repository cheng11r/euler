
public class Euler51 {

	public static void main(String[] args) {
	
		Integer[] primes = Prime.getPrimes(1000000);
		int count;
		String pattern, pattern2;
		
		for(int x : primes) {
				if((pattern = x + "").matches("\\d+0\\d*0\\d*0\\d+")) { // can't start or end w/ 0
					count = 1;
					for(int i = 1; i < 10; i++) {
						pattern2 = pattern.replaceAll("0", i + "");
						if(Prime.isPrime(Integer.parseInt(pattern2))) 
							count++;
					}
					if(count == 8) System.out.println(pattern + "wahoo");
				}
			}
		for(int x : primes) {
			if((pattern = x + "").matches("\\d*1\\d*1\\d*1\\d*")) { // free
				count = 1;
				for(int i = 2; i < 10; i++) {
					pattern2 = pattern.replaceAll("1", i + "");
					if(Prime.isPrime(Integer.parseInt(pattern2)))
						count++;
				}
				if(count == 8) System.out.println(pattern + "wooha");
			}
		}
		
		for(int x : primes) {
			if((pattern = x + "").matches("\\d*2\\d*2\\d*2\\d+")) { // can't end in 2
				count = 1;
				for(int i = 3; i < 10; i++) {
					pattern2 = pattern.replaceAll("2", i + "");
					if(Prime.isPrime(Integer.parseInt(pattern2)))
						count++;
				}
				if(count == 8) System.out.println(pattern + "woohoo");
			}
		}
		
		}
	
}
