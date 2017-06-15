import java.awt.Graphics;

public class GameObjects {
	int x = 100;
	int y = 100;
	int width;
	int height;

	public void update() {
		x=x+1;
		y=y+2;
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
}
