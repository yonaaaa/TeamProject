package test2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form1 extends JFrame implements ActionListener {
	JTextField txt1;
	JButton btn1;
	JLabel lbl1;
	

	
	public Form1() {
		init();
	}
	
	private void init() {
		setTitle("메인화면");
		setLayout(new FlowLayout());
		
		txt1 = new JTextField(10);
		btn1 = new JButton("OK");
		lbl1 = new JLabel("From1  label1");
		this.add(txt1);
		this.add(btn1);
		this.add(lbl1);
		
		btn1.addActionListener(this);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Form1();
		
	}
	
	// btn1 click 될때
	@Override
	public void actionPerformed(ActionEvent e) {
		// String str = txt1.getText();
		new Form2(this);
	}

}
