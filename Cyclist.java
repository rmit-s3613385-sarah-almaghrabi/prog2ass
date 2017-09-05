package rmit.cosc.s3613385;
 
import java.util.concurrent.ThreadLocalRandom;

public class Cyclist extends  Athelets   {

	private static final int MIN_TIME = 500;
	private static final int MAX_TIME = 800;
	
	public Cyclist(String id, String name, int age, String state) {
		super(id, name, age, state);
	}

	@Override
	public int compete() {
		return ThreadLocalRandom.current().nextInt(MIN_TIME, MAX_TIME + 1);

	}
 

	 
}
