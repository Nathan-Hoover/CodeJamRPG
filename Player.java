class Player {
	public int strength = 10;
	public int intelect = 10;
	public int dexterity = 10;
	public int morality = 20;
	
	public void changeStrength(int changeBy){
		strength += changeBy;
	}
	
	public void changeIntelect(int changeBy){
		intelect += changeBy;
	}
	
	public void changeDexterity(int changeBy){
		dexterity += changeBy;
	}
	
	public void changeMorality(int changeBy){
		morality += changeBy;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getIntelect(){
		return intelect;
	}
	
	public int getDexterity(){
		return dexterity;
	}
	
	public int getMorality(){
		return morality;
	}
}
