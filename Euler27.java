
public class Euler27 {

	public static void main(String[] args) {
		
		int a, b, count, q;
		int greatestCount = 0, bestA = 1, bestB = 1;

		for(a = -999; a < 1000; a++) {
			for(b = -999; b < 1000; b++) {
				count = 0;
				for(int n = 0; ; n++) {
					q = n * n + a * n + b;
					if(PrimeHelperClass.isPrime(q) && q != 1)
						count++;
					else break;
				}
				if(count > greatestCount) {
					greatestCount = count;
					bestA = a;
					bestB = b;
				}
			}
		}
	
		System.out.println(bestA + " and " + bestB);
		
	}

}
