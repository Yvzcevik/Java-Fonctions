/*   ATTENTION : I TRIED TO ESTABLISH A CODE THAT 
 * 				 DOING CRYPTOGRAPHY WHILE USING ASCII CODES OF INPUTS
 *
 *				 CODE IS COMPLETE NOR WORKING
 */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class cryptography extends Applet implements ActionListener {

	// char x='ş' ;
	int num = 0, length_encoded = 0, length_decoded = 0;
	int temp, temp2, temp3;
	String textofencode = "temp_length1", textofdecode = "temp_length2";
	TextField a, b;
	Button c, d;
	int[] Array_decoded = new int[29];
	int[] Array_encoded = new int[29];

	// int ascii = (int) x ;

	public int MAGIC(int temp) {

		temp3 = (int) (3 * (Math.random()));
		if (temp3 != 0) {

			temp = (int) (25 * (Math.random()) + 97);

		}

		if (temp3 == 0) {
			temp2 = (int) (5 * (Math.random()));

			if (temp2 == 0) {

				temp = 231;
			}
			if (temp2 == 1) {

				temp = 287;
			}
			if (temp2 == 2) {

				temp = 305;
			}
			if (temp2 == 3) {

				temp = 246;
			}
			if (temp2 == 4) {

				temp = 351;
			}
			if (temp2 == 5) {

				temp = 252;
			}

		}

		return temp;
	}

	public void init() {

		temp = 96;

		a = new TextField(29);
		add(a);
		a.setText("");

		c = new Button("ENCODE");
		add(c);
		c.addActionListener(this);

		/*
		 * d = new Button("DECODE"); add(d); d.addActionListener(this);
		 */

		b = new TextField(29);
		add(b);
		b.setText("");

		setBackground(Color.white);

		for (int i = 0; i < 29; i++) {

			temp++;

			// About these 2 if : We are doing synchronization between Turkish
			// and Latin Alphabets
			if (temp == 100 || temp == 104 || temp == 105 || temp == 112
					|| temp == 116 || temp == 118) {
				i++;

			}

			if (temp == 113 || temp == 119) {

				if (temp == 119) {
					temp += 2;
				} else {
					temp++;
				}

			}

			Array_decoded[i] = temp;

		}

		// We are filling the blanks

		Array_decoded[3] = 231;
		Array_decoded[8] = 287;
		Array_decoded[10] = 305;
		Array_decoded[18] = 246;
		Array_decoded[22] = 351;
		Array_decoded[25] = 252;

		for (int i = 0; i < 29; i++) {

			// We are encoding our alphabet
			Array_encoded[i] = MAGIC(i);
		}

	}

	public void paint(Graphics g) {

		length_encoded = textofencode.length();

		if (num == 0) {
			for (int i = 0; i < 29; i++) {
				char int_to_char = (char) Array_encoded[i];
				g.drawString("" + int_to_char, 180 + temp, 100);
				temp += 8;
			}

			for (int i = 0; i < 29; i++) {
				char int_to_char = (char) Array_decoded[i];
				g.drawString("" + int_to_char, -450 + temp, 100);
				temp += 8;
			}

		}

		if (num == 1) {

			char[] Array_input = new char[length_encoded];

			temp = 0;

			for (int i = 0; i < length_encoded; i++) {

				int flag = 0;
				temp2 = 0;

				Array_input[i] = textofencode.charAt(i);
				
				g.drawString("" + Array_input[i], temp + 100, 120);
				g.drawString("" + (char) Array_encoded[i], temp + 100, 140);

				// We are encoding our input

				for (int j = 0; j < 29; j++) {

					if (flag == 0) {
						if ((int) Array_input[i] == Array_decoded[j]) {
							
							g.drawString("" + Array_decoded[j], temp + 200, 100);
							g.drawString("" + Array_input[i], temp + 200, 120);
							
							temp2 = j;

							flag = 1;
						}
					}
				}
				g.drawString("" + Array_input[i], temp + 220, 120);
				if (flag == 1) {
					Array_input[i] = (char) Array_encoded[i];
					
					g.drawString("" + Array_input[i], temp + 300, 100);
					g.drawString("" + Array_encoded[temp2], temp + 300, 120);
				
				}
				g.drawString("" + Array_input[i], temp + 100, 100);

				temp += 10;

			}

		}

		/*
		 * g.drawString(""+textofencode, 200, 200);
		 * g.drawString(""+textofdecode, 240, 200);
		 * g.drawString(""+length_encoded, 200, 240);
		 * g.drawString(""+length_decoded, 240, 240); }
		 */

	}

	public void actionPerformed(ActionEvent e)

	{

		String s = e.getActionCommand();
		if (s.equals("ENCODE")) {

			textofencode = a.getText();

			num = 1;

			repaint();
		}

		/*
		 * if (s.equals("DECODE")) {
		 * 
		 * textofdecode = b.getText(); length_decoded= textofdecode.length();
		 * 
		 * num=1; repaint();
		 * 
		 * }
		 */

	}
}
