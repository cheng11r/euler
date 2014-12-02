import java.util.ArrayList;

public class Euler61 {

	public static void main(String[] args) {
		
		int n;
		long num;
		String triangles = ",", squares = ",", pentagons = ",", hexagons = ",", heptagons = ",", octagons = ",";
		String all;
		
		n = 45;
		while((num = getTriangle(n)) < 10000) {
			triangles = triangles + num + ",";
			n++;
		}
		
		n = 32;
		while((num = getSquare(n)) < 10000) {
			squares = squares + num + ",";
			n++;
		}
		
		n = 26;
		while((num = getPentagon(n)) < 10000) {
			pentagons = pentagons + num + ",";
			n++;
		}
			
		n = 23;
		while((num = getHexagon(n)) < 10000) {
			hexagons = hexagons + num + ",";
			n++;
		}
		
		n = 21;
		while((num = getHeptagon(n)) < 10000) {
			heptagons = heptagons + num + ",";
			n++;
		}
		
		n = 19;
		while((num = getOctagon(n)) < 10000) {
			octagons = octagons + num + ",";
			n++;
		}
		
		
	}
	
	public static long getTriangle(int n) {
		return n * (n + 1) / 2;
	}
	
	public static long getSquare(int n) {
		return n * n;
	}
	
	public static long getPentagon(int n) {
		return n * (3 * n - 1) / 2;
	}
	
	public static long getHexagon(int n) {
		return n * (2 * n - 1);
	}
	
	public static long getHeptagon(int n) {
		return n * (5 * n - 3) / 2;
	}
	
	public static long getOctagon(int n) {
		return n * (3 * n - 2);
	}
}
