package j0810;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class exam13 extends JFrame{
	exam13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자를 계산하는 프로그램");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l1=new JLabel("원금을 입력하시오");
		JTextField txt1=new JTextField(10);
		JLabel l2=new JLabel("이율을 입력하시오");
		JTextField txt2=new JTextField(10);
		JButton bt1=new JButton("변환");
		JTextField txt3=new JTextField(20);
		
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String money=txt1.getText();
				String plus=txt2.getText();
				int mon=Integer.parseInt(money);
				double pl=Double.parseDouble(plus);
				double result=(mon/100)*pl;
				txt3.setText("이자는 연 "+(int)result+"만원 입니다.");
				
			}
			
		});
		
		txt3.setEnabled(false);
		
		add(l1);
		add(txt1);
		add(l2);
		add(txt2);
		add(bt1);
		add(txt3);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 실습13
		new exam13();

	}

}
