import java.util.ArrayList;
import java.util.HashSet;

public class Euler23 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> a = new HashSet<Integer>();
		
		long total = (28123 * 28124) / 2;
		int sum;
		for(int i = 1; i <= 28123; i++)
			if(isAbundant(i)) list.add(i);
		
		for(int i = 0; i < list.size(); i++) 
			for(int j = i; j < list.size(); j++)
				if((sum = list.get(i) + list.get(j)) <= 28123)
					a.add(sum);
	
		for(int x : a) {
			total -= x;
		}
		System.out.println(total);
		
	}
	
	public static boolean isAbundant(int n) {
		if(n < 12) return false;
		int sum = 0;
		for(String s : getFactors(n))
			sum += Integer.parseInt(s);
		return sum > n;
	}

	public static String[] getFactors(int n) {
		String s = "";
		for(int i = 1; i <= n / 2; i++)
			if(n % i == 0) 
				s = s.concat(i + ",");
		return s.split(",");
	}
}
