package com.loncoto.iteratorproject.reseau;

public class IPInterval {
	
	private int[] ipStart;
	private int[] ipEnd;
	
	public void setIpStart(int a, int b, int c, int d){
		ipStart = new int[] {a, b, c, d};
	}
	
	public int[] getIpStart(){
		return ipStart.clone();
	}
	
}
