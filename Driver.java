
public class Driver extends RacePerson{
	static int MAX_RACES;
	static int MIN_AGE;
	static int MIN_POINTS;
	private int numRacesParticipated;
	private int points;
	public Driver(String name, int age, int ID,int points, int numRacesParticipated) {
		super(name, age, ID);
		// TODO Auto-generated constructor stub
		this.MAX_RACES=20;
		 this.MIN_AGE=20;
		 this.MIN_POINTS=5;
		 this.numRacesParticipated=numRacesParticipated;
		 this.points=points;
		calculateSkill();
		 
	}


	@Override
	public void calculateSkill() {
		this.skill=(this.points*100)/this.numRacesParticipated;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String s=((RacePerson) this).toString();
		String s1="Points : "+this.points;
		String s2="No. of races attempted : "+this.numRacesParticipated;
		return s+"\n"+s1+"\n"+s2;
	}
	public void participateInNewRace()
	{	if(this.MAX_RACES>this.numRacesParticipated)
			{this.numRacesParticipated+=1;
			 this.calculateSkill();
			}
	}
	public boolean verifyValidity()
	{
		if(this.points>=this.MIN_POINTS && this.age>=this.MIN_AGE && this.numRacesParticipated<this.MAX_RACES)
		{
			return true;
		}
		return false;
	}
}
