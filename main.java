import java.io.IOException;

class main {
	public static CodeJamUI theUI;
	public static Interact theInteractions;
	public static Player thePlayer;
	
	public static void main(String[] args){
		try {
			theInteractions = new Interact();
			theUI = new CodeJamUI();
			thePlayer = new Player();
			
			theInteractions.setUI();
			theUI.setInteract();
			theInteractions.setPlayer();
			
			theInteractions.runPrologue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
