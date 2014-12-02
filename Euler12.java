
public class Euler12 {

	public static void main(String[] args) {
		
		int triNum = 0, numFactors = 0;
		int i = 1;
		
		while(numFactors < 501) {
			triNum = getSumTo(i);
			numFactors = getNumFactors(triNum);
			i++;
		}
		
		System.out.println(triNum);

	}
	
	public static int getSumTo(int num) {
		return num * ( num + 1 ) / 2;
	}
	
	public static int getNumFactors(int triNum) {
		int N = triNum;
		int count = 0, totalCount = 1;
		int lpf = PrimeHelperClass.getLowestPrimeFactor(N);
		while(N != 1) {
			if(N % lpf == 0) {
				N /= lpf;
				count++;
			}
			else {
				totalCount *= count + 1;
				count = 0;
				lpf = PrimeHelperClass.getLowestPrimeFactor(N);
			}
		}
		return totalCount * (count + 1);
	}
	
	

}
