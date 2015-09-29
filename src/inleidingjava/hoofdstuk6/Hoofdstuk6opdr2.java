package inleidingjava.hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6opdr2 extends Applet {
	
int a, b, c, uitkomst, uitkomst2, uitkomst3;
            public void init() {
            a=60;
            b=24;
            c=365;
uitkomst=a*a;
uitkomst2=a*a*b;
uitkomst3=a*a*b*c;
	}
            
public void paint(Graphics g) {
g.drawString("hoeveel seconden heeft een uur:"+ uitkomst, 50, 60 );
g.drawString("hoeveel seconden heeft een dag:"+ uitkomst2,50,80);
g.drawString("hoeveel seconden heeft een jaar:"+ uitkomst3,50,100);
}
}
