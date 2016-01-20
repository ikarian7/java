// Hoofdstuk 13
package inleidingjava.Hoofdstuk13;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Praktijkopdracht van het type Applet.
public class praktijkopdracht extends Applet {
 int x = 100;
 int xx = 80;
 // Een (lege) methode die de Applet gaat initialiseren.
 public void init() {
  setSize(800,200);
 }

 public void tekenboom( Graphics g, int x1, int y1, int x2, int y2) {
  g.setColor(Color.RED);
  g.fillRect(x1, y1, 20, 60);
  g.setColor(Color.GREEN);
  g.fillOval(x2, y2, 60, 60);
}
 public void paint(Graphics g) {
  for (int teller = 0; teller < 8; teller++) {
   x += 100;

  tekenboom(g,x,120,x - 20,60);
  }
 }

 class OkListener implements ActionListener {
  public void actionPerformed( ActionEvent e ) {

  }
 }
}