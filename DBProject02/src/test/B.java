package test;

import javax.swing.JFrame;


public class B extends JFrame{
	A a;
	public B () {
		setTitle("새창");
		setLayout
		
		lbl1 = new JLabel("뭔가 출력");
		this.add(lbl1);
		setSize(200, 200);
		setVisible(true);	
		
	}
	
	public B(A a) {
		this(); //기본 생성자 호출
		this.a = a;
		
		String v = a.txtV1.getText();
		
		lbl1.setText(lbl1.getText() + "a에서 넘어온 값");
	}
	
}
