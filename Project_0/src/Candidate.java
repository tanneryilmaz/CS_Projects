 
public class Candidate implements Comparable<Candidate>
{
	private final String NAME;
	private String affiliation;
	private int voteCount;
	 
	public Candidate(String name, String affiliation)
	{
		this.NAME = name;
		this.affiliation = affiliation;
	}

	public String getName()
	{
		return NAME;
	}

	public String getAffiliation()
	{
		 return affiliation;
	}

	public int getVoteCount()
	{
		return voteCount;
	}
 
	public void tallyVote()
	{
		voteCount += 1;
	}
	
	@Override
	public int compareTo(Candidate c) {
		if(this.voteCount < c.voteCount) {
			return -1;
		}
		else if(this.voteCount > c.voteCount) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString()
	{
		return NAME + " - " + affiliation;
	}
}
