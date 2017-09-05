package rmit.cosc.s3613385;

import java.util.ArrayList;
import java.util.Collections; 
interface Game {

	Data d =  new Data();
	public static String createGameID(char gameChar , int i   ) {
		return ( gameChar + "-" + i) ;
	}



	public static  Official createOffical(){
		d.createOfficial();
	//	ArrayList <Official> offical = d.getOfficial();
	//	Collections.shuffle(offical);
		return 	d.getOfficial(). get(0);

	}




	public static Athelets getPlayers(int i ){
		return d.getAthelets(i);

	}
	public static void startGame(Athelets athelets){
		athelets.setTime(athelets.compete()); 
	}

	public static void creatPlayers(String sport){
		d.createPlayers(sport);
	}

}



