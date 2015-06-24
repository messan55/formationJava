package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("taille figure ? ");
		Scanner reader = new Scanner(System.in);
		
		// saisie de la taille
		int taille = Integer.parseInt(reader.nextLine());
		for (int ligne = 0; ligne < taille; ligne++)
		{
			for(int colonne = 0; colonne < taille - ligne; colonne++) {
				// test de bord
				if (colonne == 0 || ligne == 0 || colonne == taille - ligne - 1)
					System.out.print("X");
				else
					System.out.print("O");
			}
			// passage a la ligne suivante
			System.out.println();
		}

		StringBuilder haut = new StringBuilder();
		StringBuilder bas = new StringBuilder();

		int tailleLosange = taille / 2 + 1;
		for (int ligne = 0; ligne < tailleLosange; ligne++) {
			StringBuilder bufferLigne = new StringBuilder();
			
			// dessin de la marge
			for (int colonne = 0; colonne < tailleLosange - ligne - 1; colonne++) {
				bufferLigne.append(' ');
			}
			//dessin de la ligne du losange
			for (int colonne = 0; colonne < ligne * 2 + 1; colonne++) {
				if (colonne == 0 || colonne == ligne * 2)
					bufferLigne.append('X');
				else
					bufferLigne.append('O');
			}
			if (ligne < tailleLosange - 1) {
				haut.append(bufferLigne.toString() + "\n");
			}
			bas.insert(0, bufferLigne.toString() + "\n");
		}
		
		System.out.println(haut.toString() + bas.toString());
		
		
	}

}
