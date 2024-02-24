package tp1_sem2;

import java.util.Comparator;

public class CompareMat implements Comparator<Etudiant> {
	

	public int compare(Etudiant e1, Etudiant e2)
	{
		if (e1.getMatricule()==e2.getMatricule())
			return 0;
		else 
		{
			if(e1.getMatricule()> e2.getMatricule())
				return 1;
			else 
				return -1;
		}
	}

	
}
