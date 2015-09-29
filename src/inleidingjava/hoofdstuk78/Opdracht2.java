package inleidingjava.hoofdstuk78;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
  Button knop1;
  Button knop2;
  Button knop3;
  Button knop4;
  double cijfer1,cijfer2,cijfer3,cijfer4,totaal,optel;

 public void init() {
    optel = 1;
    cijfer1 = 0;
    cijfer2 = 0;
    cijfer3 = 0;
    cijfer4 = 0;
    totaal = 0;

    knop1 = new Button();
    knop2 = new Button();
    knop3 = new Button();
    knop4 = new Button();

    knop1.setLabel("Volwassen man");
    knop2.setLabel("Volwassen vrouw");
    knop3.setLabel("Leerling man");
    knop4.setLabel("Leerling vrouw");

    Knop1Listener kl = new Knop1Listener();
             knop1.addActionListener( kl );
    Knop2Listener k2 = new Knop2Listener();
             knop2.addActionListener( k2 );
    Knop3Listener k3 = new Knop3Listener();
             knop3.addActionListener( k3 );
    Knop4Listener k4 = new Knop4Listener();
             knop4.addActionListener( k4 );

    add (knop1);
    add (knop2);
    add (knop3);
    add (knop4);



   }

  public void paint(Graphics g) {
   g.drawString("Volwassen mannen "+cijfer1,50,50);
   g.drawString("Volwassen vrouwen "+cijfer2,50,70);
   g.drawString("Mannelijke leerlingen "+cijfer3,50,90);
   g.drawString("Vrouwelijk leerlingen "+cijfer4,50,110);
   g.drawString("Het totaal = "+totaal,50,130);
  }

   class Knop1Listener implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        cijfer1 = cijfer1+optel;
        totaal = totaal+optel;
        repaint();
       }
   }

   class Knop2Listener implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        cijfer2 = cijfer2+optel;
        totaal = totaal+optel;
        repaint();
    }
   }

   class Knop3Listener implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        cijfer3 = cijfer3+optel;
        totaal = totaal+optel;
        repaint();
    }
   }

   class Knop4Listener implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        cijfer4 = cijfer4+optel;
        totaal = totaal+optel;
        repaint();
    }
   }
}
