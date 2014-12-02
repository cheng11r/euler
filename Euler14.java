import java.util.HashMap;


public class Euler14 {

	public static void main(String[] args) {
		
		HashMap<Long, Integer> clMap = new HashMap<Long, Integer>(1000000);
		Integer greatestChainLength = 0;
		Long start, bestStart = (long)2;
		Integer chainLen;
		
		for(long i=2; i < 1000000; i = start + 1) {
			chainLen = 1;
			start = i;
			while(i != 1) {
				if(i % 2 == 0) i /= 2;
				else i = 3 * i + 1;
				if(!clMap.containsKey(i)) {
					chainLen++;
				} else {
					chainLen += (int)clMap.get(i);
					break;
				}
			}
			clMap.put(start, chainLen);
			if(chainLen > greatestChainLength) {
				greatestChainLength = chainLen;
				bestStart = start; 
			}
		}
		
		System.out.println(bestStart);

	}

}
