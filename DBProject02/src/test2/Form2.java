package test2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form2 extends JFrame {
	JTextField jtf1;
	JButton jbtn1;
	JLabel jlbl1;
	
	Form1  form1;
	public Form2() {
	init();
	}
	
	public Form2(Form1  form1) {
		init();
		this.form1 = form1;	
		
		jtf1.setText(form1.txt1.getText());
	}


	private void init() {
		setTitle("자식");
		setLayout(new FlowLayout());
		
		this.jtf1 = new JTextField(20);
		this.jbtn1 = new JButton("click");
		this.jlbl1 = new JLabel("Form2 label1");
		this.add(jtf1);
		this.add(jbtn1);
		this.add(jlbl1);
		this.jbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String utxt = jtf1.getText().toUpperCase();
				form1.lbl1.setText(utxt);
				dispose();
			}
		});
		
		
		setSize(300, 200);
		setVisible(true);
		
		
	}
}
