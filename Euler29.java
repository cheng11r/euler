import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;

public class Euler29 {

	public static void main(String[] args) {
		Point2D.Double z;
		double a, b;
		int count = 0, rejected = 0, realcount = 0;;
		boolean isDuplicate = false;
		ArrayList<Point2D.Double> powers = new ArrayList<Point2D.Double>(10000);
		
		for(a = 2.0; a <= 100; a++) {
			for(b = 2.0; b <= 100; b++) {
				realcount++;
				isDuplicate = false;
				for(Point2D.Double p : powers) {
					if(Math.pow(p.x, p.y) == Math.pow(a, b)) {
						isDuplicate = true; 
						rejected++;
						break;
					}
				}
				if(!isDuplicate) {
					count++;
					powers.add(new Point2D.Double(a, b));
				}
			}
		}
		
		
		System.out.println(count);
	}

}
