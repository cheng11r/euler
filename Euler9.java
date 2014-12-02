public class Euler9 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		for(a = 1; a < 500; a++) {
			for(b = 1; b < 500; b++) {
				for(c = 1; c < 500; c++) {
					if(a + b + c == 1000 && a*a + b*b == c*c) System.out.println(a*b*c);
				}
			}
		}
		
	}
}