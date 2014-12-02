public class Euler30 {

	public static void main(String[] args) {
		String s;
		double sum;
		int answer = 0;
		for(int i = 10; i < 354294; i++) {
			sum = 0;
			s = Integer.toString(i);
			for(char c : s.toCharArray()) {
				sum += Math.pow(Integer.parseInt(c + ""), 5);
			}
			if(i == sum) {
				answer += i;
			}
		}
		System.out.println(answer);
	}
}
