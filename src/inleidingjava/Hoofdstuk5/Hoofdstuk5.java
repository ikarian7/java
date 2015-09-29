package inleidingjava.Hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk5 extends Applet {
	Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    
	public void init() {
		 opvulkleur = Color.MAGENTA;
	        lijnkleur = Color.BLACK;
	        breedte = 130;
	        hoogte = 60;
	}
	public void paint(Graphics g) {

		g.drawString("Lijn", 65, 53 );
		g.drawString("Rechthoek", 55, 135);
		g.drawString("Afgeronde Rechthoek", 30, 220);
		g.drawString("Gevulde Rechthoek Met Ovaal", 158, 135);
		g.drawString("Gevulde Ovaal", 208, 220);
		g.drawString("Taartpunt Met Ovaal Eromheen", 327, 135);
		g.drawString("Cirkel", 388, 220);
		g.drawLine(20, 40, 150, 40);

		g.drawRect(20, 60, breedte, hoogte);
		g.drawRoundRect(20, 140, breedte, hoogte, 20, 20);
		g.setColor(opvulkleur);
		g.fillRect(180, 60, breedte, hoogte);
		g.setColor(lijnkleur);
		g.drawOval(180, 60, breedte, hoogte);
		g.setColor(opvulkleur);
		g.fillOval(180, 140, breedte, hoogte);
		g.setColor(lijnkleur);
		g.drawOval(370, 140, 67, 67);
		g.drawOval(340, 60, breedte, hoogte);
		g.setColor(opvulkleur);
		g.fillArc(347, 62, 120, 50, 0, 50);

	}
}
