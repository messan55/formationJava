package com.loncoto.annotationprojetct.principal;

import com.loncoto.annotationprojetct.util.CommentAnnotation;

public class Program {
	
	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		Class cls = tc.getClass();
		
		CommentAnnotation ca = (CommentAnnotation) cls.getAnnotation(CommentAnnotation.class);
		System.out.println(ca);
	}

}
