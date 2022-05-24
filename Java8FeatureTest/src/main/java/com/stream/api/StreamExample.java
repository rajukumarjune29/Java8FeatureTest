package com.stream.api;

import java.util.ArrayList;


public class StreamExample {

	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<30;i++) {
			al.add(i*5);
		}
		al.forEach(e->{
			System.out.print(e+"\t");
		});
	}
}
