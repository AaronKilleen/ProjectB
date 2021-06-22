package fixtures.objects;

import fixtures.Fixture;

public class Cologne extends Fixture implements Interactive {


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
	
	public Cologne()
	{
		super("Cologne", "It stings the nostrils... in a good way.", "60% of the time, it works every time.");
	}
}
