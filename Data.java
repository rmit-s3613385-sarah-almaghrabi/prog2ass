package rmit.cosc.s3613385;

import java.util.ArrayList;
import java.util.Collections; 
public class Data {

	private ArrayList <Athelets> athelets  ;

	private ArrayList <Official> referee; 

	public Data(){
		referee = new ArrayList <Official>(); 
		athelets = new ArrayList <Athelets>();  

	}


	public void createOfficial() {



		referee.add(  new Official("REF 1", "Sara", 25, "WA"));
		referee.add(  new Official("REF 2", "Tareq", 30, "VIC"));
		referee.add(  new Official("REF 3", "Ahmad", 31, "SA"));
		referee.add(  new Official("REF 4", "Bayan", 29, "VIC"));
		referee.add(  new Official("REF 5", "Nyomi", 29, "VIC"));
		Collections.shuffle(referee);

	}

	public void createSwimmers() {

		athelets.add(  new Swimmer("ATH_S 1", "Bell", 21, "WA"));
		athelets.add(  new Swimmer("ATH_S 2", "Smith", 25, "VIC"));
		athelets.add(  new Swimmer("ATH_S 3", "John", 20, "TAS"));
		athelets.add(  new Swimmer("ATH_S 4", "Sami", 29, "VIC"));
		athelets.add(  new Swimmer("ATH_S 5", "Ahmad", 25, "SA"));
		athelets.add(  new Swimmer("ATH_S 6", "David", 27, "VIC"));
		athelets.add(  new Swimmer("ATH_S 7", "Bin", 26, "WA"));
		athelets.add(  new Swimmer("ATH_S 8", "Rajaa", 25, "TAS"));
		athelets.add(  new Swimmer("ATH_S 9", "Murad", 29, "VIC"));
		athelets.add(  new Swimmer("ATH_S 10", "Nuha", 29, "VIC"));
		athelets.add(  new Swimmer("ATH_S 11", "Byan", 29, "VIC"));
		athelets.add(  new Swimmer("ATH_S 12", "Raed", 29, "VIC"));
	//	Collections.shuffle(athelets);
	}

	public void createCyclists() {
		athelets.add(  new Cyclist("ATH_C 1", "Emma", 20, "VIC")); 
		athelets.add(  new Cyclist("ATH_C 2", "Jacob", 27, "WA")); 
		athelets.add(  new Cyclist("ATH_C 3", "Nasser", 21, "Qld")); 
		athelets.add(  new Cyclist("ATH_C 4", "Ethan", 21, "WA")); 
		athelets.add(  new Cyclist("ATH_C 5", "James", 28, "VIC")); 
		athelets.add(  new Cyclist("ATH_C 6", "Emily", 30, "WA")); 
		athelets.add(  new Cyclist("ATH_C 7", "Mia", 29, "Qld")); 
		athelets.add(  new Cyclist("ATH_C 8", "Alexander", 24, "SA")); 
		athelets.add(  new Cyclist("ATH_C 9", "Reema", 24, "SA")); 
		athelets.add(  new Cyclist("ATH_C 10", "Rana", 24, "SA")); 
		athelets.add(  new Cyclist("ATH_C 11", "Basel", 24, "SA")); 
		athelets.add(  new Cyclist("ATH_C 12", "Hamad", 24, "SA")); 
		Collections.shuffle(athelets);
	}

	public void createSprinters() {

		athelets.add(  new Sprinter("ATH_SP 1", "Noah", 28, "VIC")); 
		athelets.add(  new Sprinter("ATH_SP 2", "Amelia", 25, "WA")); 
		athelets.add(  new Sprinter("ATH_SP 3", "Braa", 21, "Qld")); 
		athelets.add(  new Sprinter("ATH_SP 4", "Rayan", 23, "WA")); 
		athelets.add(  new Sprinter("ATH_SP 5", "Tamer", 28, "VIC")); 
		athelets.add(  new Sprinter("ATH_SP 6", "Liam", 22, "WA")); 
		athelets.add(  new Sprinter("ATH_SP 7", "William", 27, "Qld")); 
		athelets.add(  new Sprinter("ATH_SP 8", "Sofia", 24, "SA")); 
		athelets.add(  new Sprinter("ATH_SP 9", "Maria", 24, "SA")); 
		athelets.add(  new Sprinter("ATH_SP 10", "May", 24, "SA")); 
		athelets.add(  new Sprinter("ATH_SP 11", "Nafee", 24, "SA")); 
		athelets.add(  new Sprinter("ATH_SP 12", "Pavan", 24, "SA")); 
		athelets.add(  new Sprinter("ATH_SP 13", "Komal", 24, "SA")); 
		Collections.shuffle(athelets);
	}


	public void createSuperAth() {

		athelets.add(  new Cyclist("ATH_SU 1", "William", 28, "VIC")); 
		athelets.add(  new Sprinter("ATH_SU 2", "Rayan", 25, "WA")); 
		athelets.add(  new Swimmer("ATH_SU 3", "Braa", 21, "Qld")); 
		athelets.add(  new Cyclist("ATH_SU 4", "Rayan", 23, "WA")); 
		athelets.add(  new Sprinter("ATH_SU 5", "Mia", 28, "VIC")); 
		athelets.add(  new Swimmer("ATH_SU 6", "Jacob", 22, "WA")); 
		athelets.add(  new Cyclist("ATH_SU 7", "William", 27, "Qld")); 
		athelets.add(  new Sprinter("ATH_SU 8", "Hamad", 24, "SA")); 
		Collections.shuffle(athelets);
	}


	public ArrayList<Official> getOfficial() {
		return referee;
	}



	public Athelets getAthelets(int i) {
		while (i< athelets.size()) 
			return athelets.get(i);
		return null;

	}


	public void createPlayers(String sport) {
		athelets.removeAll(athelets);
		if (sport.equals("swimming"))
			createSwimmers() ;
		else if (sport.equals("running"))
			createSprinters();
		else if (sport.equals("cycling"))
			createCyclists() ;
		else
			createSuperAth();



	}








}
