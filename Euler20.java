import java.math.BigDecimal;

public class Euler20 {

	public static void main(String[] args) {

		String number;
		int sum = 0;
		BigDecimal x = new BigDecimal(1);
		
		for(BigDecimal i = new BigDecimal(1); i.doubleValue() < 100; i = i.add(new BigDecimal(1))) {
			x = x.multiply(i.divide(new BigDecimal(10)));
			System.out.println(x);
		}

		number = x.toString();
		for(char c : number.toCharArray()) {
			if(c != '.')
				sum += c - '0';
		}
		System.out.println(sum);

		
	}

}
