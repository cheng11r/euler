import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Euler99 {

	public static void main(String[] args) {
		
		int linenum = 0, greatestLine = 0;
		double greatestPower = 0, power;
		double a, b;
		
		File file = new File("C:\\Users\\Benjamin\\Desktop\\p099_base_exp.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = null;
			String[] base_exp;
			while((line = in.readLine()) != null) {
				linenum++;
				base_exp = line.split(",");
				a = Double.parseDouble(base_exp[0]);
				b = Double.parseDouble(base_exp[1]);
				power = b * Math.log10(a);
				if(power > greatestPower) {
					System.out.println("!");
					greatestLine = linenum;
					greatestPower = power;
				}
			}
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(greatestLine);
		
	}
}
