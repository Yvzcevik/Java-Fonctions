import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

// Beginner Level Coloring Applet



public class coloring extends Applet implements ActionListener {
   
   
    int Button_push;
    Button a=new Button ("ORANGE");
    Button b=new Button ("RED");
    Button c=new Button ("WHITE");
    Button d=new Button ("BLUE");
    Button f=new Button ("BLACK");
   
    public void init()
    {     
       

       a.addActionListener(this);
       add(a);
       
       b.addActionListener(this);
       add(b);
   
       c.addActionListener(this);
       add(c);
       
       d.addActionListener(this);
       add(d);
       
       f.addActionListener(this);
       add(f);
   
    
    }
   
    public void paint(Graphics g)
    {
       if(Button_push==-2){
           
           setBackground(Color.ORANGE);
       }
       if(Button_push==-1){
           
           setBackground(Color.RED);
       }
       
       if(Button_push==0){
           
           setBackground(Color.WHITE);
       }

       if(Button_push==1){
       
       setBackground(Color.BLUE);
       }
      
      if(Button_push==2){
           
           setBackground(Color.BLACK);
       }
       
       repaint();
       
    }
   
    public void actionPerformed(ActionEvent e)
   
    {
        
        String s=e.getActionCommand();
        
        if(s.equals("ORANGE")){
        Button_push=-2;
        }
        
        if(s.equals("RED")){
        Button_push=-1;
        }
        
        if(s.equals("WHITE")){
        Button_push=0;
        }
        
        if(s.equals("BLUE")){
        Button_push=1;
        }
        
        if(s.equals("BLACK")){
        Button_push=2;
        }
        
         repaint();    
    }
}