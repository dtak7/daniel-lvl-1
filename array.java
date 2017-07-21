
public class array {
	public static void main(String[] args) {
		String[] family = { "Josh", "Hiroko", "Sarah", "Daniel" };
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i]);
		}
		String[] pets = new String[2];
		pets[0] = "bob";
		pets[1] = "kazu";
		for (int i = 0; i < pets.length; i++) {
			System.out.println(pets[i]);
		}
	}
}