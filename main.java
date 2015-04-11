import java.io.IOException;

class main {
	public static CodeJamUI theUI;
	public static Interact theInteractions;
	
	public static void main(String[] args){
		try {
			theInteractions = new Interact();
			theUI = new CodeJamUI();
			
			theInteractions.setUI();
			theUI.setInteract();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
