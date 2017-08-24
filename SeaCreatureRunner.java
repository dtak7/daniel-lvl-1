import com.sun.org.glassfish.gmbal.ManagedAttribute;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature sponge = new SeaCreature("Spongebob");
	sponge.eat();
	sponge.laugh();
	SeaCreature pat = new SeaCreature("Patrick");
	pat.getName();
	pat.eat();
	pat.laugh();
	SeaCreature squid = new SeaCreature("Squidward");
	squid.getName();
	squid.eat();
	squid.laugh();

}
}
