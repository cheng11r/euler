
public class Euler36 {

	public static void main(String[] args) {
		
		String bin;
		int number, sum = 0;
		
		for(int i = 1; i < 1000000; i++) {
			bin = "";
			number = i;
			if(i % 10 == 0) continue;
			while(number > 0) {
				bin = number % 2 + bin;
				number /= 2;
			}
			if(isPalindrome(bin) && isPalindrome(i + "")) 
				sum+=i;
		}
		System.out.println(sum);
	}
	
	public static boolean isPalindrome(String s) {
		String rev = "";
		for(int i = s.length() - 1; i > -1; i--)
			rev = rev + s.charAt(i);
		return rev.equals(s);
	}
	
}
