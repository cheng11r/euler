import java.util.HashMap;

public class Euler39 {

	/*	if p is the perimeter of a right angle triangle with int side lengths
	 *  {a,b,c} there are exactly three solns for p = 120.
	 *  {20,48,52}, {24,45,51}, {30,40,50}
	 *  for which value of p <= 1000 is the number of solutions maximized?
	 */
	
	public static void main(String[] args) {

		int greatest = 12;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int c = 3; c < 400; c++)
			for(int b = 1; b < c; b++)
				for(int a = 1; a < b; a++)
					if(a * a + b * b == c * c) {
						if(map.containsKey(a + b + c))
							map.put(a + b + c, map.get(a + b + c) + 1);
						else
							map.put(a + b + c, 1);
					}
		for(Integer num : map.keySet())
			if(map.get(num) > map.get(greatest)) greatest = num;
		
		System.out.println(greatest + " -> " + map.get(greatest));
	}

}
