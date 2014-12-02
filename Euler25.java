
public class Euler25 {

	public static double GR = 1.618034;
	public static double r5 = Math.sqrt(5);
	
	public static void main(String[] args) {
		
		System.out.println("ALSO DID BY HAND");
		
	}
	
	public static double getR(int n) {
		return Math.pow(GR, n) / r5;
	}

}
