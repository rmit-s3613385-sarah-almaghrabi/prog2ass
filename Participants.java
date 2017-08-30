package rmit.cosc.s3613385;

abstract class  Participants {
	private String id;
	private String name;
	private int age;
	private String state;
	
	
	public Participants(String id, String name, int age, String state) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getState() {
		return state;
	}

 
	 
 

}
