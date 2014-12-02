
public class Euler2 {

	public static void main(String[] args) {
		int term1 = 1, term2 = 2, termnumber = 2, sum = 0, store;
		while(term2 < 4000000) {
			if((termnumber - 2) % 3 == 0) {
				sum += term2;
			}
			store = term2;
			term2 = fib(term1, term2);
			term1 = store; 
			termnumber++;
		}
		System.out.println(sum);
	}

	public static int fib(int t1, int t2) {
		return t1 + t2;
	}
}
