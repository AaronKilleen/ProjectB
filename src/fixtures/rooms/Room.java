package fixtures.rooms;

import fixtures.Fixture;
import fixtures.objects.Interactive;

public class Room extends Fixture{

	Room[] Exits;
	public Interactive roomFeature;;
	public int numExits;
	public Room(String name, String shortDescription, String longDescription, int numExits, Interactive roomFeature) {
		super(name, shortDescription, longDescription);
		this.numExits = numExits;
		this.Exits = new Room[numExits]; 
		this.roomFeature = roomFeature;
	}

	public Room[] getExits() {
		return Exits;
	}
		
	public Room getExit(int choice) {
		return Exits[choice];
	}
	
	public void setExits(Room[] exits)
	{
		this.Exits = exits;
	}

	
	
}
