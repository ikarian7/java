package inleidingjava.hoofdstuk78;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
TextField tekstvak;
    Label label;
    String s;
    Button reset;
    Button ok;
    
    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak " +
            "en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        s = "";
        reset = new Button ();
        reset.setLabel("reset");
        add(reset);
        ok = new Button ();
        ok.setLabel("ok");
        add(ok);
       okListener rl = new okListener();
        ok.addActionListener(rl);
        resetListener kl = new resetListener();
        reset.addActionListener(kl);
    }
    
    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }
    
    class resetListener implements ActionListener{
     public void actionPerformed (ActionEvent e) {
      s = ("");
      repaint();
     }
    }
    
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    
    class okListener implements ActionListener{
     public void actionPerformed (ActionEvent e){
      s = tekstvak.getText();
      repaint();
     }
    }
}
