/*Odell Dotson - 2015
 * 
 * !! DEPRICIATED CLASS
 * 
 * 
 */
public class rock {
	private solid rockElmt;
	private int volume;
	private char visual;

	public rock(solid rockElement, int rockVolume, char rockVis) {
		// TODO Auto-generated constructor stub
		rockElmt = rockElement;
		volume = rockVolume;
		visual = rockVis;
	}

	//Returns the weight of a rock.
	public int getWeight()
	{
		//Returns the weight of the rock in kilograms, by multiplying the volume in cubic meters by the kg per cubic meter.
		return volume * rockElmt.getWeight();
	}
	
	//Returns the volume of a rock.
	public int getVolume()
	{
		return volume;
	}
	
	public char getVis()
	{
		return visual;
	}
	
	/*
	 * We may need this function for returning "stat" objects
	 * Please ask Odell before you delete this.
	public ??? getRockStats()
	{

	}
	*/
}
