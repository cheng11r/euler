
public class Euler28 {

	public static void main(String[] args) {
		
		int sum = 1;
		
		for(int i = 3; i < 1002; i+=2) {
			sum += i * (i - 1) + 1;	// top left diag
			sum += i * i;			// top right diag
			sum += i * i - 3 * i + 3;	// bottom right diag
			sum += i * i - 2 * i + 2;	// bottom left diag
		}
		
		System.out.println(sum);

	}

}
