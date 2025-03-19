package rooms;
import java.util.HashMap;
import java.util.Map;

public class RoomsConnections {
	private Map<String, Rooms> connections;
	
	public RoomsConnections() {
		connections = new HashMap<>();
	}
	
	public void addConnection(String command, Rooms destination) {
		connections.put(command, destination);
	}
	
	public Rooms getConnection(String command) {
		return connections.get(command);
	}
}
