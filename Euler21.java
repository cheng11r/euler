
public class Euler21 {

	public static void main(String[] args) {
		int a, b;
		int sum = 0;
		
		for(int i = 1; i <= 10000; i++) {
			a = getSumOfDivisors(i);
			b = getSumOfDivisors(a);
			if(a == b) continue;
			if(i == b) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}

	public static int getSumOfDivisors(int a) {
		int sum = 0;
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
