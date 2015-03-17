/* Beginner level Applet 
 * 
 * Aim : Finding Random Number
 *
 *        Steps 
 *      
 *        1-) At start, program will generate random number between 10-99
 *        
 *        2-) We'll guess the generated number
 *        
 *        3-) Program gives us directives as -1 -2 +1
 *        
 *        For EX: Generated Number : 23     We enter : 32    it prints : -2
 *                                   23                42                -1
 *                                   23                24                +1
 *
 */




import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class find_number extends Applet implements ActionListener {

	int num;

	String text, message;
	TextField a;
	Button b;
	int random = (int) (89 * (Math.random()) + 10);

	
	
	public void init() {
		a = new TextField(2);
		add(a);
		a.setText("");

		b = new Button("CALCULATE");
		add(b);
		b.addActionListener(this);

		setBackground(Color.white);

	}

	public void paint(Graphics g) {

		
		/* First if-else : 0 given automatically to variable num,
		 *  therefore we don't want to see any 
		 * comment on screen till first input*/
		 
		if(num==0){
			g.drawString("", 100, 100);
		}
		
		else{
			
		// About while : We want to generate different numbers in different digit
			while ((random - (random % 10)) / 10 == random % 10) {
			random = (int) (89 * (Math.random()) + 10);
			
		}
		
			// About if : User can not choose same numbers in first and second digit
		if ((num - (num % 10)) / 10 == num % 10) {
			g.drawString(
					"Same number at first and second digits at choosen number",
					10, 100);
			g.drawString(
					"Please choose another number",
					80, 120);
		}
		
		

		else {
			if (random == num) {
				g.drawString("WIN", 100, 100);
			}

			else if (random % 10 == (num - (num % 10)) / 10
					&& num % 10 == (random - (random % 10)) / 10) {

				g.drawString("-2", 100, 100);

			}

			else if (random % 10 == num % 10) {

				g.drawString("+1", 100, 100);

			}

			else if ((random - (random % 10)) / 10 == (num - (num % 10)) / 10) {

				g.drawString("+1", 100, 100);

			}

			else if (random % 10 == (num - (num % 10)) / 10) {

				g.drawString("-1", 100, 100);

			}

			else if (num % 10 == (random - (random % 10)) / 10) {

				g.drawString("-1", 100, 100);

			}
			
			else {

				g.drawString("0", 100, 100);

			}
		}
	}
	}
	public void actionPerformed(ActionEvent e)

	{
		String s = e.getActionCommand();
		if (s.equals("CALCULATE")) {
			text = a.getText();
			num = Integer.valueOf(text);

			repaint();
		}

	}

}