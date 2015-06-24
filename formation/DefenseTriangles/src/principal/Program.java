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
		
		
		
		
		
		
		
		
	}

}
