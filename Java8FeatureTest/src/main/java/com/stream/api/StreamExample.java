package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExample {

	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<30;i++) {
			al.add(i*5);
		}
		al.forEach(e->{
			System.out.print(e+"\t");
		});
		
		List<Integer> l=(ArrayList<Integer>) al.stream().filter(e->e%2==0).
				map(e->e+100)
				.collect(Collectors.toList());
		System.out.println();
		l.forEach(e->{
			System.out.print(e+"\t");
		});
		
	}
}
