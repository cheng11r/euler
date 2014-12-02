import java.math.BigDecimal;

public class Euler33 {

	public static void main(String[] args) {
		
		int num, denom = 0, gcd1, gcd2;
		String numerator, denominator;
		
		for(denom = 11; denom < 100; denom++)
			for(num = 11; num < denom; num++) {
				numerator = num + "";
				denominator = denom + "";
				if(denominator.indexOf(numerator.charAt(0)) >= 0 ^ 
					denominator.indexOf(numerator.charAt(1)) >= 0) {
					if(denominator.indexOf(numerator.charAt(0)) >= 0) {
						denominator = denominator.replaceFirst(numerator.charAt(0) + "", "");
						numerator = numerator.replaceFirst(numerator.charAt(0) + "", "");
					} else {
						denominator = denominator.replaceFirst(numerator.charAt(1) + "", "");
						numerator = numerator.replaceFirst(numerator.charAt(1) + "", "");
					}
					
					if(denominator.charAt(0) > numerator.charAt(0)) {
						if(numerator.charAt(0) < denominator.charAt(0)) {
							gcd1 = getGCD(num, denom);
							gcd2 = getGCD(numerator.charAt(0) - 48, denominator.charAt(0) - 48);						
							if(num / gcd1 == (numerator.charAt(0) - 48) / gcd2) 
								if(denom / gcd1 == (denominator.charAt(0) - 48) / gcd2) {
									if(num % 10 != 0 ) {
										System.out.print(num + "/" + denom + "  :  ");
										System.out.println(num/gcd1 + "/" + denom/gcd1);
									}
							}	
						}
					}	
				}
					
			}

	}
	
	public static int getGCD(int x, int y) {
		int r;
		while(x > 0) {
			r = y % x;
			y = x;
			x = r;
		}
		return y;
	}

}
