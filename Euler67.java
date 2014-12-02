import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Euler67 {

	public static void main(String[] args) {
		int[][] a = new int[100][100];
		File tfile = new File("C:\\Users\\Benjamin\\Desktop\\p067_triangle.txt");
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
		} catch(Exception e) {
			e.printStackTrace();
		}
		for(i = 98, j = 0; i > -1; j++) {
			a[i][j] += Math.max(a[i+1][j], a[i+1][j+1]);
			System.out.println(i + " " + j + " is " + a[i][j]);
			if(i == j) {
				j = -1;
				i--;
			}
		}
		System.out.println(a[0][0]);
	}

}