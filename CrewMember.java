

public class CrewMember extends RacePerson
{
	private int experience;
	static int MIN_AGE;
	static int MIN_EXPERIENCE; 
	
	public CrewMember(String name, int age, int ID) {
		super(name, age, ID);
		this.experience=experience;
		this.MIN_AGE=20;
		this.MIN_EXPERIENCE=2;
		calculateSkill();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verifyValidity() {
		if(this.age>=this.MIN_AGE && this.experience>=this.MIN_EXPERIENCE)
			return true;
		else
			return false;
	
	}

	@Override
	public void calculateSkill() {
		// TODO Auto-generated method stub
		this.skill= ((this.experience*100)/this.age);
	}

	@Override
	public String getInfo() {
		String s1=((RacePerson)this).getInfo();
		String s2="Experience : "+this.experience;
		
		return s1+"\n"+s2;
		
	}
	
}