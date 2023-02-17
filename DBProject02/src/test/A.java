package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class A extends JFrame{
	JTextField txtV1, txtV2;
	JLabel lblResult;
	JButton btn1, btn2;
	public A() {
		setTitle("계산");
		setLayout(new GridLayout(4, 2));
		
		JLabel lblV1 = new JLabel();
		txtV1 = new JTextField(20);
		this.add(txtV1);
		
		txtV2 = new JTextField(20);
		this.add(txtV2);
		
		
		
		btn1 = new JButton("버튼1");
		this.add(btn1);
		// 버튼이 클릭되면 새창을 띄운다
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new B(this,3); 
				
			}
		});
		
		btn2 = new JButton("버튼2");
		this.add(btn2);
		
		lblResult = new JLabel("결과:");
		this.add(lblResult);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new A();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new B(this); // 새창열기 this = a의 정보 
}
