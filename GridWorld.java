import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	


public static void main(String[] args) {
	World world = new World();
	world.show();
	Bug buggy = new Bug();
	Location loc = new Location(2,4);
	world.add(loc, buggy);
	buggy.getLocation();
	Flower flower = new Flower();
	for(int i = 0;i<10;i++) {
		if(i%2==1) {
			flower.setColor(Color.white);
		}
		else {
			flower.setColor(Color.red);
		}
		for(int hi= 0;hi<10;hi++) {
			 Location floc = new Location(i,hi);
				world.add(floc, flower);
				
				
		}
	}

	
}
}
