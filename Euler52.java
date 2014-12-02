
public class Euler52 {

	public static void main(String[] args) {
		int i;
		for(i = 1; true; i++) {
			if(Cheng11r.isPermutation(i + "", 2 * i + ""))
				if(Cheng11r.isPermutation(i + "", 3 * i + ""))
					if(Cheng11r.isPermutation(i + "", 4 * i + ""))
						if(Cheng11r.isPermutation(i + "", 5 * i + ""))
							if(Cheng11r.isPermutation(i + "", 6 * i + ""))
								break;
		}
		System.out.println(i);
	}

}
