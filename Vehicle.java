public abstract class Vehicle {
	protected int cost;
	protected int length;
	protected java.lang.String name;
	protected int numWheels;
	protected int width;
	public Vehicle(java.lang.String name, int length, int width, int cost)
	{
		this.name=name;
		this.length=length;
		this.width=width;
		this.cost=cost;
		
	}
	public abstract java.lang.String getInfo();
	public java.lang.String toString()
	{
		return this.name+" ["+this.length+"x"+this.width+"] ("+this.cost+")";
	}
	public abstract boolean verifyValidity();
	
}
