package com.aaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(4);
		l.add(50);
		l.add(37);
		l.add(4);
		System.out.println(l);
		
		Set<Integer> s = new HashSet<>();
		s.add(4);
		s.add(50);
		s.add(37);
		s.add(4);
		System.out.println(s);
		
		Map<Integer, String> m = new HashMap<>();
		m.put(01, "Hello!");
		System.out.println(m.get(01));
	}

}
