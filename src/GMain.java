import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GMain extends JFrame
{
	private puPanel panel;
	private puButton ba;
	private move mo;
	public GMain()
	{
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.cyan);
		this.setTitle("David Puzzle");
		this.setBounds(50, 0, 500, 500);
		this.setLayout(new FlowLayout());

		
		panel=new puPanel();
		ba=new puButton();
		mo=new move();
		this.add( panel);
		this.add(ba);
		//this.add(mo);
		
		
		this.setVisible(true);
	}

	public static void main(String[] args)
	{
		
		new GMain();
		
		
		
	}//end of main
	
	
	
	

}//end of class 
