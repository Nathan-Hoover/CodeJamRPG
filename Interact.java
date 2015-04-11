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
	int response, arrayLocation;
	private CodeJamUI theUI;
	private Player thePlayer;
	private String[] promptArray = new String[1000];
	private String[][] choiceArray = new String[1000][4];
	
	public void setUI(){
		theUI = main.theUI;
	}
	
	public void setPlayer(){
		thePlayer = main.thePlayer;
	}
	
	public Interact(){
		for(int i = 0; i < 1000; i++){
			promptArray[i] = " ";
			for(int j = 0; j < 4; j++){
				choiceArray[i][j] = " ";
			}
		}
		promptArray[0] = "You, Manus Fati, have decided to take your son, Amor Fati, on a hunting expedition for his 13th birthday to show him how to be a man.  After you grab your bow and sword, both of you leave your home to search for some game to bring home for dinner that evening.  Amor is a bit reluctant to go deep into the forest nearby because it is common to hear discomforting noises in the direction.";
		choiceArray[0][0] = "Continue";
		
		promptArray[1] = "Amor - \"Dad, I'm not too sure this is a good idea.  I'm not entirely sure that I'm ready.\"";
		choiceArray[1][0] = "Of course you are. Let's go.";
		choiceArray[1][1] = "I don't care, you're coming.";
		choiceArray[1][2] = "If you're not ready we can try for a different day.";
		
		promptArray[2] = "You advance together into the forest following a particular path that you have trekked for many years of tracking.";
		choiceArray[2][0] = "Continue";
		
		promptArray[3] = "As the night begins to spread over the sky, you notice a peculiar glow through the trees.";
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
		
		promptArray[8] = "You begin to advance through the foliage.  As you exit the bushes, a blinding light explodes from the ground.  You feel a brief sense of weightlessness followed quickly by a thud.  Your head is splitting while you open your eyes.  You see a red stained world with Amor's face filled with terror.  You manage to looked around to see one of the hooded sorcerer's directly across from you as your vision fades to black. ";
		choiceArray[8][0] = "Continue.";
		///
		promptArray[9] = "You wake up in an unknown place.  Loud sounds fill your ears, muddled at first until it slowly becomes the sound of ocean waves crashing against wood, stone, and sand.  The sounds of people trying to sell their wares begin to overlap the sounds of the nature adding new layers and allowing you to gain your bearings.";
		choiceArray[9][0] = "Continue.";
		
		promptArray[10] = "You are confused as to what to do next.";
		choiceArray[10][0] = "Ask a passerby for directions";
		choiceArray[10][1] = "Examine a nearby bulletin board";
		
		promptArray[11] = "You find the next person who comes by, an elderly woman with well developed muscles, carrying a few large wooden planks.  Clearly, she has been a fisherman for the majority of her life.";
		choiceArray[11][0] = "\"Excuse me, do you know where I am?\"";
		choiceArray[11][0] = "[Str] Offer to help carry the planks.";
		choiceArray[11][0] = "Kick her over";
		
		promptArray[12] = "Elder woman- \"Oh, this is Seabreeze Village.  We provide almost all of the fish in Dies Natalis.  I haven’t seen you around here, where are you from?\"";
		choiceArray[12][0] = "\"I’m not sure, last I remember I was out hunting with my son, Amor Fati.  Speaking of, have you seen him?\"";
		
		promptArray[13] = "Elder woman- \"Oh how kind, here.\"  She hands you two of the planks. ";
		choiceArray[13][0] = "\"So, do you know this is?\"";
		choiceArray[13][1] = "Kick her over.";
		
		promptArray[14] = "You kick the elder woman, however she doesn’t budge.  She turns with an angry expression towards you, then transforming into a look of fear as she begins to run awayElder woman- \"Help! Help! It’s the murderer of tatters!\" She heads down the docks and as people begin to turn, you see their faces changing to looks of fear, despair, and hopelessness.";
		choiceArray[14][0] = "Chase after the elderly lady.";
		choiceArray[14][1] = "Leave town";
				
		promptArray[15] = "Elder woman- \"Amor Fati… hm… the name does seem familiar, but I can’t quite remember where from.  You might try the next town over to the west is good for finding the whereabouts of people  The more I look at you though…\"  She turns to an angry expression, then transforming into a look of fear as she begins to run away.  \"Help! Help! It’s the murderer of tatters!\" She heads down the docks and as people begin to turn, you see their faces changing to looks of fear, despair, and hopelessness.";
		choiceArray[15][0] = "Chase after the elderly lady.";
		choiceArray[15][1] = "Leave town.";
		
		promptArray[16] = "You chase after the elderly woman.  Upon seeing this, the townsfolk begin shifting towards you.  You see them begin angry gestures soon turning into a riot, stones being thrown and oars being picked up.  They look poised to destroy you.";
		choiceArray[16][0] = "Leave town.";
		
		promptArray[17] = "You decide that leaving town is the best option.";
		choiceArray[17][0] = "Continue.";
		
		promptArray[18] = "You remember what the elderly woman said about the town to the west being useful for finding information, so you decide to head in that direction.";
		choiceArray[18][0] = "Continue.";
		
		promptArray[19] = "Along the road you see something shining behind some trees a walkable distance away.  You move close and see that it is a cave.  From the mouth of the cave a blue tinted mist lingers.";
		choiceArray[19][0] = "Take a look inside.";
		choiceArray[19][1] = "Continue on to the city in the west.";
		
		promptArray[20] = "You decided to take a look into the cave.  As you walk in, the light quickly disappears, leaving you in pitch black darkness.  You feel a familiar chill in the air, slowly crawling up your legs as you descend deeper into the darkness.  Feeling your way through the cave you turn a corner to see a blue light down the way.  Reaching the light, you see five men in long, woven robes, each sporting a hemp rope around their waist.  Sorcerers.";
		choiceArray[20][0] = "Continue.";
		
		promptArray[21] = "";
		choiceArray[21][0] = "Continue.";
		
		promptArray[22] = "Without your control a warmth deep in your gut seeps through your body like your body warming by the fire on a winter’s day.  Your vision blurs slightly, a red tinge glossing over.  Suddenly, your body moves on its own.  You draw your knife hanging at your waist, violently stabbing at each of the sorcerers.  One managed to live on who looks up to you from the floor.";
		choiceArray[22][0] = "Continue.";
		
		promptArray[23] = "You manage to gain control of yourself before killing the last man off.  The man is in a panic, and is clearly intent on running away.";
		choiceArray[23][0] = "\"What did you do to me!?\"";
		
		promptArray[24] = "Wounded Sorcerer- \"I didn’t do anything to you!...\" The sorcerer hacks up blood.";
		choiceArray[24][0] = "\"Who are you!?\".";
		
		promptArray[25] = "Wounded Sorcerer- \"My name’s Larcindor.  I…\" He coughs. \"I didn’t do anything to you, why did you do this?  I don’t understand… We were only trying to help...\"";
		choiceArray[25][0] = "Kill him.";
		choiceArray[25][1] = "Leave him.";
		choiceArray[25][2] = "Carry him out of the cave.";
		
		promptArray[26] = "You find a note on Larcindor’s body. It reads: \"The east conduit may be under his control.  Send someone.\"";
		choiceArray[26][0] = "Leave the cave.";
		
		promptArray[27] = "Larcindor: \"We can’t keep him in check because of you... it’s your responsibility now.\"  Larcindor gives a last cough and passes on. ";
		choiceArray[27][0] = "Check the body.";

		promptArray[28] = "You shove the note in your pocket.  You still have so many questions.  What happened in the cave?  Where am I?  Where is Amor? you think it would be best to head towards the city in the west for answers.";
		choiceArray[28][0] = "Continue.";
		
		promptArray[29] = "";
		choiceArray[29][0] = "";
		
		promptArray[30] = "";
		choiceArray[30][0] = "";
		
		promptArray[31] = "";
		choiceArray[31][0] = "";
		
		promptArray[32] = "";
		choiceArray[32][0] = "";
		
		promptArray[33] = "";
		choiceArray[33][0] = "";

	}
	public void runPrologue(){
		while(arrayLocation < 1000){
			loadArrayData(arrayLocation);
			switch(arrayLocation){
			case 0: arrayLocation++; break;	
			case 1: arrayLocation++;
					if(response == 2){
						thePlayer.changeMorality(-1);
					}
					if(response == 3){
						thePlayer.changeMorality(1);
					}
					break;
			case 2: arrayLocation++; break;
			case 3:
				if(response == 1){
					arrayLocation = 4;
				}
				if(response == 2){
					arrayLocation = 5;
				}
				break;
			case 4: arrayLocation = 6; break;
			case 5: arrayLocation++; break;
			case 6: arrayLocation++; break;
			case 7: arrayLocation++; break;
			case 8: arrayLocation++; break;
			case 9: arrayLocation++; 
				theUI.setArt("fishing.jpg");
				break;
			case 10:
				if(response == 1){
					arrayLocation = 11;
				}
				if(response == 2){
					arrayLocation = 12;
				}
				break;
			case 11:
				if(response == 1){
					arrayLocation = 12;
				}
				if(response == 2){
					arrayLocation = 13;
					thePlayer.changeStrength(1);
				}
				if(response == 3){
					arrayLocation = 14;
					thePlayer.changeMorality(-1);
				}
				break;
			case 12: arrayLocation = 15; break;
			case 13:
				if(response == 1){
					arrayLocation = 12;
				}
				if(response == 2){
					arrayLocation = 14;
					thePlayer.changeMorality(-1);
				}
				break;
			case 14:
				if(response == 1){
					arrayLocation = 16;
					thePlayer.changeIntelect(-1);
				}
				if(response == 2){
					arrayLocation = 17;
				}
				break;
			case 15:
				if(response == 1){
					arrayLocation = 16;
					thePlayer.changeIntelect(-1);
				}
				if(response == 2){
					arrayLocation = 17;
				}
				break;
			case 16: arrayLocation = 17; break;
			case 17: arrayLocation = 18; break;
			case 18: arrayLocation = 19; break;
			case 19: 
				if(response == 1){
					arrayLocation = 20;
				}
				if(response == 2){
					arrayLocation = 21;
				}
				break;
			case 20: arrayLocation = 22; break;
			case 22: arrayLocation++; break;
			case 23:
				if(response == 1){
					arrayLocation = 24;
				}
				if(response == 2){
					arrayLocation = 25;
				}
				break;
			case 24: arrayLocation++; break;
			case 25:
				if(response == 1){
					arrayLocation = 26;
					thePlayer.changeMorality(-2);
				}
				if(response == 2){
					arrayLocation = 26;
					thePlayer.changeMorality(-1);
				}
				if(response == 3){
					arrayLocation = 27;
					thePlayer.changeMorality(1);
					thePlayer.changeDexterity(1);
				}
				break;
			case 26: arrayLocation = 28; break;
			case 27: arrayLocation = 26; break;
			case 28: arrayLocation = 29; break;
			case 29:
				theUI.setArt("arena.jpg");
				if(response == 1){
					arrayLocation = 30;
				}
				if(response == 2){
					arrayLocation = 31;
					thePlayer.changeIntelect(1);
				}
				if(response == 3){
					arrayLocation = 32;
					thePlayer.changeMorality(1);
					thePlayer.changeDexterity(1);
				}
				break;
			case 30:
				if(response == 1){
					arrayLocation = 31;
					thePlayer.changeStrength(1);
				}
				if(response == 2){
					arrayLocation = 32;
					thePlayer.changeDexterity(1);
				}
				if(response == 3){
					arrayLocation = 33;
					thePlayer.changeIntelect(1);
				}
				break;
				
				
				
				
				
				
			}	
		}
	}
	
	private void loadArrayData(int i) {
		theUI.setStatus();
		theUI.setPrompt(promptArray[i]);
		theUI.setChoices(choiceArray[i][0], choiceArray[i][1], choiceArray[i][2], choiceArray[i][3]);
		response = 0;
		while(response == 0){
			try {
			       Thread.sleep(200);
			    } catch(InterruptedException e) {
			    }
		}
	}

	public void setResponse(int i) {
		response = i;
	}
	
}
