
public class Turtle {
	private String gender, name, species;
	private int age;
	private static int numTurtles = 0;

	public Turtle(String gender, String name, String species, int age) {
		this.gender = gender;
		this.name = name;
		this.species = species;
		this.age = age;
		numTurtles = numTurtles+1;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getSpecies() {
		return species;

	}

	public int getAge() {
		return age;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static int getNumTurtles(){
		return numTurtles;
		
	}
}
