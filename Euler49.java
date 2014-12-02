
public class Euler49 {

	public static void main(String[] args) {
		
		int prime = 1488;
		int up1 = 0, up2 = 0;

		while(true) {
			up1 = prime + 3330;
			up2 = up1 + 3330;
			if(isPermutation(prime + "", up1 + "") && isPermutation(up1 + "", up2 + ""))
				if(Prime.isPrime(up1) && Prime.isPrime(up2)) 
					break;
			prime = Prime.getNextPrime(prime);
		}
		System.out.println(prime);
		System.out.println(up1);
		System.out.println(up2);
		
	}

	public static boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		for(char c : s1.toCharArray())
			s2 = s2.replaceFirst(c + "", "");
		return s2.isEmpty();
	}
}
