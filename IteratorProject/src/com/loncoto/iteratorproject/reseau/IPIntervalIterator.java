package com.loncoto.iteratorproject.reseau;

import java.util.Iterator;

public class IPIntervalIterator implements Iterator<Integer[]> {
	
	private IPInterval interval;
	private int[] current;
	
	public IPIntervalIterator(IPInterval interval) {
		this.interval = interval;
		current = interval.getIpStart();
	}

	@Override
	public boolean hasNext() {
		return interval.isInInterval(current[0], current[1], current[2], current[3]);
	}

	@Override
	public Integer[] next() {
		long cur= ((long)current[0] << 24) + (current[1] << 16) + (current[1] << 8) + current[3];
		cur++;
		Integer[] curip = { current[0], current[1], current[2], current[3] }; 
		current[0] = (int)(cur >> 24) & 255;
		current[1] = (int)(cur >> 16) & 255;
		current[2] = (int)(cur >> 8) & 255;
		current[3] = (int)(cur & 255);
		return curip;
	}

}
