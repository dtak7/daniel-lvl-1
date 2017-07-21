
public class runnerTurtule {
	public static void main(String[] args) {
		Turtle turt = new Turtle("girl", "turt", "letherback", 35);
		System.out.println("I have "+Turtle.getNumTurtles()+" turtles");
		Turtle bob = new Turtle("boy", "bob", "gelopogos", 120);
		System.out.println("my two turtles names are " + turt.getName() + " " + bob.getName());
		bob.setName("bobby");
		System.out.println("my two turtles names are " + turt.getName() + " " + bob.getName());
		System.out.println("my turtle bob is " + bob.getAge());
		bob.setAge(0);
		System.out.println("my turtle bob is " + bob.getAge());
		System.out.println("I have "+Turtle.getNumTurtles()+" turtles");
	}
}
