package game;

import fixtures.rooms.Room;

public class Player {

	
	Room currentRoom;
	Player(){
		
		currentRoom = RoomManager.startingRoom;
	}
	
}
