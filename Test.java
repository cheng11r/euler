
public class Test {

	public static void main(String[] args) {
		
		int m , n;
		int baseover2 = 0, a = 0, c, b;
		long p = 0;
		double val;
		
		a = 1;
		while(a < 1000) {
			b = a + 1;
			c = a - 1;
			if(isPsquare(2 * a + 1))
				if(2 * a + b <= 1000000000) {
					p += 2 * a + b;
					System.out.println("ab: " + a + " -- " + b);
				}
				if(2 * a + c <= 1000000000) {
					p += 2 * a + c;
					System.out.println("ac: " + a + " -- " + c);
				}
			a++;	
		}
		
		/*
		for(m = 2; m < 10000; m++)
			for(n = 1; n < m; n++) {
				a = m * m + n * n;
				baseover2 = m * m - n * n;
				h = 2 * m * n;
				if(2 * baseover2 - a == 1 || 2 * baseover2 - a == -1) 
					if(2 * a + 2 * baseover2 <= 1000000000)
						System.out.println("m is " + m + ", n is " + n);
			}
		
		System.out.println("done");
		System.out.println(p);*/
	}

	public static boolean isPsquare(int n) {
		int temp = (int)Math.sqrt(n);
		return n == temp * temp;
	}
}
