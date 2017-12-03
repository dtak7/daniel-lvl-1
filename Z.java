import javax.swing.JOptionPane;

public class Z {
public static void main(String[] args) {
	String Qone = JOptionPane.showInputDialog("You are being marched toward prison. Will you run or keep marching");
	if(Qone.equals("run")){
		JOptionPane.showMessageDialog(null, "the gaurds shoot you and you die");
	}
		else{
			JOptionPane.showInputDialog("You arrive at the prison and are shown to your cell. Do you want to escape? yes or no");
		}
	
}
}
