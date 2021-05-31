import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class puButton extends JPanel
{
	private JButton bttn[]=new JButton[3];
	private move aMove;
	private puPanel panel;
	
	
	
	
	public puButton()
	{
		super();
		aMove=new move();
		 panel=new puPanel();
		//this.addMouseListener(this);
		this.setOpaque(true);
		this.setPreferredSize(new Dimension(100, 300));
		this.setBackground(new Color(150, 200, 135));
		this.setLayout(new FlowLayout());
		
		for (int i=0;i<3;i++)
		{
			bttn[i]=new JButton();
			bttn[i].setPreferredSize(new Dimension(90, 30));
			bttn[i].setBackground(new Color(180, 105, 135));
			this.add(bttn[i]);
			
		}
		 
		
		bttn[0].setText("Back");
		bttn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//aMove.undo();
				//Point b=new Point(aMove.undo());
				Point b=new Point(1,1);
				panel.setTextColorAandB(b,panel.getBlank());
				panel.newBlank(b);
				int a=aMove.getcMove();
				System.out.println(a+"  ?"+panel.getBlank().x);
				
				
			}
		});
		
		
		
		
	    //this.setVisible(true);
	}
	
	
	
	

}
