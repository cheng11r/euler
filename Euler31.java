
public class Euler31 {

	public static void main(String[] args) {
		int answer = 0;
		for(int pence = 0; pence <= 200; pence++) {
			for(int two_pence = 0; two_pence <= 100; two_pence++) {
				for(int fpence = 0; fpence <= 40; fpence++) {
					for(int ten_pence = 0; ten_pence <= 20; ten_pence++) {
						for(int twenty = 0; twenty <= 10; twenty++) {
							for(int fifty = 0; fifty <= 4; fifty++) {
								for(int one = 0; one <= 2; one++) {
									for(int two = 0; two <= 1; two++) {
										if(pence + 2 * two_pence + 5 * fpence + 10 * ten_pence + 
												+ 20 * twenty + 50 * fifty + 100 * one + 
												200 * two == 200) {
											answer++;
											System.out.println(pence + " pence " + 
											two_pence + " two " + fpence + " five " + 
													ten_pence + " tens " + twenty + " twenty " +
											fifty + " 50s " + one + " ones " + two + " twos");
										}
									}	
								}
							}
						}
					}
				}
			}
		}
		System.out.println(answer);
	}

}
