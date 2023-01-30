package com.example;

import java.util.Random;

public class QuickSort {
	
	public static void main(String[] args) {
	
		Random random = new Random();
		int [] numbers = new int[100];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = random.nextInt(100);
		}
		System.out.println("Before");
		//printArray(numbers);
		quickSort(numbers,0,numbers.length-1);
		System.out.println("\nAfter");
		//printArray(numbers);
	}
	private static void quickSort(int[] array,int lowIndex , int highIndex) {
		
		if(lowIndex >= highIndex) {
			return;
		}
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array,pivotIndex,highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		quickSort(array, lowIndex, leftPointer-1);
		quickSort(array, leftPointer+1, highIndex );
	}
	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer ++;
			}
			while(array[rightPointer] >= pivot && leftPointer <rightPointer) {
				rightPointer --;
			}
			swap(array, leftPointer, rightPointer);
		}
		// This is different from what the video has, and fixes an issue where the last value could potentially be out of order. 
	    // Thanks to viewer Wilson Barbosa for suggesting the fix!
	    if(array[leftPointer] > array[highIndex]) {
	      swap(array, leftPointer, highIndex);
	    }
	    else {
	      leftPointer = highIndex;
	    }
	    
	    return leftPointer;
		//swap(array, leftPointer, highIndex);
		//return leftPointer;
	}
	private static void swap(int[] array,int index1,int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp; 
	}
	private static void printArray(int[] numbers) {
		
		for(int i=0; i< numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
	}
}
