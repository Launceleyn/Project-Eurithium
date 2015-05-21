/*Odell Dotson - 2015 - Project Eurithium - 
 * 
 * Each "surface" object is the type of surface that is on the ground at this specific location.
 * A surface could be something such as sandy regolith, types of stone, frozen water, etc.
 * These surfaces are the type that are gathered from, and that are not quickly/at all depleted?
 * 
 * Perhaps also movement speed modifiers, or require a certain level of power to traverse properly?
 * 
 *Colors??!!?
 */
public class surface{
	
	private final solid surfaceElmt;
	private final surfaceType composition;//The composition of the surface. Has to do with gathering.
	
	//Constructor for a surface.
	public surface(solid surfaceSolid, surfaceType surfaceComposition) {
		//int colorValue //For coloring of the ground.
		surfaceElmt = surfaceSolid;
		composition = surfaceComposition;
	}
	
	//Returns the type of solid that a surface is made from.
	public solid getElmt()
	{
		return this.surfaceElmt;
	}

	public surfaceType getComp() {
		return composition;
	}	
}