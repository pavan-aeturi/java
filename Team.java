public class Team {
	private CrewMember crewMember;
	private Driver driver;
	private int teamSkill;
	private Vehicle vehicle;
	public Team(Driver driver, CrewMember crewMember, TwoWheeler twoWheeler)
	{
		this.crewMember=crewMember;
		this.driver=driver;
		this.vehicle=twoWheeler;
	}
	public Team(Driver driver, CrewMember crewMember, FourWheeler fourWheeler)
	{
		this.crewMember=crewMember;
		this.driver=driver;
		this.vehicle=fourWheeler;
		calculateTeamSkill();
	}
	public Driver getDriver()
	{
		return this.driver;
	}
	public int getTeamSkill()
	{
		return this.teamSkill;
	}
	public boolean verifyValidity(java.lang.String raceType)
	{   String s;
		if((raceType.equals("TwoWheeler") && this.vehicle.numWheels==2) || (raceType.equals("FourWheeler") && this.vehicle.numWheels==4))
		{   if(this.vehicle.numWheels==2)
				s="TwoWheeler";
			else
				s="FourWheeler";
			if(raceType.equals(s))
				if(this.driver.verifyValidity())
					if(this.crewMember.verifyValidity())
						if(this.vehicle.verifyValidity())
							return true;
			return false;
		}
		return false;
	}
	public void calculateTeamSkill()
	{
		this.teamSkill=5*(this.driver.getSkill()) + (2*this.crewMember.getSkill());
	}


}
