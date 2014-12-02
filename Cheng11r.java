
public class Cheng11r {

	public static boolean isPalindrome(String s) {
		String rev = "";
		for(int i = s.length() - 1; i > -1; i--)
			rev = rev + s.charAt(i);
		return rev.equals(s);
	}

	/*
	 * note: x < y
	 */
	public static int getGCD(int x, int y) {
		int r;
		while(x > 0) {
			r = y % x;
			y = x;
			x = r;
		}
		return y;
	}
	
	public static int factorial(int n) {
		int a = 1;
		while(n > 1) 
			a *= n--;
		return a;
	}
	
	public static int getNumFactors(int n) {
		int f = 0;
		for(int i = 1; i * i < n; i++)
			if(n % i == 0) 
				f += 2;
		return f;
	}
	
	public static String[] getFactors(int n) {
		String s = "";
		for(int i = 1; i <= n / 2; i++)
			if(n % i == 0) 
				s = s.concat(i + ",");
		return s.split(",");
	}
	
	// 1 to 9 pandigital
	public static boolean isPandigital(String s) {
		return isPandigitalN(s, 9);
	}
	
	// 1 to n pandigital
	public static boolean isPandigitalN(String s, int n) {
		if(s.indexOf('0') >= 0) return false;
		if(s.length() != n) return false;
		boolean y = true;
		for(int i = 1; i <= n; i++) 
			y = y && (s.indexOf(i + "") >= 0);
		return y;
	}
	
	// 0 to 9 pandigital
	public static boolean isPandigital(String s, boolean includeZero) {
		if(!includeZero) return isPandigital(s);
		if(s.length() != 10) return false;
		boolean y = true;
		for(int i = 0; i <= 9; i++)
			y = y && (s.indexOf(i + "") >= 0);
		return y;
	}
	
	// 0 to n pandigital
	public static boolean isPandigitalN(String s, int n, boolean includeZero) {
		if(!includeZero) return isPandigitalN(s, n);
		if(s.length() != n + 1) return false;
		boolean y = true;
		for(int i = 0; i <= n; i++)
			y = y && (s.indexOf(i + "") >= 0);
		return y;
	}
	
	// adds two numbers in string form together
	public static String add(String s1, String s2) {
		int carry = 0, col, temp, diff = s1.length() - s2.length();
		String result = "";
		
		if(diff > 0) {
			for(int i = 0; i < diff; i++)
				s2 = "0" + s2;
		}	
		if(diff < 0) { 
			for(int i = 0; i < -1 * diff; i++)
				s1 = "0" + s1;
		}
		col = s1.length() - 1;
		while(col > -1) {
			temp = s1.charAt(col) + s2.charAt(col) - 96 + carry;
			result = temp % 10 + result;
			carry = temp / 10;
			col--;
		}
		result = (carry == 0 ? "" : carry) + result;
		return result;
	}
	
	public static String multiply(String multiplicand, String multiplier) {
		int carry, col = multiplier.length() - 1, temp, zeroes = 0;
		String result = "0", cur;
		
		while(col > -1) {
			carry = 0;
			cur = "";
			for(int i = multiplicand.length() - 1; i > -1; i--) {
				temp = carry + (multiplier.charAt(col) - 48) * (multiplicand.charAt(i) - 48);
				cur = temp % 10 + cur;
				carry = temp / 10;
			}
			cur = (carry == 0 ? "" : carry) + cur;
			for(int i = 0; i < zeroes; i++) 
				cur = cur + "0";
			result = Cheng11r.add(result, cur);
			zeroes++;
			col--;
		}
		return result;
	}
	
	public static boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		for(char c : s1.toCharArray())
			s2 = s2.replaceFirst(c + "", "");
		return s2.isEmpty();
	}
	
	public static boolean isPentagonal(long h) {
		double p = (Math.sqrt(24 * h + 1) + 1) / 6;
		return p == Math.floor(p);
	}
	
	public static boolean isTriangular(long h) {
		double p = (Math.sqrt(8 * h + 1) - 1) / 2;
		return p == Math.floor(p);
	}
	
	public static boolean isSquare(long h) {
		double p = Math.sqrt(h);
		return p == Math.floor(p);
	}
	
	public static boolean isHexagonal(long h) {
		double p = (Math.sqrt(8 * h + 1) + 1) / 4;
		return p == Math.floor(p);
	}
	
	public static boolean isHeptagonal(long h) {
		double p = (Math.sqrt(40 * h + 9) + 3) / 10;
		return p == Math.floor(p);
	}
	
	public static boolean isOctagonal(long h) {
		double p = (Math.sqrt(3 * h + 1) + 1) / 3;
		return p == Math.floor(p);
	}
}
