package inleidingjava.hoofdstuk78;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht3 extends Applet {
	
 TextField tekstvak;
 Button knop;
 Label label;
 double getal;

 public void init() {
	 
  tekstvak = new TextField("", 20);
  knop = new Button("Ok");
  label = new Label("Type een getal");
  knop.addActionListener( new okListener1() );
  tekstvak.addActionListener( new TekstvakListener1() );
  add(label);
  add(tekstvak);
  add(knop);
 }
 public void paint(Graphics g) {
  g.drawString("Het getal is " + getal*1.19, 50, 60);
 }
 
 class TekstvakListener1 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String s = tekstvak.getText();
   getal = Double.parseDouble( s );
   repaint();
  }
 }
 class okListener1 implements ActionListener  {
  public void actionPerformed( ActionEvent e ) {
   String s = tekstvak.getText();
   getal = Double.parseDouble( s );
   repaint();
  }
 }
}
