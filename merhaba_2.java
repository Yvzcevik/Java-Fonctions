/* Beginner Level Applet
 * 
 * Aim : We divided a word MERHABA (hello in Turkish) as MER-HABA.
 *       If user press Enter, "MER" and "HABA" will start to move towards 
 *       each other (MER moves horizontally. HABA moves vertically)
 *       and reunite at some specific point of the applet window.
 */



import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class merhaba_2 extends Applet implements KeyListener {
	
	
	int x_mer=0,y_haba=0;
	int push=0;
	
	public void init()
	{
		addKeyListener(this);
		setBackground(Color.white);
		
	}

	public void paint(Graphics p)
	{
		if(push==0){
			p.drawString("Enter to Start",265,50);
		}
		p.drawString("MER",74+x_mer,100);
		p.drawString("HABA",300,300+y_haba);
		
		if(push==1 && 100+x_mer!=500+y_haba){
	
			x_mer+=10;
			y_haba-=10;
		
		 try{
	          
	            Thread.sleep(100);
	        }
	      
	        catch(Exception e){};
	        
	        repaint();
		}
	}
	

    public void keyPressed(KeyEvent e)
    {
      
        int key = e.getKeyCode();
      
        switch (key)
        {
      
        case(KeyEvent.VK_ENTER):push=1; break;
        
        }
        repaint();
  
    }
  
    public void keyReleased(KeyEvent e)
    {
    }
  
    public void keyTyped(KeyEvent e)
    {
      
    }
}