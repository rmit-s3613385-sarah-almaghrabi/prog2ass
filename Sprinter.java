package rmit.cosc.s3613385;
 
import java.util.concurrent.ThreadLocalRandom;

public class Sprinter extends  Athelets   {
	public static final int MIN_TIME = 10;
	public static final int MAX_TIME = 20;
			
	public Sprinter(String id, String name, int age, String state) {
		super(id, name, age, state);
	}

	 

	@Override
	int compete() {
		return ThreadLocalRandom.current().nextInt(MIN_TIME, MAX_TIME + 1);
 
	}
 

}
