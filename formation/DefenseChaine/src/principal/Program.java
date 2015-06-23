package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String str1 = "bonjour monde";
		System.out.println(str1);
		
		String str2 = "abcd";
		System.out.println("longueur str2: " + str2.length());
		System.out.println("caractere n 3 " + str2.charAt(3));
		System.out.println("caractere n 0 " + str2.charAt(0));
		
		String str3 = new String("toto"); // str3 = "toto"
		System.out.println(str3);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(2, 5));

		String str4 = str1 + ", " + str3;
		System.out.println(str4);
		
		
		int i = 5;
		int j = 5;
		System.out.println("i == j -> " + (i == j));
		int k = j;
		System.out.println("i == k -> " + (i == k));
		
		
		String strA = "lundi";
		String strB = "lundi";
		String strC = "mardi";
		System.out.println("strA == strB -> " + (strA == strB));
		System.out.println("strA == strC -> " + (strA == strC));
		
		String strD = "lun";
		strD = strD + "di";
		System.out.println("strD = " + strD);
		System.out.println("strA == strD -> " + (strA == strD));
		System.out.println("strA equals strD -> " + (strA.equals(strD)));
		
		Object o1 = new Object();
		Object o2 = o1;
		System.out.println("o1 == o2 -> " + (o1 == o2));
		Object o3 = new Object();
		System.out.println("o1 == o3 -> " + (o1 == o3));
			
		//-------------------------------------
		strD = strA;
		
		strA = strA + "o";
		System.out.println(strD);

		
		Scanner reader = new Scanner(System.in);
		reader.nextLine(); // attendre entree
		String buffer = "to";
		for (int n=0; n< 100000; n++ ) {
			if (n % 10000 == 0)
			{
				System.out.println("iteration " + n);
			}
			buffer += "to";
		}
		System.out.println("-------fini-------------");
			
		reader.nextLine();
		StringBuilder sb = new StringBuilder("to");
		for (int n=0; n< 100000; n++ ) {
			if (n % 10000 == 0)
			{
				System.out.println("iteration " + n);
			}
			sb.append("to");
		}
		buffer = sb.toString();
		System.out.println("-------fini-------------");
		
		
		
		
	}

}
