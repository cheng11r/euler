import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Euler18 {

	public static void main(String[] args) {
		int[][] a = new int[15][15];
		File tfile = new File("C:\\Users\\Benjamin\\Desktop\\triangle.txt.txt");	// i am retarded
		int i = 0, j = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(tfile));
			String line = null;
			while((line = in.readLine()) != null) {
				for(String num : line.split(" ")) {
					a[i][j] = Integer.parseInt(num);
					j++;
				}
				j = 0;
				i++;
			}
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		for(i = 13, j = 0; i > -1; j++) {
			a[i][j] += Math.max(a[i+1][j], a[i+1][j+1]);
			if(i == j) {
				j = -1;
				i--;
			}
		}
		System.out.println(a[0][0]);
	}

}
