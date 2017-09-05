package rmit.cosc.s3613385;
 
import java.util.concurrent.ThreadLocalRandom;

public class Swimmer extends   Athelets {

	private static final int MIN_TIME = 100;
	private static final int MAX_TIME = 200;


	public Swimmer(String id, String name, int age, String state) {
		super(id, name, age, state);
	}

	@Override
	public int compete() {
		return ThreadLocalRandom.current().nextInt(MIN_TIME, MAX_TIME + 1);

	}
  

}
