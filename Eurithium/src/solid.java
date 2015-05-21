/*Odell Dotson - 2015
 * 
 * Solids are the element or compound that a surface or rock is made from.
 * 
 * Solids contain specific information about the different elements.
 * 
 * Things such as granite surface have different properties than a granite rock.
 * This is basically where we store element information.
 * 
 */
public class solid {

	private int density;
	private String name;

	public solid(int solidWeight, String solidName) {
		density = solidWeight;//A solid's weight, per cubic meter.
		name = solidName;
		//Coefficient of friction?
		//Hardness?
	}
	
	public int getWeight()
	{
		return this.density;
	}

	public String getName()
	{
		return this.name;
	}
}