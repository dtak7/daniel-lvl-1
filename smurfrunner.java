import javax.swing.JOptionPane;

public class smurfrunner {
public static void main(String[] args){
	Smurf smurf = new Smurf("Handy");
	  smurf.eat();
	  String a = smurf.getName();
	 System.out.println(a);
	 Smurf nurf = new Smurf("papa");
	String gerf = nurf.getHatColor();
	System.out.println(gerf);
	String foi = nurf.getName();
	System.out.println(foi);
	Smurf smurfette = new Smurf("smurfette");
	String hoi =smurfette.getName();
	System.out.println(hoi);
	String gurl=smurfette.isGirlOrBoy();
	System.out.println(gurl);
	String coi = smurfette.getHatColor();
	System.out.println(coi);
}
}

