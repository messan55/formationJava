package principal;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		int[] tab1; // variable pointant vers un tableau d'entier
		tab1 = new int[5]; // allocation d'un tableau de 5 entier
		
		tab1[0] = 15;
		tab1[1] = 25;
		tab1[2] = 35;
		tab1[3] = 5;
		tab1[4] = 65;
		
		System.out.println(tab1[3]);
		System.out.println("-------------------");
		for (int n : tab1)
			System.out.println(n);
		
		//tab1[6] = 2;

		// tab2 est alloué avec 8 case (ici a la valeur par defaut de int, 0)
		int[] tab2 = new int[8];
		// equivalent a un new new in[6] plus les affectations
		int[] tab3 = {1, 3, 5, 7, 11, 13};
		
		// tri croissant de tab1
		Arrays.sort(tab1);
		
		System.out.println("-------------------");
		for (int n : tab1)
			System.out.println(n);
		
		
		int[] tab4 = tab1;
		tab4[0] = 125;

		System.out.println("-------------------");
		for (int n : tab1)
			System.out.println(n);
		
		System.out.println("taille tableau = " + tab1.length);

		double[] ligne1 = {1.1, 3.2 };
		
		double[][] matrice1 ={	/*ligne1 */ {1.5, 2.5, 3.5},
								{2.6, -3.1, 2.9},
								{1.3, 2.2}};
	
		System.out.println("matrice1[1][2] -> " + matrice1[1][2]);
		
		// alloue le tableau et toutes les lignes
		double[][] matrice2 = new double[3][4];
		// alloue le tableau des lignes, mais pas les colonnes
		double[][] matrice3 = new double[3][];
		matrice3[0] = new double[4];
		matrice3[1] = new double[]{1.1, 2.2, 3.3};
		
		String[][] tabstr = {{"un", "deux"}, {"trois", "quatre"}};
		String[][] tabstr2 = tabstr;
		
		// attention, copyof n'est PAS récursif, ce n'est pas une copie
		// en profondeur
		// les lignes ne sont pas copiée, tabstr3 référence les mêmes lignes
		// que tabStr2
		String[][] tabstr3 = Arrays.copyOf(tabstr, 2);
		
		
		System.out.println(tabstr2[0][0]);
		tabstr3[0][0] = "toto";
		System.out.println(tabstr2[0][0]);
		
		
	}

}
