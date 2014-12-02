
public class Euler5 {

	public static void main(String[] args) {

		int answer = 20 * 19;
		boolean exit;
		
		while(true) {
			exit = true;
			for(int i=1; i<=20; i++) {
				if(answer % i != 0)
					exit = false;
			}
			if(exit)
				break;
			answer += 20;
		}
		
		System.out.println(answer);

	}

}
