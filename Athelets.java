package rmit.cosc.s3613385;

import java.util.Comparator;

abstract class Athelets extends Participants   {

	private int point; 
	private int time; 


	public Athelets(String id, String name, int age, String state  ) {
		super(id, name, age, state);
		this.point = 0; 
		this.time = 0; 
	}

	public Athelets(String id, String name, int age, String state , int point , int time  ) {
		super(id, name, age, state);
		this.point = point; 
		this.time = time; 
	}


	protected static Comparator<Athelets> TimeComparator = new Comparator<Athelets>() {

		public int compare(Athelets a1, Athelets a2) {
			int firstPlayer = a1.getTime();
			int secndPlayer = a2.getTime();

			//ascending order
			return firstPlayer-secndPlayer;


		}};
		
		


		protected static Comparator<Athelets> PointComparator = new Comparator<Athelets>() {

			public int compare(Athelets a1, Athelets a2) {
				int firstPlayer = a1.getPoint();
				int secndPlayer = a2.getPoint();

				//ascending order
				return secndPlayer-firstPlayer;


			}};
			
			

			abstract int compete();

			public int getPoint() {
				return point;
			} 

			public void setPoint(int point) {
				this.point = ( this.getPoint() +point);
			}

			public int getTime() {
				return time;
			}

			public void setTime(int time) {
				this.time = time;
			}


			public void print() { 
				System.out.format("%10s%15s%15s%15s", this.getId(), this.getName(),this.getTime(), this.getPoint());
				System.out.println();

			}
			public void print2() { 
				System.out.format("%10s%15s%15s", this.getId(), this.getName(),this.getTime());
				System.out.println();

			}

			public void print3() {
				System.out.format("%10s%15s",  this.getId(), this.getName());
				System.out.println();
	
			}
}
