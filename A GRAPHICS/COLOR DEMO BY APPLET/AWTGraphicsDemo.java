

import java.awt.*;
	
public class AWTGraphicsDemo extends Frame {
       
   public AWTGraphicsDemo()
   {
       this.setSize(400,400);
       this.setVisible(true);
   
   }

  public void paint(Graphics g) {
      g.setColor(Color.GRAY);
      Font font = new Font("Serif", Font.PLAIN, 24);
      g.setFont(font);
      g.drawString("Welcome to mero world ", 50, 150);  

      // System.out.println( g.getFontMetrics(font));
	
		FontMetrics fm = g.getFontMetrics();
		System.out.println(fm.getAscent());
  //rectangle using lines
		g.drawLine(250,100,350,100);
		g.drawLine(250,100,250,150);
		g.drawLine(250,150,350,150);
		g.drawLine(350,100,350,150);

		g.setColor(Color.RED);
		g.drawRect(400,400,40,50);

		g.fillRect(500,500,40,50);

		g.drawOval(100,100,40,50);
		g.fillOval(150,150,40,50);

		// arc
		g.drawArc(300,300,50,50,20,110);
		g.fillArc(370,370,50,50,20,110);
		g.fillArc(390,390,50,50,0,-70);


		// polygon
		int[] xValues = {300,400,100,50,80};
		int[] yValues = {50,100,150,80,180};
		Polygon p = new Polygon(xValues,yValues,5);
		g.drawPolygon(p);

 }
  


   public static void main(String[] args){
      new AWTGraphicsDemo();
   }
}



