package com.freq;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i=0; i<21; i++) {
			l.add(0);
		}
		for(int i=0; i<1000; i++) {
			int r = rand.nextInt(21);
			Integer freq = l.get(r);
			l.set(r, freq+1);
		}System.out.println(l);
	}
}
