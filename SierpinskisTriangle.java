
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SierpinskisTriangle extends JFrame implements MouseListener {

	public SierpinskisTriangle() {
		setPreferredSize(new Dimension(1000, 800));
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SierpinskisTriangle t = new SierpinskisTriangle();
		t.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void drawTriangle(int x, int y, int size, Graphics g) {
		int height = (int)Math.sqrt(size * size - (size / 2) * (size / 2));
		g.drawLine(x , y + height, x + size / 2, y);
		g.drawLine(x, y + height, x + size, y + height);
		g.drawLine(x + size / 2, y, x + size, y + height);
	}
	
	public void paint(Graphics g) {
		sierpinski(0,0,1000,g);
	}
	
	public void sierpinski(int x, int y, int size, Graphics g) {
		int height = (int)Math.sqrt(size * size - (size / 2) * (size / 2));
		if(size > 5) {
			drawTriangle(x, y, size, g);
			sierpinski(x, y + height / 2, size / 2, g);
			sierpinski(x + size / 4, y, size / 2, g);
			sierpinski(x + size / 2, y + height / 2, size / 2, g);
		}
		try {
			Thread.sleep(1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
