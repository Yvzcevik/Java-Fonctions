import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Cryptography_2 extends Applet implements ActionListener {

	int random;
	TextField a, b;
	Button c, d;
	String alphabe_encoded = "abcçdefgğhıijklmnoöprsştuüvyz";
	String alphabet_coded = "abcçdefgğhıijklmnoöprsştuüvyz";

	public void init() {

		a = new TextField(29);
		add(a);
		a.setText("");

		c = new Button("ENCODE");
		add(c);
		c.addActionListener(this);

		b = new TextField(29);
		add(b);
		b.setText("");

		setBackground(Color.white);

		

		for (int i = 0; i < 200; i++) {

			random = (int) (27 * Math.random()+1);
			
			alphabet_coded = alphabet_coded.substring(1, random)+alphabet_coded.substring(0, 1)+alphabet_coded.substring(random, 29);
			
		
		}
		
		for (int i = 0; i <200; i++) {

			random = (int) (27 * Math.random()+1);
			
			alphabet_coded = alphabet_coded.substring(0 ,28-random)+alphabet_coded.substring(28, 29)+alphabet_coded.substring(28-random, 28);
			
		
		}
	}

	public void paint(Graphics g) {
		System.out.println(alphabet_coded);
	
		System.out.println(alphabet_coded.substring(0, 1));
		
		
	}

	public void actionPerformed(ActionEvent e)

	{

		String s = e.getActionCommand();
		if (s.equals("ENCODE")) {

			
			
			repaint();
		}

	}
}
