 
import java.util.Collections;
import java.util.ArrayList;


public class Ballot
{	
	private String officeName;
	private ArrayList<Candidate> candidates = new ArrayList<Candidate>(0);
	private Candidate winner;
 
	public Ballot(String officeName)
	{
		this.officeName = officeName;
	}

	public String getOfficeName()
	{
		return officeName;
	}
	
	public void addCandidate(Candidate c)
	{
		candidates.add(c);
	}

	public ArrayList<Candidate> getCandidates()
	{
		return candidates;
	}
	
	public Candidate determineWinner() {
		Collections.sort(candidates);
		return candidates.get(candidates.size() - 1);
	}
	
	public boolean isTie() {
		Collections.sort(candidates);
		
		Candidate firstCandidate = candidates.get(candidates.size() - 1);
		Candidate secondCandidate = candidates.get(candidates.size() - 2);
		
		if(firstCandidate.compareTo(secondCandidate) == 0){
			return true;
		}
		else {
			return false;
		}
	}
}
