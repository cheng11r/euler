
public class Euler55 {

	public static void main(String[] args) {
		
		int count = 10000;
		String s;
		
		for(int i = 0; i < 10000; i++) {
			s = i + "";
			for(int times = 0; times < 53; times++) {
				s = Cheng11r.add(s, reverse(s));
				if(Cheng11r.isPalindrome(s)) {
					count--;
					break;
				}
			}
		}
		System.out.println(count + " Lychrel numbers");

	}
	
	public static String reverse(String s) {
		String rev = "";
		for(int i = s.length() - 1; i > -1; i--)
			rev = rev + s.charAt(i);
		return rev;
	}

}
