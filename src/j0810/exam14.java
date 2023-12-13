package j0810;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam14 extends JFrame {
	exam14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("계산기 화면");
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JLabel l1=new JLabel("계산기");
		JTextField txt1=new JTextField(4);
		JTextField txt2=new JTextField(5);
		JButton bt1=new JButton("+");
		JButton bt2=new JButton("-");
		JButton bt3=new JButton("*");
		JButton bt4=new JButton("/");
		JLabel l2=new JLabel(" ");
		bt1.setPreferredSize(new Dimension(5,2));
		
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(txt1.getText());
				int num2=Integer.parseInt(txt2.getText());
				int result=num1+num2;
				l2.setText("계산결과 : "+result);
				
			}
			
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(txt1.getText());
				int num2=Integer.parseInt(txt2.getText());
				int result=num1-num2;
				l2.setText("계산결과 : "+result);
				
			}
			
		});
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(txt1.getText());
				int num2=Integer.parseInt(txt2.getText());
				int result=num1*num2;
				l2.setText("계산결과 : "+result);
				
			}
			
		});
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(txt1.getText());
				int num2=Integer.parseInt(txt2.getText());
				double result=(double)num1/(double)num2;
				l2.setText("계산결과 : "+(double)result);
				
			}
			
		});
		
		JPanel p1=new JPanel(new GridLayout(1,2,5,5));
		JPanel p2=new JPanel(new GridLayout(2,2,5,5));
		JPanel p3=new JPanel(new BorderLayout());
		p1.add(txt1);
		p1.add(txt2);
		p2.add(bt1);
		p2.add(bt2);
		p2.add(bt3);
		p2.add(bt4);
		p3.add(p1,BorderLayout.NORTH);
		p3.add(p2,BorderLayout.CENTER);
		
		add(l1,BorderLayout.NORTH);
		l1.setHorizontalAlignment(JLabel.CENTER);
		add(p3,BorderLayout.CENTER);
		add(l2,BorderLayout.SOUTH);
		l2.setHorizontalAlignment(JLabel.CENTER);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 실습14
		
		new exam14();

	}

}
