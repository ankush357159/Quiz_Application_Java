package quizApplication;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	JButton b1, b2;
	
	Rules (String username) {
		setBounds(600, 200, 800, 650);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
	
		
		JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
		l1.setForeground(new Color(30, 144, 255));
		l1.setFont(new Font("Chilanka", Font.BOLD, 30));
		l1.setBounds(50, 20, 700, 30);
		add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		l2.setBounds(20, 20, 700, 350);
		l2.setText(
				"<html>"+
						"1. You are allowed to be a programmer and not a story teller. Answer to the point"+ "<br><br>"+
						"2. Crying is allowed but do so quietyl"+ "<br><br>"+
						"3. Brace yourself, this paper is not for fainthearted"+ "<br><br>"+
						"4. May you know more than what John Snow knows. Good luck!"+ "<br><br>"+
				"</html>"
				);
		add(l2);
		
		b1 = new JButton("Back");
		b1.setBounds(250, 300, 100, 30);
		b1.setBackground(new Color(30, 144, 255));	
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Start");
		b2.setBounds(400, 300, 100, 30);
		b2.setBackground(new Color(30, 144, 255));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			this.setVisible(false);
			new SimpleMinds().setVisible(true);
			
		} else if (ae.getSource()==b2) {
			
		}
	
		
		
	}
	
	public static void main (String [] args) {
		new Rules("");
	}
}