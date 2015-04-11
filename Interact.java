/*
CodeJamUI API
-----------------------------------
protected void setChoices(String textOptionOne, String textOptionTwo, String textOptionThree, String textOptionFour) 

protected void setPrompt(String inputPromptText)

protected void setArt(String pictureName)
	
protected void setMap(String mapName)

Player API
-----------------------------------
public void changeStrength(int changeBy)

public void changeIntelect(int changeBy)
	
public void changeDexterity(int changeBy)
	
public void changeMorality(int changeBy)

public int getStrength()

public int getIntelect()
	
public int getDexterity()
	
public int getMorality()
 */
class Interact {
	CodeJamUI theUI;
	
	public void setUI(){
		theUI = main.theUI;
	}
	
	public void test(){
		theUI.setMap("mapPlaceHolder2.jpg");
		System.out.println("I made it to the Interact");
	}
	
}
