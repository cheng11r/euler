
public class Euler34 {

	public static void main(String[] args) {
		long sum = 0;
		
		for(int i = 10; i < 1000000; i++) {
			if(fuck(i) == i) sum+=i;
		}
		System.out.println(sum);
	}

	public static long fuck(int n) {
		char[] digs = Integer.toString(n).toCharArray();
		long sum = 0;
		for(char c : digs) {
			sum += factorial(c - 48);
		}
		return sum;
	}
	
	public static int factorial(int n) {
		int a = 1;
		while(n > 1) 
			a *= n--;
		return a;
	}
}
