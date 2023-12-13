package j0810;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam12 extends JFrame {
	exam12() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마일을 킬로미터로 환산");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l1=new JLabel("거리를 마일 단위로 입력하시오");
		JTextField txt1=new JTextField(5);
		JButton bt1=new JButton("변환");
		JTextField txt2=new JTextField(20);
		
		txt2.setForeground(Color.black);
		txt2.setEnabled(false);
		
		
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String m=txt1.getText();
				int mile=Integer.parseInt(m);
				double km=(double)mile*1.609344;
				txt2.setText(m+"마일은 "+km+"킬로미터입니다.");
				txt2.setForeground(Color.black);
				
			}
			
		});
		
		add(l1);
		add(txt1);
		add(bt1);
		add(txt2);
		
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// 실습12
		
    new exam12();

	}

}
