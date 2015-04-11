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
		
		promptArray[29] = "You head to the city in the west.  A sign reads \"West City\".  The irony seeps in and you let out a brief chuckle.  You enter West City.  A great arena made of wood stands in the center of the desert town.  Masses of people are all eager to get into the spectator gates, pushing and shoving their way through the crowd.  Around the grand stadium, the roads are lined with merchants trying to sell wares from around the island: swords, gems, exotic foods and more.  Around them appears a housing district, obviously well maintained and taken care of.  A table rests in front of the arena where a hefty, loud man calls you out. Entry Attendant- \"Hey, aren’t you the infamous murderer that has been tearin’ through these parts recently?\"";
		choiceArray[29][0] = "\"I’m no murderer.\"";
		choiceArray[29][1] = "[int] \"Why don’t you tell me about this murderer?\"";
		choiceArray[29][2] = "\"I found a cave back before this town, do you know anything about it?\"";
		
		promptArray[30] = "Entry Attendant- \"Well, you sure look like him!\"  He shows you a wanted poster with a man of distinct features almost perfectly matching your profile.  \"I’ll tell you what, I won’t say anything if you want to hop in the arena and give our folks a good show!  The regulars haven’t been providing too much entertainment for the guests!  There’s even a good amount of gold for winning if that interests ya more.\"";
		choiceArray[30][0] = "[str] “Well, I’m no stranger to danger.”";
		choiceArray[30][1] = "[dex] \"I wouldn’t mind testing out my blades.\"";
		choiceArray[30][2] = "[int] \"Some gold wouldn’t hurt for my travels\"";
		
		promptArray[31] = "Entry Attendant- \"A feisty one, eh?  Alright, just hope in the ring and we will show you a good time!\"  The man winks in a provocative way and opens the gate.";
		choiceArray[31][0] = "Continue into the arena.";
		
		promptArray[32] = "Entry Attendant- \"A bit arrogant, but there are much more arrogant ‘round here than you.  Alright, just hope in the ring and we will show you a good time!\"  The man winks in a provocative way and opens the gate.";
		choiceArray[32][0] = "Continue into the arena.";
		
		promptArray[33] = "Entry Attendant- \"Thinking of the future is smart thinkin’.  Alright, just hope in the ring and we will show you a good time!\"  The man winks in a provocative way and opens the gate.";
		choiceArray[33][0] = "Continue into the arena.";
		
		promptArray[34] = "You step into the arena and immediately smell a mix of decaying and fresh blood, enough to make your eyes water.  You hear someone talking to you.Borale- \"Hey!  I’m glad I could finally reach you!  I’ve been sitting in here trying to talk to you for a while now, I guess it takes a bit more than stealing your body to get a conversation goin’, huh?\"";
		choiceArray[34][0] = "\"Who is that? Who is talking?\"";
		choiceArray[34][1] = "You look around. \"Where are you?\"";
		
		promptArray[35] = "Borale- \"I’m Borale, I’ve been with you for quite a long time, y’know.  I thought you would’ve noticed earlier, but I guess everyone isn’t as observant of me.\"";
		choiceArray[35][0] = "\"You look around.  Where are you?\"";
		
		promptArray[36] = "Borale- \"Ah well, that’s a bit hard to explain.  It seems that I’m inside of you, y’see.\"  Your arm moves involuntarily towards your chest and points at it.";
		choiceArray[36][0] = "\"I don’t understand.\"";
		choiceArray[36][1] = "\"Do you know where my son is?\"";
		
		promptArray[37] = "Borale- \"Well, you’ll come to understand over time.  Basically, we share a body.\"";
		choiceArray[37][0] = "\"Do you know where my son is?\"";
		
		promptArray[38] = "Borale- \"Mmmmm…. maybe I do.  Maybe I don’t.  All depends on what you do for me. Right now though, it might be in your best interest to let me take the reins.\"  After hearing this, you realize your opponent stands before you.  A seven foot tall man wearing steel armor from head to toe carrying a massive flail, its heads dangling below him.";
		choiceArray[38][0] = "\"Fine.  Get me out of this.\"";
		choiceArray[38][1] = "\"No, I can handle this myself.\"";

		promptArray[39] = "Borale- \"Thought you’d never ask!\"  You feel caught up in the moment, the whole scene becomes a blur. You see yourself move towards the giant, but before impact you blink… and open your eyes outside with a bag of gold in your hand.  Your clothes are a bit blood stained, but nothing that hasn’t happened before while hunting. Entry Attendant- \"Spectacular show, sir!  Best we’ve seen in ages!  Please do come back, consider you an honored guest here!\"";
		choiceArray[39][0] = "Ask about Amor.";
		
		promptArray[40] = "Borale- \"Have it your way, then. I won’t interfere.\" As the words stop in your head, the calmness you felt immediately disappeared.  Fear overtakes your body, stopped you from moving. Your body doesn’t listen to you. The large man approached, flail swinging in preparation for the engagement. He starts his swing, the flail coming directly at your head. In the spur of the moment you dodge left, inches from getting splattered all over the moist sand. You line up a counterattack with you dagger, aiming for his unarmored right armpit. Your strike connects so fluidly it almost seemed supernatural. The giant man grips his armpit, but doesn’t stand long until he drops to his knees, then flat on to the ground. You exit the arena and the entry attendant throws your a bag of coins.Entry Attendant- \"Spectacular show, sir!  Best we’ve seen in ages!  Please do come back, consider you an honored guest here!\"";
		choiceArray[40][0] = "Ask about  Amor.";
	
		promptArray[41] = "Entry attendant-  \"Well, you’ve really helped me out with pleasing some fans, I wouldn’t mind throwing you some information. About two years ago a young man named, \"Amor Fati\", did in fact roll through here. He, like you, put on a great show. Everyone was surprised about his ability at such a young age. To think, a 16 year old could take on five of our best fighters and not even get a single scratch. A prodigy I’d say! After that he took off Natten.\" He nods toward the east. \"He probably isn’t there anymore, but it’d be a good place to start.\"";
		choiceArray[41][0] = "Head towards the east.";
		
		promptArray[42] = "You walk towards the east. Along the way, you pass back by the cave and Seabreeze Village. You make sure to stay far away from the village to avoid contact. As you approach Natten, you are stopped by the Ztezi Swamp.";
		choiceArray[42][0] = "Continue.";
		
		promptArray[43] = "As you enter the swamp, the stench of rotting wood and stagnant water bombards your face, causing your stomach to churn in an unsettling way. You press forward into the swamp, the feeling of vomit approaching closer and closer the deeper you go in.Borale- \"You might want to hold up. There’s something ahead.\"";
		choiceArray[43][0] = "Stop according to Borale’s request.";
		choiceArray[43][1] = "Continue on.";
		
		promptArray[44] = "You heed Borale’s advice and stop. You sense something off about this place. The water begins to move in an unnatural way, you instantly take a defensive stance. The water’s surface breaks revealing an eight foot tall half alligator half man beast, claws sharp enough to tear through the toughest armor. His scaled skin appears stronger than anything you’ve ever seen. His eyes glow red and his mouth agape poised to sink its teeth into the next thing he sees.";
		choiceArray[44][0] = "[Str > 11] Fight";
		choiceArray[44][1] = "[Dex > 11] Run";
		choiceArray[44][2] = "[Int > 11] Talk to";
		choiceArray[44][3] = "Ask Borale for advice";

		promptArray[45] = "You continue forward, ignoring Borale’s advice. You step into a deeper water and when you do, the water seemingly engulfs you. In an instant all you can see in a tornado of water surrounding you, followed by glowing red eyes. Everything begins to turn red the quickly fades to black.";
		choiceArray[45][0] = "FAIL_STATE";

		promptArray[46] = "The creature appears poised to attack, but you don’t intend to let him move first. You dash forward at the beast, meeting his right hook with your dagger. You immediately fly backwards by the force of his strength. He makes the next move, dashing towards you this time. Realizing you can’t take him head on you duck under his repeated right hook and return with a double handed stab to his kidney.  As the dagger connected, the metal snaps like a twig against his defense.";
		choiceArray[46][0] = "[Fight] \"I’m not done with you yet!\"";
		choiceArray[46][1] = "Run";

		promptArray[47] = "You realize that this beast is leaps and bounds above your ability and you hurl your dagger at it as a distraction to flee";
		choiceArray[47][0] = "Continue";

		promptArray[48] = "You realize that this beast is a humanoid, meaning that it likely can speak common.  You put your dagger on the ground and speak, \"I don’t mean you any harm.  Let’s talk about this civilly.  I am only passing through.\"  The beast cocks it’s head back and replies \"It’s just me and MY swamp!\"  The beast rushes you.";
		choiceArray[48][0] = "Defend yourself.";
		choiceArray[48][1] = "Run.";

		promptArray[49] = "You ask Borale for what to do in this situation. Borale- \"Well, I wouldn’t advice fighting that… thing.\"";
		choiceArray[49][0] = "[Str > 11] Fight";
		choiceArray[49][1] = "[Dex > 11] Run";
		choiceArray[49][2] = "[Int > 11] Talk to";
		choiceArray[49][3] = "Ask Borale for advice";

		promptArray[50] = "You run back at the beast unarmed, but with the courage of a true warrior. Unfortunately, it only took the one swipe to end it all.";
		choiceArray[50][0] = "FAIL_STATE";

		promptArray[51] = "You decide it is best not to engage the beast further and you book it to get out of the swamp. You take a quick look back and the beast has not given chase. You exit the swamp.";
		choiceArray[51][0] = "Continue";

		promptArray[52] = "Your dagger made for a great distraction and you escape with ease. You exit the swamp.";
		choiceArray[52][0] = "Continue";

		promptArray[53] = "The beast passes ground quickly and is in your face in a fraction of a second. Your frail body doesn’t put up any resistance for the swipe of his claw.";
		choiceArray[53][0] = "FAIL_STATE";

		promptArray[54] = "As you exit the swamp you follow the path east and arrive at Natten. The town only features two buildings: the tavern and the blacksmith’s shop. The blacksmith is outside forging some sort of farm equipment. He looks up at your arrival and gives a nasty glare. The tavern appears to be a bit run down, but clearly houses many people often. You look out to the rest of the town to see a field of crops, almost in season. There is one farmer walking in the crops, appearing to be checking it out.";
		choiceArray[54][0] = "Talk to the smithy.";
		choiceArray[54][1] = "Go to the Tavern.";
		choiceArray[54][2] = "Talk to the Farmer.";

		promptArray[55] = "You walk up to the blacksmith. He is eyeballing you from head to toe, probably drawing an opinion about you.";
		choiceArray[55][0] = "\"I lost my dagger in the Zetzi Swamp back there, I don’t suppose there is a way I can get a sword from you?\"";

		promptArray[56] = "You head to the tavern. The door creaks as you walk in. You see a couple tables with only one chair. The wooden floors are caked with dried mud. You see a couple farmers sitting on the floor in the corner. Across the room lies a staircase to the second floor with a bar next to it. Tavern Keeper looks at you with expectant eyes as you draw near.";
		choiceArray[56][0] = "\"What do you have for sale?\"";
		choiceArray[56][1] = "\"How are you?\"";
		choiceArray[56][2] = "\"Do you have a room I can stay in for the night?\"";

		promptArray[57] = "You head over to the fields and call out to the farmer. He looks up and nods his head, moving forward.Farmer- \"Hey, how ya doin’? We don’t see many new folk around here with the swamp so close. Are you just passin’ through or ya here to the smithy shop?\"";
		choiceArray[57][0] = "\"I’m just passing through.\"";
		choiceArray[57][1] = "\"I’m in need of a sword.\"";
		choiceArray[57][2] = "\"I’m actually walking around the countryside helping people out in need. I don’t suppose I could give you a hand?\"";
		choiceArray[57][3] = "Throw some dirt in his eyes and walk away.";

		promptArray[58] = "Blacksmith- \"I’m not gonna make it for you. I only make farm tools and not for outsiders.\" The Blacksmith turns away and continues working on this project.";
		choiceArray[58][0] = "Leave, there’s nothing else to do here.";

		promptArray[59] = "Tavern Keeper- \"Well, the season hasn’t been too good on us this year. We have a few kegs of ale and some tomatoes to eat.\"";
		choiceArray[59][0] = "\"I’ll take some ale.\"";
		choiceArray[59][1] = "\"I’ll take some tomatoes.\"";
		choiceArray[59][2] = "I don’t need anything.";

		promptArray[60] = "Tavern Keeper- \"I’m doing well. Not much business besides locals. It’s nice to just relax and enjoy yourself.\"";
		choiceArray[60][0] = "Continue";

		promptArray[61] = "Tavern Keeper- \"Yes, we have two rooms upstairs. I will book you one for the night.\"";
		choiceArray[61][0] = "\"I’ll actually take both.\"";
		choiceArray[61][1] = "\"Alright.\"";

		promptArray[62] = "Farmer- \"Oh, just passin’ through? No one ever stays here to chat with me anymore…\"";
		choiceArray[62][0] = "Continue";

		promptArray[63] = "Farmer- \"If you need a sword, our smithy is one of the best smiths in Dies Natalia. He doesn’t ever seem to make weapons anymore, let alone sell to outsiders.\"";
		choiceArray[63][0] = "Continue";

		promptArray[64] = "Farmer- \"Oh, sure!  We are always looking for people to lend a hand.\" You help the farmer maintain the crops.";
		choiceArray[64][0] = "\"Have you heard anything about Amor Fati? He’s my son and I heard he came through here a bit ago.\"";

		promptArray[65] = "You throw dirt in the farmer’s and walk away. You hear the farmer cursing you as you leave. You don’t care.";
		choiceArray[65][0] = "Continue";

		promptArray[66] = "You sprint past the beast and make it out of the swamp.";
		choiceArray[66][0] = "Continue";

		promptArray[67] = "You get some Ale and drink it.  It doesn’t have much effect.";
		choiceArray[67][0] = "Continue";

		promptArray[68] = "You get a couple tomatoes. You eat the raw. They’re not too bad, actually.";
		choiceArray[68][0] = "Continue";

		promptArray[69] = "Tavern Keeper- \"Alright, I’ll reserve them for you.\"";
		choiceArray[69][0] = "Continue";

		promptArray[70] = "Tavern Keeper- \"Alright, I’ll reserve it for you.\"";
		choiceArray[70][0] = "Continue";

		promptArray[71] = "The night creeps in and you return to your room. Your room has a straw bed on the floor with a blanket on top. Across the room holds an open window. It is a nice night.";
		choiceArray[71][0] = "Look out the window.";
		choiceArray[71][1] = "Go to sleep.";


		promptArray[72] = "You lay down on your bed, but can’t seem to drift into sleep.";
		choiceArray[72][0] = "Continue";

		promptArray[73] = "You look out the window. You can see across the crop fields and into the distance.  You can see the sun’s rays just barely over the edge of the ocean. You remember what the farmer said about Amor visiting the blacksmith. You glance over at the blacksmith’s shop and notice a dim blue aura.";
		choiceArray[73][0] = "Investigate.";

		promptArray[74] = "Farmer- \"Amor… Yes I do think he came through.  It was brief; he spent a lot of time with the blacksmith, and left before the day was out.  It was an odd visitor.\"";
		choiceArray[74][0] = "\"Thanks, I appreciate the info.\"";

		promptArray[75] = "You leave the tavern and head  to the blacksmith’s shop.  You glance around the shop until you notice the boxes in the back are more blue than the rest of the shop.";
		choiceArray[75][0] = "[Dex>12] You slide the boxes silently out of the way.";
		choiceArray[75][1] = "[Str>12] You hurl the boxes across the room.";
		choiceArray[75][2] = "[Int>12] You spy through the boxes.";
		choiceArray[75][3] = "You see if you can find the source of the boxes.";

		promptArray[76] = "With the boxes moved out of the way, you unveil a secret passage which the blue aura is pouring out from.";
		choiceArray[76][0] = "Enter the passage";

		promptArray[77] = "The boxes fly across the room, crashing in the road.  You find a secret passage under the boxes which the blue aura is pouring out from.";
		choiceArray[77][0] = "Enter the passage.";

		promptArray[78] = "You find a secret passage  between the boxes and find a path that you can navigate through.";
		choiceArray[78][0] = "Enter the passage";

		promptArray[79] = "As you search for the source of the blue aura, you stumble over an ingot and smash into the boxes, revealing a secret passage.";
		choiceArray[79][0] = "Enter the passage.";

		promptArray[80] = "You enter the passage, the blue aura pouring around your body like an enveloping mist .  As you draw closer, you begin to make out a pentagram shaped circle on the ground when you hear Borale call out, \"Watch your back!\" You quickly turn around to find the blacksmith closing on you with an axe.";
		choiceArray[80][0] = "[Str] Overpower the smith";
		choiceArray[80][1] = "[Dex] Evade and escape";
		choiceArray[80][2] = "[Int] Persuade to stop";
		choiceArray[80][3] = "Back up into the cavern";

		promptArray[81] = "As the smith comes at you with his axe ready to strike, you match his grip on the axe with yours.  You both struggle for the axe when you manage to trip the smith the ground.  You run out of the exit and smash one of the support beams of the shop with a metal rod.  The beam snaps and the house collapses.  Just before it hits, you look back to see the smith coming out of the passage, axe in hand, get crushed by the wreckage.  When the dust clears you see the axe in the rubble.  You grab it.";
		choiceArray[81][0] = "Continue";

		promptArray[82] = "The smith heads in your direction, but with your cunning you slide right past him.  You run out of the exit and smash one of the support beams of the shop with a metal rod.  The beam snaps and the house collapses.  Just before it hits, you look back to see the smith coming out of the passage, axe in hand, get crushed by the wreckage.  When the dust clears you see the axe in the rubble.  You grab it.";
		choiceArray[82][0] = "Continue";

		promptArray[83] = "You call out in attempt to persuade the smith to stop his attack.  He does not hesitate in his assault.  Realizing this, you run out of the exit and smash one of the support beams of the shop with a metal rod.  The beam snaps and the house collapses.  Just before it hits, you look back to see the smith coming out of the passage, axe in hand, get crushed by the wreckage.  When the dust clears you see the axe in the rubble.  You grab it.";
		choiceArray[83][0] = "Continue";

		promptArray[84] = "You back up into the cavern towards the pentagram on the ground.  The smith swings for you as you dodge, making him fall on the pentagram.  The pentagram lights up and explodes in a ball of lightning.  When the smoke clears, the smith is left on the floor.  You take his axe and head up the exit.";
		choiceArray[84][0] = "Continue";

		promptArray[85] = "The morning arrives shortly after and you decide to head back home to see if your son is there.  You head northeast towards the Forest of Fate.  After a few weeks of traveling you arrive at your home.  It is vastly dilapidated in comparison to how you remember it.  Nature has invaded, entering through the wooden walls, pulling it apart where it can in an attempt to assimilate it.  It is definitely your home, however it doesn’t feel like you belong here anymore.  You notice look around you and notice two separate remains of campfires as well as spots on the grass where tents were raised.  Multiple people have been here.";
		choiceArray[85][0] = "Go inside";
		choiceArray[85][1] = "Look around back";
		choiceArray[85][2] = "Head towards where you were hunting with Amor";

		promptArray[86] = "You head inside, the stairs creaking so harsh that it makes you wonder if they’ll hold.  You enter the living room.  The room has its couch and its chairs broken or torn apart, used for parts or perhaps kindle for the campfires.  ";
		choiceArray[86][0] = "Head upstairs";
		choiceArray[86][1] = "Go back outside";

		promptArray[87] = "You head around the back of the house to see the cliff heading to the ocean.  The back of the house is overgrown like the rest of the house, but the grass is quite tall suggesting that no one has come back here.";
		choiceArray[87][0] = "Go back to the front";

		promptArray[88] = "You head upstairs, the stairs creaking worse than the outside stairs.  You can hear the snapping of fibers as you go continually higher.  You arrive at the bedroom that you and Amor slept in.  The beds have been torn apart and scavenged similar to the couch and chairs downstairs.  Your dresser has its drawers pulled out, as if someone took everything out of it in a hurry.  ";
		choiceArray[88][0] = "Head back downstairs";

		promptArray[89] = "You go back outside.";
		choiceArray[89][0] = "Head into the forest";

		promptArray[90] = "You arrive at the main floor";
		choiceArray[90][0] = "Go back to the front";

		promptArray[91] = "You head into the forest.  As you walk the path, memories of what happened in the past flood your mind.  Your vision begins to blur.  You arrive at the spot where you were attacked in the past.  There are five sorcerers there, the same from before.  Your head begins to spin.  ";
		choiceArray[91][0] = "[Str > 12] Grab one of the Sorcerers, \"It was you!  You did this to me!  Who is Borale?  Why is he inside me!?\"";
		choiceArray[91][1] = "[Dex > 12] You examine your surroundings to check for traps.";
		choiceArray[91][2] = "[int > 12] Observe the sorcerer’s body movements and facial expressions for a logical solution.";
		choiceArray[91][3] = "Kill them!";
		
		promptArray[92] = "Sorcerer1- \"We didn’t do anything! I swear!  It was just bad luck that you stepped on the circle!\"  You let go of the sorcerer and look down at the glowing blue circle on the ground.  The blue aura is emanating from it.";
		choiceArray[92][0] = "\"What is this circle?\"";
		choiceArray[92][1] = "\"Who is Borale?\"";
		
		promptArray[93] = "You look around around you quickly and efficiently.  There is a blue pentagram surrounded by a  circle on the ground, the same one you’ve seen in the cave between Seabreeze Village and West City and the same one as in Natten.  You have questions and these sorcerers have answers.";
		choiceArray[93][0] = "\"What is this circle?\"";
		choiceArray[93][1] = "\"Who is Borale?\"";
		
		promptArray[94] = "You observe the Sorcerers as you encounter them.  The sorcerers all have a look of surprise, fear, and most importantly, regret.  They all seem to be a bit shifty, not in a harmful way or like they are going to retreat.  They just seem nervous.  You think they will be willing to answer questions.";
		choiceArray[94][0] = "\"What is this circle?\"";
		choiceArray[94][1] = "\"Who is Borale?\"";

		promptArray[95] = "";
		choiceArray[95][0] = "Continue";

		promptArray[96] = "";
		choiceArray[96][0] = "Continue";

		promptArray[97] = "";
		choiceArray[97][0] = "Continue";

		promptArray[98] = "";
		choiceArray[98][0] = "Continue";

		promptArray[99] = "";
		choiceArray[99][0] = "Continue";

		promptArray[100] = "";
		choiceArray[100][0] = "Continue";

		promptArray[999] = "You have failed your quest of fate";
		choiceArray[999][0] = "Restart";


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
					thePlayer.changeMorality(-1);
				}
				if(response == 2){
					arrayLocation = 26;
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
			case 31: arrayLocation = 34; break;
			case 32: arrayLocation = 34;
			case 33: arrayLocation = 34;
			case 34:
				if(response == 1){
					arrayLocation = 35;
				}
				if(response == 2){
					arrayLocation = 36;
				}
				break;
			case 35: arrayLocation = 36; break;
			case 36: 
				if(response == 1){
					arrayLocation = 37;
				}
				if(response == 2){
					arrayLocation = 38;
				}
				break;
			case 37: arrayLocation = 38; break;
			case 38:
				if(response == 1){
					arrayLocation = 39;
					thePlayer.changeMorality(-1);
				}
				if(response == 2){
					arrayLocation = 40;
					thePlayer.changeMorality(1);
				}
				break;
			case 39: arrayLocation = 41; break;
			case 40: arrayLocation = 41; break;
			case 41: arrayLocation = 42; break;
			case 42: arrayLocation = 43; break;
			case 43: 
				theUI.setArt("swamp.jpg");
				if(response == 1){
					arrayLocation = 44;
				}
				if(response == 2){
					arrayLocation = 45;
				}
				break;
			case 44: 
				if(response == 1){
					if(thePlayer.getStrength() > 9){
						arrayLocation = 46;
						thePlayer.changeMorality(1);
					}else{
						arrayLocation = 44;
						thePlayer.changeIntelect(-1);
					}
				}
				if(response == 2){
					if(thePlayer.getDexterity() > 9){
						arrayLocation = 47;
						thePlayer.changeMorality(1);
					}else{
						arrayLocation = 44;
						thePlayer.changeIntelect(-1);
					}
				}
				if(response == 3){
					if(thePlayer.getIntelect() > 9){
						arrayLocation = 48;
						thePlayer.changeMorality(1);
					}else{
						arrayLocation = 44;
						thePlayer.changeIntelect(-1);
					}
				}
				if(response == 4){
					arrayLocation = 49;
					thePlayer.changeMorality(-1);
				}
				break;
				case 45:
					arrayLocation = 999;
					break;
				case 46:
					if(response == 1){
						arrayLocation = 50;
					}
					if(response == 2){
						arrayLocation = 51;
					}
					break;
				case 47: arrayLocation = 52; break;
				case 48:
					if(response == 1){
						arrayLocation = 53;
					}
					if(response == 2){
						arrayLocation = 51;
					}
					break;
				case 49:
					if(response == 1){
						if(thePlayer.getStrength() > 9){
							arrayLocation = 46;
						}else{
							arrayLocation = 44;
						}
					}
					if(response == 2){
						if(thePlayer.getDexterity() > 9){
							arrayLocation = 47;
						}else{
							arrayLocation = 44;
						}
					}
					if(response == 3){
						if(thePlayer.getIntelect() > 9){
							arrayLocation = 48;
						}else{
							arrayLocation = 44;
						}
					}
					if(response == 4){
						arrayLocation = 49;
					}
					break;
				case 50: arrayLocation = 999; break;
				case 51: arrayLocation = 54; break;
				case 52: arrayLocation = 54; break;
				case 53: arrayLocation = 999; break;
				case 54:
					theUI.setArt("circle2.jpg");
					if(response == 1){
						arrayLocation = 55;
					}
					if(response == 2){
						arrayLocation = 56;
					}
					if(response == 3){
						arrayLocation = 57;
					}
					break;
				case 55: arrayLocation = 58;
				case 56: 
					if(response == 1){
						arrayLocation = 59;
					}
					if(response == 2){
						arrayLocation = 60;
					}
					if(response == 3){
						arrayLocation = 61;
					}
					break;
				case 57:
					if(response == 1){
						arrayLocation = 62;
					}
					if(response == 2){
						arrayLocation = 63;
					}
					if(response == 3){
						arrayLocation = 64;
						thePlayer.changeMorality(1);
					}
					if(response == 4){
						arrayLocation = 65;
						thePlayer.changeMorality(-1);
					}
					break;
				case 58: arrayLocation = 59; break;
				case 59: 
					if(response == 1){
						arrayLocation = 67;
					}
					if(response == 2){
						arrayLocation = 68;
					}
					if(response == 3){
						arrayLocation = 56;
					}
					break;
				case 60: arrayLocation = 56; break;
				case 61: arrayLocation = 69; break;
				case 62: arrayLocation = 57; break;
				case 63: arrayLocation = 58; break;
				case 64: arrayLocation = 74; break;
				case 65: arrayLocation = 54; break;
				case 66: arrayLocation = 59; break;
				case 67: arrayLocation = 59; break;
				case 68: arrayLocation = 59; break;
				case 69: arrayLocation = 71; break;
				case 70: arrayLocation = 71; break;
				case 71: 
					if(response == 1){
						arrayLocation = 73;
					}
					if(response == 2){
						arrayLocation = 72;
					}
					break;
				case 72: arrayLocation = 71; break;
				case 73: arrayLocation = 75; break;
				case 74: arrayLocation = 54; break;
				case 75:
					if(response == 1){
						if(thePlayer.getDexterity() > 12){
							arrayLocation = 76;
						}else{
							arrayLocation = 75;
						}
					}
					if(response == 2){
						if(thePlayer.getStrength() > 12){
							arrayLocation = 77;
						}else{
							arrayLocation = 75;
						}
					}
					if(response == 3){
						if(thePlayer.getIntelect() > 12){
							arrayLocation = 78;
						}else{
							arrayLocation = 75;
						}
					}
					if(response == 4){
						arrayLocation = 79;
					}
					break;
				case 76: arrayLocation = 80; break;
				case 77: arrayLocation = 80; break;
				case 78: arrayLocation = 80; break;
				case 79: arrayLocation = 80; break;
				case 80:
					if(response == 1){
						arrayLocation = 81;
						thePlayer.changeStrength(1);
					}
					if(response == 2){
						arrayLocation = 82;
						thePlayer.changeDexterity(1);
					}
					if(response == 3){
						arrayLocation = 83;
						thePlayer.changeIntelect(1);
					}
					if(response == 4){
						arrayLocation = 84;
					}
					break;
				case 81: arrayLocation = 85; break;
				case 82: arrayLocation = 85; break;
				case 83: arrayLocation = 85; break;
				case 84: arrayLocation = 85; break;
				case 85: 
					theUI.setArt("delapHouse.jpg");
					if(response == 1){
						arrayLocation = 86;
					}
					if(response == 2){
						arrayLocation = 87;
					}
					if(response == 3){
						arrayLocation = 88;
					}
					break;
				case 86:
					if(response == 1){
						arrayLocation = 88;
					}
					if(response == 2){
						arrayLocation = 89;
					}
					break;
				case 87: arrayLocation = 89; break;
				case 88: arrayLocation = 90; break;
				case 89: arrayLocation = 91; break;
				case 90: arrayLocation = 89; break;
				case 91: 
					if(response == 1){
						if(thePlayer.getStrength() > 12){
							arrayLocation = 92;
						}else{
							arrayLocation = 91;
						}
					}
					if(response == 2){
						if(thePlayer.getDexterity() > 12){
							arrayLocation = 93;
						}else{
							arrayLocation = 91;
						}
					}
					if(response == 3){
						if(thePlayer.getIntelect() > 12){
							arrayLocation = 94;
						}else{
							arrayLocation = 91;
						}
					}
					if(response == 4){
							arrayLocation = 95;
					}
					break;
				case 92: 
				case 93:
				case 94:
					if(response == 1){
						arrayLocation = 96;
					}
					if(response == 2){
						arrayLocation = 97;
					}
					break;
				case 95:
				
				case  999:
					arrayLocation = 0;
					thePlayer.dexterity = 10;
					thePlayer.intelect = 10;
					thePlayer.morality = 20;
					thePlayer.strength = 10;
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
