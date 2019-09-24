public class FourWheeler extends Vehicle
{
	
	static int FOUR_WHEELER_MAX_COST;
	static int FOUR_WHEELER_MAX_LENGTH;
	static int FOUR_WHEELER_MAX_WIDTH;
	
	public FourWheeler(String name, int length, int width, int cost) {
		super(name, length, width, cost);
		this.FOUR_WHEELER_MAX_COST=45;
		this.FOUR_WHEELER_MAX_LENGTH=20;
		this.FOUR_WHEELER_MAX_WIDTH=10;
		this.numWheels=4;
		// TODO Auto-generated constructor stub
	}
	public String getInfo() {
		// TODO Auto-generated method stub
		String s=((Vehicle) this).toString();
		String s1="Wheels : "+((Vehicle)this).numWheels;
		
		return s+"\n"+s1;
	}
	
	public boolean verifyValidity() {
		if(this.cost<=this.FOUR_WHEELER_MAX_COST && this.length<=this.FOUR_WHEELER_MAX_LENGTH && this.width<=this.FOUR_WHEELER_MAX_WIDTH)
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
}
