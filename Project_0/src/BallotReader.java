 
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class BallotReader
{
	 
	public static Ballot readBallot(String filename)
	throws IOException
	{
		// ***Replace this with the correct implementation; for now, it's
		//    always returning a hard-coded ballot with three candidates.
		FileReader file = new FileReader(filename);
		Scanner sc = new Scanner(file);
		
		String officeName = sc.nextLine();
		Ballot ballot = new Ballot(officeName);
		sc.nextLine();
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] split = line.split(";");
			ballot.addCandidate(new Candidate(split[0], split[1]));
		}
		sc.close();
		
		return ballot;
	}
}

 