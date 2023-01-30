package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> myList =  new ArrayList<>();
		for(int i =0 ;i <100 ; i++)
			myList.add(i);
		Stream<Integer> sequentialStream = myList.stream();
		Stream<Integer> parallelStream = myList.parallelStream();
		sequentialStream.filter(p -> p>90).forEachOrdered(p->System.out.println("sequential stream :"+p));
		parallelStream.filter(p->p>90).forEach(p->System.out.println("parallel stream :"+p));
	}

}
