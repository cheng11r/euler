/*
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the 
 * digits 0 to 9 in some order, but it also has a rather interesting sub-string 
 * divisibility property.
 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
 * 
 * d2d3d4=406 is divisible by 2
 * d3d4d5=063 is divisible by 3
 * d4d5d6=635 is divisible by 5
 * d5d6d7=357 is divisible by 7
 * d6d7d8=572 is divisible by 11
 * d7d8d9=728 is divisible by 13
 * d8d9d10=289 is divisible by 17
 * Find the sum of all 0 to 9 pandigital numbers with this property.
 */

public class Euler43 {

	public static void main(String[] args) {
		
		String g234, g567, g890, s, answer = "0";
		int i234, i567, i890;
		
		for(i234 = 12; i234 < 987; i234 += 2) {
			if(i234 < 100) g234 = "0" + i234;
			else g234 = i234 + "";
			for(i567 = 14; i567 < 987; i567 += 7) {
				if(i567 < 100) g567 = "0" + i567;
				else g567 = i567 + "";
				for(i890 = 17; i890 < 987; i890 += 17) {
					if(i890 < 100) g890 = "0" + i890;
					else g890 = i890 + "";
					s = addMissing(g234 + g567 + g890);
					if(isValid(s))
						if(Cheng11r.isPandigital(s, true))
							answer = add(answer, s);
				}
			}
		}
		System.out.println(answer);
	}

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
	
	public static String addMissing(String s) {
		for(int i = 0; i < 10; i++)
			if(s.indexOf(i + "") < 0) return i + s;
		return s;
	}
	
	public static boolean isValid(String s) {
		// at this point, already insured divisibility by 2, 7, and 17
		// need to check 3, 5, 11, 13
		return Integer.parseInt(s.substring(2, 5)) % 3 == 0
				&& Integer.parseInt(s.substring(3, 6)) % 5 == 0
				&& Integer.parseInt(s.substring(5, 8)) % 11 == 0
				&& Integer.parseInt(s.substring(6, 9)) % 13 == 0;
	}
}

