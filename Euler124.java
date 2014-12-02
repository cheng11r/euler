import java.util.Arrays;
import java.util.HashMap;

public class Euler124 {

	public static void main(String[] args) {
		
		Integer[] pfc;	// prime factor candidates
		int n, rad, i, count;
		int[] rads = new int[100000];
		int[] temp = new int[100000];
		
		rads[0] = 1;
		pfc = Prime.getPrimes(100000);
		for(n = 2; n <= 100000; n++) {
			rad = 1;
			for(Integer p : pfc) {
				if(p > n) break;
				if(n % p == 0) rad *= p;
			}
			rads[n-1] = rad;
		}
		
		int min = 1;
		count = 0;
		while(count < 10000) {
			for(i = 0; i < rads.length; i++)
				if(rads[i] == min) {
					temp[i] = ++count;
				}
			min++;
		}
		for(i = 0; i < rads.length; i++)
			if(temp[i] == 10000) System.out.println(i + 1);

	}

}
