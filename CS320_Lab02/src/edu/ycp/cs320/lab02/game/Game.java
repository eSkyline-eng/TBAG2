package edu.ycp.cs320.lab02.game;

import edu.ycp.cs320.lab02.chara.Player;
import edu.ycp.cs320.lab02.rooms.Rooms;

public class Game {
    public static void main(String[] args) {
        // Create two rooms with descriptions
        Rooms room1 = new Rooms("room1", "You are in Room 1. There is a door to the north.");
        Rooms room2 = new Rooms("room2", "You are in Room 2. There is a door to the south.");

        // Define exits: room1's north leads to room2 and room2's south leads to room1
        room1.setExit("north", room2);
        room2.setExit("south", room1);

        // Create a player starting in room1
        Player player = new Player(room1);
    }
}

