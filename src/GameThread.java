import java.util.ArrayList;


public class GameThread extends Thread{
	private long points=1;
	private long total;
	public GameThread(){
		points =1;
		total = 0;
	}
	public void run(){
		while (true)
		{
			try {
			Thread.sleep (500);
			points++;
		} 
			catch (InterruptedException e) {}
		 }
	}
	public long click(){
		long win=points;
		points = 1;
		return win;
	}
	public long getPoints(){
		return points;
	}
}
