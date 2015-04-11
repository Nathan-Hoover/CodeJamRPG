import java.io.IOException;
import java.net.MalformedURLException;

class main {
	public static CodeJamUI theUI;
	public static Interact theInteractions;
	public static Player thePlayer;
	
	public static void main(String[] args) throws MalformedURLException, IOException{
		theInteractions = new Interact();
		theUI = new CodeJamUI();
		thePlayer = new Player();
		
		theUI.setPlayer();
		theInteractions.setUI();
		theUI.setInteract();
		theInteractions.setPlayer();
		
		theInteractions.runPrologue();
	}
}
