package com.loncoto.iteratorproject.principal;

import com.loncoto.iteratorproject.reseau.IPInterval;

public class Program {
	
	public static void main(String[] args) {
		IPInterval ipi1 = new IPInterval(100, 100, 100, 50, 100, 100, 110, 25);
		
		System.out.println("100.100.100.40 dedans? " + ipi1.isInInterval(100, 100, 100, 50));
	}

}
