package com.stream.api;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
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
		System.out.println();
		IntSummaryStatistics sum=al.stream().collect(Collectors.summarizingInt(e->e));
		System.out.println(sum.getMax());
		System.out.println(sum.getAverage());
		System.out.println(sum.getMin());
		System.out.println(sum.getSum());
		System.out.println(sum.getCount());
		
		System.out.println(al.stream().collect(Collectors.groupingBy(e->e)));
	}
}
