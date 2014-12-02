import java.util.ArrayList;

public class Euler26 {

	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		int divisor, greatest = 0, greatestlen = 0, curr;
		
		for(divisor = 2; divisor <= 1000; divisor++) {
			if((curr = getRepetitionLength(1, divisor)) > greatestlen) {
				greatestlen = curr;
				greatest = divisor;
			}
			list.clear();
		}
		System.out.println(greatest + " -> " + greatestlen);

	}
	
	public static int getRepetitionLength(int dividend, int divisor) {
		if(list.contains(dividend)) return 0;
		list.add(dividend);
		if(divisor > dividend) 
			return 1 + getRepetitionLength(dividend * 10, divisor);
		return getRepetitionLength(dividend % divisor, divisor);
	}

}
