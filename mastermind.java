/* 4-Digit Mastermind Game*/


import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class mastermind extends Applet implements ActionListener {

	int num, win = 0, tip = 0, same_rand = 0, same_num,flag=0;

	String text, message;
	TextField a;
	Button b;
	int random = (int) (8853 * (Math.random()) + 1023);
	int[] Arrayrandom = new int[4];
	int[] Arraynum = new int[4];

	public void init() {
		a = new TextField(10);
		add(a);
		a.setText("");

		b = new Button("CALCULATE");
		add(b);
		b.addActionListener(this);

		setBackground(Color.white);

		// About this while : We don't want "random" to include same number

		while (same_rand != 4) {

			same_rand = 0;

			random = (int) (8853 * (Math.random()) + 1023);

			Arrayrandom[0] = random % 10;
			Arrayrandom[1] = (random % 100 - (random % 10)) / 10;
			Arrayrandom[2] = ((random % 1000) - (random % 100)) / 100;
			Arrayrandom[3] = random / 1000;

			for (int i = 0; i <= 3; i++) {

				for (int j = 0; j <= 3; j++) {

					if (Arrayrandom[i] == Arrayrandom[j]) {

						same_rand++;

					}
				}
			}
		}

	}

	public void paint(Graphics g) {

	
		/* First if-else : 0 has given automatically to variable num,
		 *  therefore we don't want to see any 
		 * comment on screen till first input*/
		
		if(num==0){
		}
		
		else{
		same_num=0;
		
		Arraynum[0] = num % 10;
		Arraynum[1] = (num % 100 - (num % 10)) / 10;
		Arraynum[2] = ((num % 1000) - (num% 100)) / 100;
		Arraynum[3] = num / 1000;

		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 3; j++) {

				if (Arraynum[i] == Arraynum[j]) {

					same_num++;

				}
			}
	}
		
	//About this if : We are now checking if user's input include same number	
		
		if(same_num==4 && Arraynum[3] != 0)
		{
		
			for (int i = 0; i <= 3; i++) {

			if (Arrayrandom[i] == Arraynum[i]) {

				win++;
			}

			for (int j = 0; j <= 3; j++) {

				if (Arrayrandom[i] == Arraynum[j]) {

					tip++;
				}
			}
		}

		g.drawString("" + random, 220, 100);
		
		g.drawString("" + num, 220, 140);
		
		g.drawString("+" + win, 200, 180);

		g.drawString("-" + (tip - win), 250, 180);

		win = 0;
		tip = 0;
	
		}
		
		else{
			
			g.drawString("Same numbers in input",200, 200);
			g.drawString("Please choose another number",200, 220);
		
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

