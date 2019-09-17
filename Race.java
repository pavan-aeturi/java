
public class Race extends java.lang.Object
{
	static int MAX_TEAMS=10;
	private int numTeams;
	private java.lang.String raceType;
	private Team[] teams;
	public Race(java.lang.String raceType)
	{
		this.MAX_TEAMS=10;
		this.numTeams=0;
		this.raceType=raceType;
		this.teams=new Team[Race.MAX_TEAMS];
		
	}
	public boolean addTeam(Team team)
	{
		if(this.MAX_TEAMS>this.numTeams)
			if(team.verifyValidity(this.raceType))
			{	this.teams[this.numTeams]=team;
				this.numTeams+=1;
				return true;
			}
		return false;
	}
	public Team findWinner()
	{
		Team t=this.teams[0];
		int k=0;
		for(int i=0;i<Race.MAX_TEAMS;i++)
		{
			if((this.teams[i].getTeamSkill())>k)
			{
				k=this.teams[i].getTeamSkill();
				t=this.teams[i];
			}
		}
		return t;
	}
}


