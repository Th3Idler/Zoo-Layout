import javax.swing.*;

import java.awt.*;

final public class Dolphin {

JFrame frame;

DrawPanel drawPanel;

private int oneX = 7;

private int oneY = 7;

private int x = 300;
private int y = 250;

boolean up = false;

boolean down = true;

boolean left = false;

boolean right = true;

public static void main(String[] args) {

new Dolphin().go();

}

public void go() {

frame = new JFrame("Dolphin");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

drawPanel = new DrawPanel();

frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

frame.setVisible(true);

frame.setSize(300, 300);

frame.setLocation(375, 55);

//moveIt();

}

class DrawPanel extends JPanel {

public void paintComponent(Graphics g) {
	
	g.setColor (Color.CYAN);
	g.fillRect(0,0,5000,5000);

drawAnimal(g);
}

private void drawHabitat(Graphics g)
{

}
private void drawAnimal(Graphics g)
{
	//dolphin
	g.setColor (Color.gray);
	g.fillOval(oneX+100, oneY+150, 300, 100);
	g.setColor (Color.gray);
	g.fillOval(oneX+200, oneY+120, 50, 200);
	g.setColor (Color.gray);
	g.fillOval(oneX+250, oneY+190, 200, 50);
	g.setColor (Color.black);
	g.fillOval(oneX+350, oneY+190, 10, 10);
	g.setColor (Color.gray);
	g.fillOval(oneX, oneY+180, 200, 50);
	g.setColor (Color.gray);
	g.fillOval(oneX, oneY+155, 50, 100);
	g.setColor (Color.black);
	g.fillOval(oneX+372, oneY+213, 80, 3);
	Graphics2D g2d = (Graphics2D) g;
	GradientPaint gp3 = new GradientPaint(5, 25,
					
			//gradient
			Color.gray, 2, 2, Color.white, true);
			g2d.setPaint(gp3);
		
		//body of dolphin
	g.fillOval(oneX+100, oneY+150, 300, 100);
	g.fillOval(oneX+200, oneY+120, 50, 200);
	g.fillOval(oneX+250, oneY+190, 200, 50);
	g.fillOval(oneX, oneY+180, 200, 50);
	g.fillOval(oneX, oneY+155, 50, 100);
		
		//eye
	g.setColor(Color.black);
	g.fillOval(oneX+350, oneY+190, 10, 10);
		
		//mouth
	g.setColor (Color.black);
	g.fillOval(oneX+372, oneY+213, 80, 3);  
			
	//Bubbles
	//600,,600,800,700,800,650,
	g.setColor (Color.white);
	g.fillOval(900, oneY+250  , 50, 50);
	g.setColor (Color.white);
	g.fillOval(900, oneY+250  , 50, 50);
	g.setColor (Color.white);
	g.fillOval(1100, oneY+250 , 30, 30);
	g.setColor (Color.white);
	g.fillOval(1000, oneY+150 , 70, 70);
	g.setColor (Color.white);
	g.fillOval(1100, oneY+50 , 20, 20);
	g.setColor (Color.white);
	g.fillOval(950, oneY+100 , 50, 50);
	g.setColor (Color.white);
	g.fillOval(900, oneY , 60, 60);
	

	
	
}
}
/*
private void moveIt() {

while(true){

if(oneX >= 300){

right = false;

left = true;

}

if(oneX <= 50){

right = true;

left = false;

}

if(oneY >= 259){

up = true;

down = false;

}

if(oneY <= 7){

up = false;

down = true;

}

if(up){

oneY--;

}

if(down){

oneY++;

}

if(left){

oneX--;

}

if(right){

oneX++;

}

try{

Thread.sleep(10);

} catch (Exception exc){}

frame.repaint();

}

}
*/
}