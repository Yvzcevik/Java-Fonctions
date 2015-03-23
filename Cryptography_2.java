import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Cryptography_2 extends Applet implements ActionListener {

	String alphabet= "abcçdefgğhıijklmnoöprsştuüvyz";
	String alphabet_encoded = "abcçdefgğhıijklmnoöprsştuüvyz";
	String alphabet_input,alphabet_input_encoded;
	int random, flag = 0, x;
	TextField a, b;
	Button c, d;

	public String MAGIC(String alphabet_input) {

		String output = "";

		int x = alphabet_input.length();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 28; j++) {

				if (alphabet_input.charAt(i) == alphabet.charAt(j)) {

					output += alphabet_encoded.substring(j, j + 1);
				}
			}
		}

		return output;
	}
	
	public String MAGIC_REVERSE(String alphabet_input) {

		String output = "";

		int x = alphabet_input.length();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 28; j++) {

				if (alphabet_input.charAt(i) == alphabet_encoded.charAt(j)) {

					output += alphabet.substring(j, j + 1);
				}
			}
		}

		return output;
	}

	public void init() {

		a = new TextField(29);
		add(a);
		a.setText("");

		c = new Button("ENCODE");
		add(c);
		c.addActionListener(this);

		d = new Button("DECODE");
		add(d);
		d.addActionListener(this);

		b = new TextField(29);
		add(b);
		b.setText("");

		setBackground(Color.white);

		for (int i = 0; i < 200; i++) {

			random = (int) (27 * Math.random() + 1);

			alphabet_encoded = alphabet_encoded.substring(1, random)
					+ alphabet_encoded.substring(0, 1)
					+ alphabet_encoded.substring(random, 29);

		}

		for (int i = 0; i < 200; i++) {

			random = (int) (27 * Math.random() + 1);

			alphabet_encoded = alphabet_encoded.substring(0, 28 - random)
					+ alphabet_encoded.substring(28, 29)
					+ alphabet_encoded.substring(28 - random, 28);

		}
	}

	public void paint(Graphics g) {

		if (flag == 1) {
			
			alphabet_input_encoded = MAGIC(alphabet_input);
			
			
			g.drawString(alphabet, 380, 100);
			g.drawString(alphabet_encoded, 760, 100);
			g.drawString(alphabet_input, 380, 200);
			g.drawString(alphabet_input_encoded, 760, 200);
			

			
	

		}

	}

	public void actionPerformed(ActionEvent e)

	{

		String s = e.getActionCommand();
		if (s.equals("ENCODE")) {

			alphabet_input = a.getText();
			flag = 1;
			repaint();
		}

	}
}
