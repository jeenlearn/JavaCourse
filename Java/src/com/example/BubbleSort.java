package com.example;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int [] numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = random.nextInt(100);
		}
		System.out.println("Before");
		printArray(numbers);
		bubbleSort(numbers);
		System.out.println("\nAfter");
		printArray(numbers);

	}
	private static void printArray(int[] numbers) {
		
		for(int i=0; i< numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
	}
	private static void bubbleSort(int[] numbers) {
		boolean swappedSomething = true;
		while(swappedSomething) {
			swappedSomething = false;
			for(int i = 0 ; i < numbers.length-1 ; i++) {
				if( numbers[i] > numbers[i+1]) {
					swappedSomething = true;
				
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
			}
		}
	}
	}
}
