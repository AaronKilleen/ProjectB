package game;

import fixtures.rooms.Foyer;
import fixtures.rooms.Room;
import fixtures.rooms.Study;

public class RoomManager {
	public static Room startingRoom;
	public static Room[] rooms = new Room[2];

	RoomManager()
	{
		Foyer foyer =  new Foyer();
		Study study = new Study();
		Room[] foyerExits = {study};
		Room[] studyExits = {foyer};
		foyer.setExits(foyerExits);
		study.setExits(studyExits);
		rooms[0] = foyer;
		rooms[1] = study;
		startingRoom = foyer;
	}
	

	
}
