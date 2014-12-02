
public class Euler38 {

	public static void main(String[] args) {
		
		String greatest = "918273645";
		int n;
		String pandy;
		
		for(int i = 1; i < 10000; i++) {
			if((i + "").charAt(0) != '9') continue;
			n = 0;
			pandy = "";
			do {
				n++;
				pandy = pandy + (i * n);
			} while(isValid(pandy));
			pandy = pandy.replaceAll(n * i + "", "");
			if(Cheng11r.isPandigital(pandy))
				if(pandy.compareTo(greatest) > 0) {
					greatest = pandy;
					System.out.println("greatest is now " + greatest);
				}
		}

		
	}

	public static boolean isValid(String pandy) {
		char[] digs = pandy.toCharArray();
		for(int i = 0; i < digs.length; i++)
			for(int j = i + 1; j < digs.length; j++)
				if(digs[i] == digs[j]) return false;
		return true;
	}
	
}
