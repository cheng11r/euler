
public class Euler44 {

	public static void main(String[] args) {
		boolean exit = false;
		long D = 1000000000;
		long sum, diff;
		long Pj, Pk;
		
		for(int j = 1; true; j++) {
			Pj = (3 * j * j - j) / 2;
			for(int k = j; true; k++) {
				Pk = (3 * k * k - k) / 2;
				sum = Pj + Pk;
				diff = Pk - Pj;
				if(diff > D) {
					break;
				}
				if(isPentagonal(sum) && isPentagonal(diff)) {
					D = diff;
					exit = true;
					break;
				}
			}
			if(exit) break;
		}
		System.out.println(D);
	}

	public static boolean isPentagonal(long h) {
		double p = (Math.sqrt(24 * h + 1) + 1) / 6;
		return p == Math.floor(p);
	}
}
