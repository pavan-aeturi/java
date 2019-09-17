
public class TwoWheeler extends Vehicle {
	
	

	static int TWO_WHEELER_MAX_COST;
	static int TWO_WHEELER_MAX_LENGTH;
	static int TWO_WHEELER_MAX_WIDTH;
	
	public TwoWheeler(String name, int length, int width, int cost) {
		super(name, length, width, cost);
		this.TWO_WHEELER_MAX_COST=15;
		this.TWO_WHEELER_MAX_LENGTH=10;
		this.TWO_WHEELER_MAX_WIDTH=3;
		this.numWheels=2;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String s=((Vehicle) this).toString();
		String s1="Wheels : "+((Vehicle)this).numWheels;
		
		return s+"\n"+s1;
	}

	@Override
	public boolean verifyValidity() {
		if(this.cost<=this.TWO_WHEELER_MAX_COST && this.length<=this.TWO_WHEELER_MAX_LENGTH && this.width<=TWO_WHEELER_MAX_WIDTH)
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
