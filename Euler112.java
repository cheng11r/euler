import java.math.BigDecimal;

public class Euler112 {

	public static void main(String[] args) {

		int numBouncy = 0;
		for(int i = 2; ; i++) {
			if(isBouncy(i)) {
				numBouncy++;
			}
			if(numBouncy * 100 == (99 * i)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isBouncy(int i) {
		boolean isD = true, isI = true;
		int n = i % 10;
		int m;
		i /= 10;
		while(i > 0) {
			m = i % 10;
			if(n > m) isD = false;
			if(n < m) isI = false;
			n = m;
			i /= 10;
		}
		return !(isD || isI);
	}

}
