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
	String[] promptArray = new String[1000];
	String[][] choiceArray = new String[1000][4];
	
	public void setUI(){
		theUI = main.theUI;
	}
	
	public void prologueTest(){
		for(int i = 0; i < 1000; i++){
			promptArray[i] = "";
			for(int j = 0; j < 4; j++){
				choiceArray[i][j] = "";
			}
		}
		promptArray[0] = "You, Manus Fati, have decided to take your son, Amor Fati, on a hunting expedition for his 13th birthday to show him how to be a man.  After you grab your bow and sword, both of you leave your home to search for some game to bring home for dinner that evening.  Amor is a bit reluctant to go deep into the forest nearby because it is common to hear discomforting noises in the direction.";
		choiceArray[0][0] = "Continue";
		
		promptArray[1] = "Amor - “Dad, I’m not too sure this is a good idea.  I’m not entirely sure that I’m ready.”";
		choiceArray[1][0] = "Of course you are. Let's go.";
		choiceArray[1][1] = "I don't care, you're coming.";
		choiceArray[1][2] = "If you're not ready we can try for a different day.";
		
		promptArray[2] = "You advance together into the forest following a particular path that you have trekked for many years of tracking.";
		choiceArray[2][0] = "Continue";
		
		promptArray[3] = "As the night behins to spread over the sky, you notice a peculiar glow through the trees.";
		choiceArray[3][0] = "Move closer";
		choiceArray[3][1] = "Amor, go check the light out.  I'll watch your back.";
		
		promptArray[4] = "Your curiosity gets the better of you and yo umove closer to the glowing light.";
		choiceArray[4][0] = "Continue";
		promptArray[5] = "You should Amor forward towards the light.  After a short pause, you move forward as well.";
		choiceArray[5][0] = "Continue.";
		
		promptArray[6] = "Upon closer inspection, the light seems to be emanating from a group of people huddling closely together in a small clearing.  There is a faint whisper in the air, most akin to a chant, coming from the direction.";
		choiceArray[6][0] = "Continue moving closer.";
		
		promptArray[7] = "As you move closer to the clearing, the people become more visible.  Five men are gathered together in a circle, all chanting some sort of biblical verse or mantra, all in gray, woven robes with hemp cords along their waists.  The dull glow has now turned into a massive aura enveloping the mass.  These people are clearly sorcerers.";
		choiceArray[7][0] = "Attack them.";
		choiceArray[7][1] = "Move closer.";
		
		promptArray[8] = "You begin to advance through the foliage.  As you exit the bushes, a blinding light explodes from the ground.  You feel a brief sense of weightlessness followed quickly by a thud.  Your head is splitting while you open your eyes.  You see a red stained world with Amor’s face filled with terror.  You manage to looked around to see one of the hooded sorcerer’s directly across from you as your vision fades to black. ";
		choiceArray[8][0] = "Continue.";
		
		
	}

	public void setResponse(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
