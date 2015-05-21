/*Odell Dotson - 2015
 * 
 * Rock objects can be broken down into pieces that can then be harvested, or something.
 * I don't know. Ask Richard.
 * 
 * Rock objects are of a specific solid type, but are also of a specific volume. The weight of the rock is then calculated based on the solid's weight and the rock volume.
 * 
 * Maybe the rover has a limit both in terms of weight and volume?
 * Ask Richard.
 * 
 * 
 */
public class rock {
	private solid rockElmt;
	private int volume;

	public rock(solid rockElement, int rockVolume) {
		// TODO Auto-generated constructor stub
		rockElmt = rockElement;
		volume = rockVolume;
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
	
	
	/*
	 * We may need this function for returning "stat" objects
	 * Please ask Odell before you delete this.
	public ??? getRockStats()
	{

	}
	*/
}
