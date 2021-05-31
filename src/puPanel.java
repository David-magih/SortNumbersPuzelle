import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class puPanel extends JPanel implements MouseListener
{
	private move aMove=new move();	
	
	
	
	JLabel  part [][]=new JLabel [5][5];
	int num[]=new int[25];
	int cNum; 
	JLabel temp=new JLabel();
	private Point blank=new Point (4,4);
	


	private Point up=new Point (blank.x,blank.y-1);
	private Point down=new Point (blank.x,blank.y+1);
	private Point left=new Point (blank.x-1,blank.y);
	private Point right=new Point (blank.x+1,blank.y);
	
	public puPanel()
	{
		
		super();
		this.addMouseListener(this);
		this.setOpaque(true);
		this.setPreferredSize(new Dimension(300, 300));
		this.setBackground(new Color(150, 200, 135));
		this.setLayout(new FlowLayout());
		
		for (int yyy=0;yyy<5;yyy++)
		{
			for (int xxx=0;xxx<5;xxx++)
			{
				Point ij=new Point (xxx,yyy);
				part[yyy][xxx]=new JLabel();
				part[yyy][xxx].setPreferredSize(new Dimension(54, 54));
				part[yyy][xxx].setOpaque(true);
				part[yyy][xxx].setText((cNum++)+"");
				part[yyy][xxx].setHorizontalAlignment(SwingConstants.CENTER);
				part[yyy][xxx].setBackground(Color.CYAN);
				//part[v][h].setBorderPainted(false);
				if (compare (ij,blank)) //if (yyy==blank.y && xxx==blank.x)
				{
					part[yyy][xxx].setBackground(this.getBackground());
					part[yyy][xxx].setText("");
					
				}
				
					
				this.add(part[yyy][xxx]);
				//this.add(a);
	
			}//end of for j
			
		}//end of for i
		
		
	}

	public Point getBlank() {
		return blank;
	}








	public void setBlank(Point blank) 
	{
		this.blank = blank;
	}
	
	
	
	
	
	
	public Boolean compare(Point a,Point b)
	{
		if (a.x==b.x && a.y==b.y )
			return  true;
		else 
			return  false; 
	 
	}
	public  void newBlank(Point a)
	{
		
		blank.x=a.x;
		blank.y=a.y;
		 up=new Point (blank.x,blank.y-1);
		 down=new Point (blank.x,blank.y+1);
		 left=new Point (blank.x-1,blank.y);
		 right=new Point (blank.x+1,blank.y);
		//return b;
		
	}
	public void setTextColorAandB(Point a,Point b) 
	{
		if ((0<=a.y&&a.y<=4)&&(0<=a.x&&a.x<=4))
		{
			temp.setText(part[a.y][a.x].getText());
			temp.setBackground(part[a.y][a.x].getBackground());
			
			part[a.y][a.x].setBackground(part[b.y][b.x].getBackground());
			part[a.y][a.x].setText(part[b.y][b.x].getText());
			
			part[b.y][b.x].setBackground(temp.getBackground());
			part[b.y][b.x].setText(temp.getText());
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e)
	{
		
		int hx=e.getX()/60;
		int vy=e.getY()/60;
		Point ee=new Point(hx,vy);
		
		
		//System.out.println("hx "+hx+"blank.x "+ blank.x+"vy "+ vy +"up.y "+up.y +"down.y "+down.y +"left.x "+ left.x+"blank.y "+ blank.y +"right.x "+right.x  );
		if (compare(ee,up)||compare(ee,down)||compare(ee,left)==true||compare(ee,right)==true)	
			
			
		{
			
				setTextColorAandB(ee,blank);
				newBlank(ee);
				aMove.setNextMove(hx,vy );
		}
			
		}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
}
