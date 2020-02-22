package exercise4;

public class Person {
	private String name;
	private int age;
	private String job;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Person() {
		super();
	}
	public Person(String name, int age, String job, String id) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+"\nAge: "+this.age+"\nJob: "+this.job+"\nId: "+this.id;
	}

}
