public class Euler1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i < 1000; i++)
			if(isMultOfFive(i) || isMultOfThree(i)) {
				sum += i;
				System.out.println(i);
			}
		
		System.out.println(sum);

	}

	public static boolean isMultOfFive(int num) {
		return(num % 5 == 0);
	}
	
	public static boolean isMultOfThree(int num) {
		return(num %3 == 0);
	}
}
