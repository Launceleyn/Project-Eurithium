import java.util.ArrayList;


public class gameData {
	private  String playerName;
	ArrayList<solid> solids = new ArrayList<solid>();
	ArrayList<surfaceType> surfaceTypes = new ArrayList<surfaceType>();
	
	
	public gameData(String name) {
		// TODO Auto-generated constructor stub
		playerName = name;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public void generateSolids()
	{
		ArrayList<solid> solidsGenerated = new ArrayList<solid>();
		
		//Add all the elements here.
		solid Granite = new solid(7, "Granite");
		solid Void = new solid(0, "Void");
		
		//Also make sure to add them to the list.
		solidsGenerated.add(Granite);
		solidsGenerated.add(Void);
		
		
		this.solids=solidsGenerated;
	}

	public void generateSurfaceTypes()
	{
		ArrayList<surfaceType> solidsGenerated = new ArrayList<surfaceType>();
		
		//Add all the elements here.
		surfaceType Sand = new surfaceType(500, "Sand");
		surfaceType Pebbles = new surfaceType(500, "Pebbles");
		surfaceType Rock = new surfaceType(500, "Rock");
		
		
		//Also make sure to add them to the list.
		solidsGenerated.add(Sand);
		solidsGenerated.add(Pebbles);
		solidsGenerated.add(Rock);
		
		
		this.surfaceTypes=solidsGenerated;
	
	}
	

}
