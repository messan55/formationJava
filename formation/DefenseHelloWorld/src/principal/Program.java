package principal;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("bonjour monde");
		System.out.println("et bon appetit");
		
		// variable numériques entieres
		int i;
		i = 42;
		System.out.println(i);
		
		// entier 32 bits signé
		int j = 15;
		System.out.println(j + i);
		
		// entier 64 bits
		long l1 = 4538;
		System.out.println(l1);
		long l2 = 123456789123L;
		System.out.println(l2);
		// conversion (cast) implicite autorisée
		l1 = j;
		// pour passer vers un type "moins précis/grand"
		// cast explicite est requis
		j = (int)l2;
		System.out.println(j);
		
		short s1 = 12534;
		System.out.println("s1 = " + s1);
		System.out.println("i+j = " + (i + j));

		i = s1;
		s1 = (short) i;
		
		
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		// type virgule flottante
		// float -> 32 bits
		float fl1 = 3.1415F;
		System.out.println("fl1 = " + fl1);
		fl1 = 3.14151617F;
		System.out.println("fl1 = " + fl1);
		fl1 = 3.151516171819202122F;
		System.out.println("fl1 = " + fl1);
		
		// double -> 64 bits
		double db1 = 3.1515;
		System.out.println("db1 = " + db1);
		db1 = 3.14151617;
		System.out.println("db1 = " + db1);
		db1 = 3.141516171819202122;
		System.out.println("db1 = " + db1);
		
		db1 = fl1;
		fl1 = (float)db1;
		
		// boolean -> true|false
		
		boolean bl1 = true;
		boolean bl2 = false;
		
		System.out.println("bl1 = " + bl1);
		System.out.println("bl1 et bl2 " + (bl1 && bl2));
		System.out.println("bl1 ou bl2 " + (bl1 || bl2));
		System.out.println("not bl1 = " + !bl1);
		
		int i4 = 3;  // 000000011
		int i5 = 15; // 000001111
		int i6 = 16; // 000010000
		
		System.out.println("i4 & i5 = " + (i4 & i5));
		System.out.println("i4 | i5 = " + (i4 | i5));
		
		// type caratcere -> char 
		
		char c1 = 'a';
		System.out.println(c1);
		c1 = 45;
		System.out.println(c1);
		
		//-------------------------------
		int[] tab1 = {5, 15};
		int[] tab2 = tab1;
		System.out.println("tab2[0] = " + tab2[0]);
		tab1[0] = 25;
		System.out.println("tab2[0] = " + tab2[0]);
			
		
	}

}
