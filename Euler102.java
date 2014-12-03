import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Euler102 {

	public static void main(String[] args) {
		
		int answer = 0;
		int x1,x2,x3;
		int y1,y2,y3;
		File file = new File("C:\\Users\\Benjamin\\Desktop\\p102_triangles.txt");
		System.out.println("begin");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = null;
			String[] coords;
			Vector A, B, C;
			Vector v0, v1, v2;
			double s, t;
			
			while((line = in.readLine()) != null) {
				coords = line.split(",");
				x1 = Integer.parseInt(coords[0]);
				y1 = Integer.parseInt(coords[1]);
				x2 = Integer.parseInt(coords[2]);
				y2 = Integer.parseInt(coords[3]);
				x3 = Integer.parseInt(coords[4]);
				y3 = Integer.parseInt(coords[5]);
				A = new Vector(x1, y1);
				B = new Vector(x2, y2);
				C = new Vector(x3, y3);
				v2 = new Vector(0,0).subtract(A);
				v0 = C.subtract(A);
				v1 = B.subtract(A);
				s = (v2.dot(v0)*v1.dot(v1) - v2.dot(v1)*v1.dot(v0)) / (v0.dot(v0)*v1.dot(v1) - v0.dot(v1)*v1.dot(v0));
				t = (v2.dot(v1) - s * v0.dot(v1)) / v1.dot(v1);
				
				if(s >= 0 && t >= 0 && s + t < 1)
						answer++;
				System.out.println(s + " " + t);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println(answer);
	}
	
	public static class Vector {
		private int x;
		private int y;
		
		public Vector(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Vector subtract(Vector v) {
			return new Vector(x - v.x, y - v.y);
		}
		
		public double dot(Vector v) {
			return (double)x * (double)v.x + (double)y * (double)v.y;
		}
		
		public String toString() {
			return ": " + x + " " + y;
		}
	}

}
