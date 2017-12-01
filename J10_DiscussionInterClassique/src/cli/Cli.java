package cli;

import beans.Commercial;
import beans.Genre;
import beans.Permanent;
import beans.Temporaire;

public class Cli {

	public static void main(String[] args) {
		Permanent p=new Permanent("Anne", "de BRETAGNE", Genre.Feminin, 2000);
		System.out.println(p);
		Temporaire t=new Temporaire("Louis", "XIV", Genre.Masculin, 9.7F, 140);
		System.out.println(t);
		Commercial c=new Commercial("Napoléon", "III", Genre.Masculin, 200, 100000, 0.02F);
		System.out.println(c);
	}

}
