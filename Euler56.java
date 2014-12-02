import java.math.BigInteger;

public class Euler56 {

	public static void main(String[] args) {
		
		BigInteger num;
		int max = 0, sum;
		
		for(int a = 1; a < 100; a++) {
			num = new BigInteger(a + "");
			for(int b = 0; b < 98; b++) { // makes it a ^ limit on b + 1
				num = num.multiply(new BigInteger(a + ""));
				if((sum = getDigitSum(num)) > max)
					max = sum;
			}
		}
		System.out.println(max);
	}
	
	public static int getDigitSum(BigInteger x) {
		int sum = 0;
		char[] chars = x.toString().toCharArray();
		for(char c : chars) 
			sum += c-48;
		return sum;
	}

}
