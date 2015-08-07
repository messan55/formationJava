package com.loncoto.annotationprojetct.principal;

import com.loncoto.annotationprojetct.util.CommentAnnotation;


@CommentAnnotation(comment="une classe de test", version=1.0)
public class TestClass {
	
	@CommentAnnotation(comment="methode test", version=1.0)
	public void testMethod(){
		
	}
}
