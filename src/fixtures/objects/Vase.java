package fixtures.objects;

import fixtures.Fixture;

public class Vase extends Fixture implements Interactive {

	public String printLongDescription() {
		return this.longDescription;
	}

	public String printShortDescription()
	{
		return this.shortDescription;
	}
	
	public String printName()
	{		
		return this.name;
	}

	public Vase()
	{
		super("Vase", "A short description of a vase", "A long description of a vase");
		
	}
}
