package j0810;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class exam15 extends JFrame{
	exam15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("라디오");
		
		Container c=getContentPane();
		   c.setLayout(new FlowLayout());
		
		JRadioButton rdo1 = new JRadioButton("포르쉐");
	 	JRadioButton rdo2 = new JRadioButton("벤츠");
	 	JRadioButton rdo3 = new JRadioButton("BMW");
	 	JRadioButton rdo4 = new JRadioButton("아우디");
	 	 
	 	ButtonGroup grp1 = new ButtonGroup();   //라디오버튼은 그룹을 생성해야함!
	 	grp1.add(rdo1);
	 	grp1.add(rdo2);
	 	grp1.add(rdo3);	 	
	 	grp1.add(rdo4);	
	 	
	 	JButton click = new JButton("클릭하세요");
	
	 	add(rdo1);
	 	add(rdo2);
	 	add(rdo3);
	 	add(rdo4);
	    add(click);
 
	    JLabel lbl1 = new JLabel(" ");
		add(lbl1);
		 
	    // ImageIcon img1 = new ImageIcon("images/exit.png");
	  	// JLabel lbl2 = new JLabel(img1);
	    // add(lbl2);
	    
	  

		
	 	rdo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				lbl1.setText("선택한 차량은 포르쉐입니다");

	
			}
	 		
	 	});
	 	
	 	rdo2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl1.setText("선택한 차량은 벤츠입니다");
	
			}
	 		
	 	});
	 	
	 	rdo3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	
				lbl1.setText("선택한 차량은 BMW입니다");
							}
	 		
	 	});
	 	
	 	rdo4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				lbl1.setText("선택한 차량은 아우디입니다");
			
				
		
			}
	 		
	 		
	 	});
	 
	    
	 
	 	
		//JButton OK = new JButton("OK");
	    //add(OK);
	    
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 실습15
		
		new exam15();

	}

}
