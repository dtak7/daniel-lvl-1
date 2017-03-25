// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;


public class tortoisecolorchooser {
	public static void main(String[] args) {
		for (int d=0;d<1000;d++){
			
Tortoise.setSpeed(10);
		//3. ask the user what color they would like the tortoise to draw
	String hi =	JOptionPane.showInputDialog(null, "what color do you want?");
		//4. use an if/else statement to set the pen color that the user requested
if (hi.equals("blue")){
	Tortoise.setPenColor(PenColors.Blues.Blue);
}
else if (hi.equals("red")){
	Tortoise.setPenColor(PenColors.Reds.Red);
}
//5. if the user doesn’t enter anything, choose a random color

else if (hi.equals("yellow")) {
	Tortoise.setPenColor(PenColors.Yellows.Gold);
}
else if (hi.equals("purple")){
	Tortoise.setPenColor(PenColors.Purples.Purple);}
else if (hi.equals("green")){
	Tortoise.setPenColor(PenColors.Greens.Green);
}
else if (hi.equals("white")){
	Tortoise.setPenColor(PenColors.Whites.White);
}
else if (hi.equals("pink")){
	Tortoise.setPenColor(PenColors.Pinks.Pink);
}
else {
	Tortoise.setPenColor(PenColors.Oranges.DarkOrange);
}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
Tortoise.move(203);
Tortoise.turn(90);
Tortoise.move(203);
Tortoise.turn(90);
Tortoise.move(203);
Tortoise.turn(90);
Tortoise.move(203);

		}
	}
}






