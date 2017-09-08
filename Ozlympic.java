package rmit.cosc.s3613385;
 
 

public class Ozlympic {

	public static Driver d = new Driver ();
	public static void main(String [] args){
		
		String gameID  = null; 
		int prediction = -1;
		String [] mOptions = {
				"Select a game to run         "
				,"Predict the winner of the game	  "
				,"Start the game  "
				,"Display the final results of all games "
				,"Display the points of all athletes "
				,"Exit   "
		};

		Menu menu = new Menu("MAIN" , mOptions);
		
        int chose ;
		do{
			menu.display();
			chose = menu.getValidChoice();

			switch (chose){
			case 1 : 
				gameID = d.selectGame(gameID);
				break; 
			case 2 :
				prediction = d.predictWinner(gameID);
				break;  
			case 3 : 
				gameID=d.startGame(gameID,prediction);
				break; 
			case 4 : 
				d.displayAllGames();
				break; 
			case 5 : 
				d.displayAllAthlets(); 
				break; 
			case 6 :
				System.out.println("Game Ended, Thanks ");
				break; 
			default: 
				break; 
			}
			 
		}while(chose!=6);


	} 

}
