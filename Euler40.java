
public class Euler40 {

	public static void main(String[] args) {

		int product = 1, length = 0, flag = 1;
		int clen;
		
		for(int i = 1; length <= 1000000; i++) {
			length += (clen = (i + "").length());
			if(length == flag) {
				product *= i % 10;				
				flag *= 10;
			} else if(length > flag) {
				product *= (i + "").charAt(flag - (length - clen) - 1) - '0';
				flag *= 10;
			}
		}
		System.out.println(product);

	}

}
