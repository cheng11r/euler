
public class Euler63 {

	public static void main(String[] args) {
		int count = 0;
		int a, b;
		
		for(b = 1; b < 25; b++) {
			for(a = 1; ; a++) {
				if(a == 10) break;
				if((int)(b * Math.log10(a) + 1) == b) {
					System.out.println(a + "^" + b);
					count++;
				}
			}
			if(a == 2) {
				System.out.println("Exiting");
				break;
			}
		}
		System.out.println(count);
	}

}
