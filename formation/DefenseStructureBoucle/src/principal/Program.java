package principal;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		// le reader lit depuis le clavier
		Scanner reader = new Scanner(System.in);
		System.out.println("quelle heure est il?");
		// je lit la prochaine saisie sur l'entrée standard (sous forme de chaine)
		String saisie = reader.nextLine();
		// je convertie la saisie en entier
		int heure = Integer.parseInt(saisie);
		
		if (heure < 11) {
			System.out.println("bonjour, un café?");
		}
		else if (heure < 14){
			System.out.println("bon appétit!");
		}
		else {
			System.out.println("belle journée pour java!");
		}
		
		
		System.out.println("code pays");
		saisie = reader.nextLine().toUpperCase();
		
		switch(saisie) {
			case "UK":
			case "US":
				System.out.println("anglais");
				break;
			case "BE":
				System.out.println("une fois!");
			case "FR":
				System.out.println("francais");
				break;
			case "ES":
				System.out.println("espagnol");
				break;
			default:
				System.out.println("esperanto");
		}
		
		
		int j = 1;
		while (j < 10) {
		//	int x = 1;
			j++; // -> j = j + 1 -> j += 1
			System.out.println("j = " + j);
		}
		
		
		
		System.out.println("-------------------------------");
		j = 12;
		do {
			j++;
			System.out.println("j = " + j);
		}while(j < 10);
		
		//int k;
		System.out.println("-------------------------------");
		for (int k = 0; k < 10; k++) {
			if (k ==3)
				continue;
			System.out.println("k = " + k);
			if (k == 7)
				break;
			
		}
		
		System.out.println("fini");
		
		String[] jours = {"lundi", "mardi", "mercredi", "jeudi", "vendredi" };
		
		for (String jr : jours) {
			System.out.println(jr);
		}
		
		
		int i = -3;
		int n = (i < 0)? 0 : i;
		/*int n = 0;
		if (i < 0)
			n = 0;
		else
			n = i;
		*/
		System.out.println("n = " + n);
		
		
		
	}

}
