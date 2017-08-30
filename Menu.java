package rmit.cosc.s3613385;

import java.util.Scanner;

public class Menu { 

	private String [] options ;
	private String name ;
	
	
	static Scanner sc = new Scanner(System.in);
	

	
	public Menu( String name ,String [] options) {
		this.name = name; 
		this.options = options;
	}
	public void display(){
		System.out.println("       =========== "+ name + " MENU =========== ");
		for(int i=0; i<this.options.length ; i++) 
			System.out.println((i+1) + " - " + options[i]  ); 
	}

	public int getValidChoice( ) {
		 
		int n;

		try {
			do {
				System.out.print("\t\tYour choice : ");
				n = Integer.parseInt(sc.nextLine());
				if(n < 1 || n > options.length)
					System.out.println(" Error: should be between ( 1 - " +  options.length +" )");
			} while ( n < 1 || n > options.length);
			return n;

		} catch (NumberFormatException e) {
			System.out.println("Numbers only ");

		}

		return -1; 
	}


}	





