package data;

public enum Position {

	GK("Goalkeeper"), 
	SW("Sweeper"), 
	LB("Left-back"), 
	CB("Centre-back "), 
	RB("Right-back"), 
	LWB("Left wing-back"),
	RWB("Right wing-back"), 
	DM("Defensive midfielder"), 
	LM("Left midfielder"), 
	CM("Centre midfielder"), 
	RM("Right midfielder"), 
	AM("Attacking midfielder"), 
	LW("Left wing"), 
	SS("Second striker"), 
	RW("Right wing"), 
	CF("Centre forward");
	
	private String description;

	public String getDescription() {
		return description;
	}
	
	private Position(String description){
		
		this.description=description;
	}
	
	@Override
	public String toString(){
		
		return description;
	}
	
}
