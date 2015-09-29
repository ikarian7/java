package inleidingjava.hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6opdr3 extends Applet {
 int a;
 int b;
 int uitkomst;
 
 public void init() {
  a=1000000000;
  b=2000000000;
  uitkomst=a+b;
 }
 
public void paint(Graphics g) {
  g.drawString("Twee positieven int vormen samen negatieven int =     "+uitkomst,50,50);
 }
}
