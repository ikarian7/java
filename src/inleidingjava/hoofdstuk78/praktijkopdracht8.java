package inleidingjava.hoofdstuk78;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijkopdracht8 extends Applet {
 TextField tekstvak1;
 TextField tekstvak2;
 Button knopplus;
 Button knopmin;
 Button knopkeer;
 Button knopdelen;
 double getal1;
 double getal2;
 double uitkomst;
 String s ="";

 public void init(){
  tekstvak1 = new TextField("",20);
  tekstvak2 = new TextField("",20);
  add(tekstvak1);
  add(tekstvak2);

  knopplus = new Button("+");
  knopmin = new Button("-");
  knopkeer = new Button("*");
  knopdelen = new Button("/");

  knopplus.addActionListener( new KnopplusListener());
  knopmin.addActionListener( new KnopminListener());
  knopkeer.addActionListener( new KnopkeerListener());
  knopdelen.addActionListener( new KnopdelenListener());

  this.add(knopplus);
  this.add(knopmin);
  this.add(knopkeer);
  this.add(knopdelen);
   }
 
 public void paint(Graphics g) {
   }
 
 class KnopplusListener implements ActionListener {
  public void actionPerformed(ActionEvent e){
   s = tekstvak1.getText();
   getal1 = Double.parseDouble( s);

   s = tekstvak2.getText();
   getal2 = Double.parseDouble( s);
   uitkomst = getal1 + getal2;

   tekstvak1.setText("" + uitkomst);
   tekstvak2.setText("");
  }
 }
 
 class KnopminListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   s = tekstvak1.getText();
   getal1 = Double.parseDouble( s);

   s = tekstvak2.getText();
   getal1 = Double.parseDouble( s);
   uitkomst = getal1 - getal2;

   tekstvak1.setText("" + uitkomst);
   tekstvak2.setText("");
  }
 }

 class KnopkeerListener implements ActionListener{
  public void actionPerformed (ActionEvent e){
   s = tekstvak1.getText();
   getal1 = Double.parseDouble( s);

   s = tekstvak2.getText();
   getal2 = Double.parseDouble( s);
   uitkomst = getal1 * getal2;
   tekstvak1.setText("" + uitkomst);
   tekstvak2.setText("");
  }
 }
 
 class KnopdelenListener implements ActionListener{
  public void actionPerformed (ActionEvent e){
   s = tekstvak1.getText();
   getal1 = Double.parseDouble( s);
   s = tekstvak2.getText();
   getal2 = Double.parseDouble( s);
   uitkomst = getal1 / getal2;
   tekstvak1.setText("" + uitkomst);
   tekstvak2.setText("");
  }
 }
}
