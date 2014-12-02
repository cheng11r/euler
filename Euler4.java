
public class Euler4 {

	public static void main(String[] args) {
		Integer a=0, b=0;
		Integer p, greatestP = 0;
		
		for(a = 100; a <= 999; a++) {
			for(b = 100; b <= 999; b++) {
				p = a * b;
				if(isPalindromic(p))
					if(p > greatestP)
						greatestP = p;
			}
		}
		
		System.out.println("greatest p = " + greatestP);
	}

	public static boolean isPalindromic(Integer n) {
		String num = n.toString();
		int len = num.length();
		return num.charAt(0) == num.charAt(len - 1) 
				&& num.charAt(1) == num.charAt(len - 2)
				&& num.charAt(2) == num.charAt(len - 3);
	}
}
