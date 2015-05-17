// http://tr.wikipedia.org/wiki/Türk_bayrağı


import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class flag implements WindowListener {
   
    static Frame a;
    static Panel b;
    static double G;

public flag (String flag)
{
    a=new Frame(flag);
    b=new Panel();
}


public void create(double A)

{
    a.setSize((int)(G*(1.5)),(int)G);
    a.setBackground(new Color(227,10,23));
    a.add(b);
    a.setVisible(true);
    a.addWindowListener(this);
}

public static void main(String args[]){
   
    Scanner boyut = new Scanner (System.in);
    System.out.println("Flag Size = ");
    G = boyut.nextDouble();
    flag turkbayragi = new flag("Turk_Bayragi");
    turkbayragi.create(G);
   
}


@Override
public void windowActivated(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
}


@Override
public void windowClosed(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
}


@Override
public void windowClosing(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
    System.exit(0);
   
}


@Override
public void windowDeactivated(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
}


@Override
public void windowDeiconified(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
}


@Override
public void windowIconified(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
}


@Override
public void windowOpened(WindowEvent arg0) {
    // TODO Auto-generated method stub
   
}
}