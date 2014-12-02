import java.util.ArrayList;

public class Euler60 {

	public static void main(String[] args) {
		
		Integer[] primes = Prime.getPrimes(1000000);
		String[] primeStrings = new String[primes.length];
		String massive = ",";
		ArrayList<String> candidates = new ArrayList<String>();
		int count;
		String[] regexes;
		boolean yn;
		
		for(int i = 0; i < primes.length; i++)
			primeStrings[i] = primes[i] + "";
		
		for(String s : primeStrings) 
			massive = massive + s + ",";
		
		System.out.println("Begin");
		
		// primes that are at the beginning of at least 4 primes
		// and at the end of at least 4 primes
		for(String s : primeStrings) {
			if(massive.matches(".*," + s + ",.*," + s + ".+," + s + ".+," + s + ".+," + s + ".+")) 
				if(massive.matches(".*," + s + ",.*\\d+" + s + ",.*\\d+" + s + ",.*\\d+" + s + ".*\\d+" + s + ".*"))
					candidates.add(s);
			if(s.equals("99991")) break;
		}
		
		regexes = new String[12];
		
		System.out.println("hey");
		for(int i = 0; i < candidates.size() - 4; i++) {
			for(int j = i + 1; j < candidates.size() - 3; j++) {
				regexes[0] = candidates.get(i) + candidates.get(j);
				regexes[1] = candidates.get(j) + candidates.get(i);
				for(int k = j + 1; k < candidates.size() - 2; k++) {
					regexes[2] = candidates.get(i) + candidates.get(k);
					regexes[3] = candidates.get(k) + candidates.get(i);
					regexes[4] = candidates.get(j) + candidates.get(k);
					regexes[5] = candidates.get(k) + candidates.get(j);
					for(int m = k + 1; m < candidates.size() - 1; m++) {
						regexes[6] = candidates.get(i) + candidates.get(m);
						regexes[7] = candidates.get(m) + candidates.get(i);
						regexes[8] = candidates.get(j) + candidates.get(m);
						regexes[9] = candidates.get(m) + candidates.get(j);
						regexes[10] = candidates.get(k) + candidates.get(m);
						regexes[11] = candidates.get(m) + candidates.get(k);
						yn = true;
						for(String regex : regexes) {
							yn = yn && massive.matches(".*," + regex + ",.*");
						}
						if(yn) {
							System.out.println(candidates.get(i));
							System.out.println(candidates.get(j));
							System.out.println(candidates.get(k));
							System.out.println(candidates.get(m));
							break;
						}
						if(candidates.get(i).equals("3")) 
							if(candidates.get(j).equals("7"))
								if(candidates.get(k).equals("109"))
									if(candidates.get(m).equals("673"))
										for(String s : regexes) System.out.println("**" + s);
					}
				}
			}
		}
		
	}
	
	
	public static int getDigitSum(String s) {
		int sum = 0;
		char[] chars = s.toString().toCharArray();
		for(char c : chars)
			sum += c - 48;
		return sum;
	}
}
