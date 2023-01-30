package com.example;

import java.util.Random;

public class MergeSort {

	    private static void mergeSort(int inputArray[])       //helper function that creates the sub cases for sorting
	    {
	    	
	    	int inputLength = inputArray.length;
	    	if(inputLength < 2) {
	    		return;
	    	}
	    	int midIndex = inputLength/2;
	    	int [] leftHalf = new int[midIndex];
	    	int [] rightHalf = new int[inputLength-midIndex];
	    	for(int i=0 ; i < midIndex ; i++) {
	    		leftHalf[i] = inputArray[i];
	    	}
	    	for(int i= midIndex; i<inputLength ; i++) {
	    		rightHalf[i - midIndex] = inputArray[i];
	    	}
	    	mergeSort(leftHalf);
	    	mergeSort(rightHalf);
	    	merge(inputArray,leftHalf,rightHalf);
	    	
	    }
	    private static void merge(int [] inputArray,int [] leftHalf, int []rightHalf){
	    	
	    	int leftSize = leftHalf.length;
	    	int rightSize = rightHalf.length;
	    	int i =0 ,j =0, k=0;
	    	while (i < leftSize && j < rightSize) {
	    		if(leftHalf[i] <= rightHalf[j]) {
	    			inputArray[k] = leftHalf[i];
	    			i++;
	    		}
	    		else {
	    			inputArray[k] = rightHalf[j];
	    			j++;
	    		}
	    		k++;
	    	}
	    	while(i < leftSize) {
	    		inputArray[k] = leftHalf[i];
	    		i++;
	    		k++;
	    	}
	    	while(j < rightSize) {
	    		inputArray[k] = rightHalf[j];
	    		j++;
	    		k++;
	    	}
	    	
	    }
	 
	    void display(int arr[])                 //display the array
	    {  
	        for (int i=0; i<arr.length; ++i) 
	        {
	            System.out.print(arr[i]+" ");
	            System.out.println("");
	        } 
	        
	    } 

	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int arr[] = { 10,8,20,7,9, 3, 1, 5, 13, 12 };
        
        ob.display(arr);
        System.out.println("calling the merge sort from main");
        */
		Random random = new Random();
		int [] numbers = new int[1000];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = random.nextInt(100000);
		}
		MergeSort ob = new MergeSort();
		System.out.println("Before");
        ob.mergeSort(numbers);
        System.out.println("After");
        ob.display(numbers);

	}

}
