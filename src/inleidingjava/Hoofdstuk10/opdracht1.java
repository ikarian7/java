package inleidingjava.Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1 extends Applet {
	
 int a,b;
 TextField tekstvak1,tekstvak2;
 Label label;
 String tekst1,tekst2;
 
 public void init() {
  tekstvak1 = new TextField ("Nr1",25);
  tekstvak2 = new TextField ("Nr2",25);
  tekstvak1.addActionListener( new Tekstvak1Listener() );
  tekstvak2.addActionListener( new Tekstvak2Listener() );
  tekst1 =  "";
  tekst2 =  "";
  label = new Label ("Zet 2 cijfers in de vakjes");
  add (tekstvak1);
  add (tekstvak2);
  add (label);
 }
 
 public void paint(Graphics g) {
  g.drawString(""+tekst1, 50, 70);
 }
 
   class Tekstvak1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String tekst1;
            tekst1 = tekstvak1.getText();
            tekst2 = tekstvak2.getText();
            a = Integer.parseInt( tekst1 );
            b = Integer.parseInt( tekst2 );
            if (a > b) {
                tekst1 = "" + a + " is groter en  "+ a +  " is kleiner";
                repaint();
            }
            else  {
             tekst1 = "" + b + " is groter en  "+ a+  " is kleiner";
             repaint();
            }
        }
    }
     class Tekstvak2Listener implements ActionListener {
      public void actionPerformed( ActionEvent e ) {
       String tekst2;
       tekst1 = tekstvak1.getText();
       tekst2 = tekstvak2.getText();
       a = Integer.parseInt( tekst1 );
       b = Integer.parseInt( tekst2 );
       if (b > a) {
        tekst1 = "" + b + " is groter en  " + a +  " is kleiner";
        repaint();
       }
       else {
        tekst1 = "" + a + " is groter en  "+ a +  " is kleiner";
        repaint();
       }
      }
     }
}
