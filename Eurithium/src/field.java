
public class field {
	surface ground;
	rock resource;
	factory machine;
	
	public field(surface SurfaceOfField, rock EntityOfField, factory FactoryOfField) {
		ground = SurfaceOfField;
		resource = EntityOfField;
		machine = FactoryOfField;
	}
	
	public char getVis()
	{
		if (this.resource.getWeight() != 0)//If there is a rock here
		{
			return this.resource.getVis();
		}
		
		//If there is just the ground here
		else
			return this.ground.getVis();
		
	}
	
}
