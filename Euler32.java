import java.util.Arrays;
import java.util.HashSet;

public class Euler32 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		String a, b, c;
		int product, i, j, sum = 0;

		for(i = 1; i <= 9876; i++)
			for(j = 1; j <= 99; j++) {
				product = i * j; 
				a = i + "";
				b = j + "";
				c = product + "";
				if((a + b + c).length() == 9)
					if((a + b + c).matches("[^0]*"))
						if(isPandigital(a + b + c)) 
							set.add(product);
			}
		
		for(int num : set)
			sum += num;
		
		System.out.println(sum);
		
	}

	public static boolean isPandigital(String s) {
		boolean[] x = new boolean[9];
		char[] chars = s.toCharArray();
		for(char c : chars)
			x[c - 48 - 1] = true;
		boolean y = true;
		for(boolean b : x)
			y = y && b;
		return y;
	}
}
