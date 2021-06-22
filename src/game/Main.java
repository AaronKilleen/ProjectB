package game;

import java.util.Scanner;

public class Main {

	public static RoomManager roomManager = new RoomManager();
	public static boolean willQuit = false;
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		
		Player player = new Player();
		player.currentRoom = RoomManager.startingRoom;
		printRoom(player);
		do
		{
			
			String[] input = collectInput();
			parse(input, player);
		} while (willQuit == false);
		scanner.close();
	}
		
	
	
	
	
	private static void printRoom(Player player) {
		System.out.println("The " + player.currentRoom.name + ".\n\n" + player.currentRoom.longDescription);
		System.out.println("item:" + player.currentRoom.roomFeature.printName() + "     " + player.currentRoom.roomFeature.printShortDescription() + "\n\nExits:");
		for(int i = 0; i < player.currentRoom.numExits; ++i)
		{
			System.out.println(player.currentRoom.getExits()[i].name + ": " + player.currentRoom.getExits()[i].shortDescription  + "\n");
		}
		System.out.println("type 'enter [room]' or 'item' or 'quit'\n");
	}

	
	
	private static String[] collectInput() {
		
		String temp = scanner.nextLine();
		
		if(temp.indexOf(' ') != -1)
		{
		return temp.split(" ");
		} else
		{
			String[] temp2 = {temp};
			return temp2;
		}
	}
		
	
	
	
	private static void parse(String[] command, Player player) {
		// gets first string
		switch(command[0])
		{
		// handles room switching
		case "enter":
			for(int i = 0; i < player.currentRoom.numExits; ++i)	
			{
				if(command[1].equals(player.currentRoom.getExits()[i].name))
				{
								player.currentRoom = player.currentRoom.getExits()[i];
								printRoom(player);
								return;
				}
			}
		break;
		//handles item
		case "item":
			System.out.println(player.currentRoom.roomFeature.printLongDescription() + "\n");
		break;
		case "quit":
			System.out.println("Exiting Program.");
			willQuit = true;
		break;
		default:
			System.out.println("Invalid Input");
		}	

	}
}