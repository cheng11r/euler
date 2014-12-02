
public class Euler6 {

	public static void main(String[] args) {

		int sumOfSquares = 0;
		int squareOfSum;
		
		for(int i=1; i<=100; i++) {
			sumOfSquares += (i * i);
		}
		squareOfSum = (int)(Math.pow(100, 4) + 2 * Math.pow(100, 3) + 100 * 100) / 4;
		
		System.out.println(squareOfSum - sumOfSquares);
	}
	

}
