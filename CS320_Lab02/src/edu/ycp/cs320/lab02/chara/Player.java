package edu.ycp.cs320.lab02.chara;

import edu.ycp.cs320.lab02.rooms.Rooms;

public class Player {
	private Rooms currentRoom;

    public Player(Rooms startingRoom) {
        this.currentRoom = startingRoom;
    }

    public Rooms getCurrentRoom() {
        return currentRoom;
    }

    // Move the player in the given direction if an exit exists
    public void move(String direction) {
        Rooms nextRoom = currentRoom.getExit(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You move " + direction + ".");
        } else {
            System.out.println("You can't go that way!");
        }
    }

}
