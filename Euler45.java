public class Euler45 {

	public static void main(String[] args) {
		int start = 145;
		long h = 0;
		for(int i = 0; true; i++) {
			h = 2 * (i + start) * (i + start) - (i + start);
			if(isTriangle(h) && isPentagonal(h)) break;
		}
		System.out.println(h);
	}
	
	public static boolean isTriangle(long h) {
		double t = (Math.sqrt(8 * h + 1) - 1) / 2;
		return t == Math.floor(t);
	}
	
	public static boolean isPentagonal(long h) {
		double p = (Math.sqrt(24 * h + 1) + 1) / 6;
		return p == Math.floor(p);
	}

	
}
