import java.awt.Point;

public class move 
{
	private Point move[]=new Point[1000];
	private int cMove;
	private int cMoveAll;
	public move()
	{
		//this.move=move;
		//this.cMove=cMove;
	
	}

	public Point[] getMove()
	{
		return move;
	}

	public void setMove(Point[] move)
	{
		this.move = move;
	}

	public int getcMove() {
		return cMove;
	}

	public void setcMove(int cMove) {
		this.cMove = cMove;
	}

	public int getcMoveAll()
	{
		return cMoveAll;
	}

	public void setcMoveAll(int cMoveAll)
	{
		this.cMoveAll = cMoveAll;
	}
	
	public void setNextMove(int x,int y) 
	{
		Point b=new Point();
		b.x=x;
		b.y=y;
		
		move[cMove++]=b;
		//cMove++;
		System.out.println(cMove+"hi"+y);	
		for(int i=0;i<cMove;i++)
		{
			System.out.println(move[i].x+" ,"+move[i].y);
		}
	}
	
	/*
	public Point getLastPoint(int i) 
	{
		Point b=new Point();
		if(i<=cMove)
		{
			b.x=move[i].x;
			b.y=move[i].y;
		}
		return b;
		
	}
	*/
	public Point undo()
	{
		Point b=new Point();
		if(cMove>0)
		{
			b.x=move[cMove--].x;
			b.y=move[cMove--].y;
		}
		System.out.println(b.x+" undo "+b.y);
		return b; 
	
	}
	
	
	

}
