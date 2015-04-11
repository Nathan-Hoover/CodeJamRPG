/*
CodeJamUI API
-----------------------------------
protected void setChoices(String textOptionOne, String textOptionTwo, String textOptionThree, String textOptionFour) 

protected void setPrompt(String inputPromptText)

protected void setArt(String pictureName)
	
protected void setMap(String mapName)

Player API
-----------------------------------
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
