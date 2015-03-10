
/* Beginner Level Applet
 * 
 * Aim : We divided a word MERHABA (hello in Turkish) as MER-HABA.
 *       If user press Enter, "MER" and "HABA" will start to move towards 
 *       each other and reunite in the middle of the applet window.
 */



import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class merhaba_1 extends Applet implements KeyListener {
	
	
	int x_mer=0,x_haba=0;
	int push=0;
	
	public void init()
	{
		addKeyListener(this);
		setBackground(Color.white);
		
	}

	public void paint(Graphics p)
	{
		if(push==0){
			p.drawString("Enter to Start",265,150);
		}
		p.drawString("MER",74+x_mer,300);
		p.drawString("HABA",500+x_haba,300);
		
		if(push==1 && 100+x_mer!=500+x_haba){
	
			x_mer+=10;
			x_haba-=10;
		
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

