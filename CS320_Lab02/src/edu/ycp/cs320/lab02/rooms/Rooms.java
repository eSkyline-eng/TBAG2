package edu.ycp.cs320.lab02.rooms;

import edu.ycp.cs320.lab02.rooms.RoomsConnections;
import java.util.HashMap;
import java.util.Map;

public class Rooms {
	private String id;
	private String description;
	private RoomsConnections roomsConnections;
	private Map<String, Rooms> exits;
	
	public Rooms(String id, String description) {
		this.id = id;
		this.description = description;
		this.exits = new HashMap<>();
	}
	
	// Set an exit in a given direction linking to a neighboring room
	public void setExit(String command, Rooms destination) {
		roomsConnections.addConnection(command, destination);
	}
	
	// Get the neighboring room in a specified direction
    public Rooms getExit(String command) {
        return roomsConnections.getConnection(command);
    }
    
    public String getDescription() {
        return description;
    }
}
