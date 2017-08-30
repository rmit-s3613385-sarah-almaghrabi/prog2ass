package rmit.cosc.s3613385;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

import javax.swing.Timer;

public class Official  extends Participants{

	public Official(String id, String name, int age, String state) {
		super(id, name, age, state);
	}

	public void runGame(String gameID , int mSeconds) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY - HH:mm:ss");
		String time= sdf.format(Calendar.getInstance().getTime()).toString();
		Timer timer = new Timer(1000, null); 
		System .out .print(" Game " +gameID+ " started "  );
		System .out .println(time);
		timer.start();

		try {

			Thread.sleep(mSeconds);
		} catch (InterruptedException e) {
		}
		timer.stop();
		

		System.out.print("Game  Finished .. "  );
		System .out .println(sdf.format(Calendar.getInstance().getTime()));
	
	}



	public void rewardWinners(ArrayList< Athelets> athelets) {
		athelets.get(0).setPoint(5 );
		athelets.get(1).setPoint(3 );
		athelets.get(2).setPoint(1 );
	}

	public void showResults(ArrayList< Athelets> athelets){
		rewardWinners(athelets);
		Collections.sort(athelets, Athelets.PointComparator);
		System.out.format("%8s%15s%15s%15s", "ID", "NAME", "TIME" , "POINT");
		System.out.println("\n----------------------------------------------------");

		for(Athelets a: athelets){
			a.print();
		}
		
		
	}

}


