package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("nombre de notes a saisir?");
		int nbNotes = Integer.parseInt(reader.nextLine());
		
		double[] notes = new double[nbNotes];
		
		double total = 0.0;
		double min = 21.0;
		double max = -1.0;
		
		for (int i = 0; i < notes.length; i++) {
			
			System.out.println("note no " + (i+1) + " ?");
			double note = Double.parseDouble(reader.nextLine());
			
			notes[i] = note;
			min = (note < min)? note : min;
			max = (note > max)? note : max;
			total += note;
		}
		double moyenne = total / notes.length;
		
		int nbNoteSup = 0;
		for (double note : notes) {
			if (note > moyenne)
				nbNoteSup++;
		}
		System.out.println(Arrays.toString(notes));
		System.out.println("minimum = " + min);
		System.out.println("maximum = " + max);
		System.out.println("moyenne = " + moyenne);
		System.out.println("nombre de notes supérieur a la moyenne = " + nbNoteSup);
		
		
		

	}

}
