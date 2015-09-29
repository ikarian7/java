package inleidingjava;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6 extends Applet {

int a, b, uitkomst;

public void init() {
	a=113;
	b=4;
            uitkomst=a/b;
	}
public void paint(Graphics g) {
            g.drawString("ik: "+uitkomst,50,50);
            g.drawString("jan: "+uitkomst,100,50);
            g.drawString("jeanette: "+uitkomst,150,50);
            g.drawString("ali: "+uitkomst,250,50);
	}
}
