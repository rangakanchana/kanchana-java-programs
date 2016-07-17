package com.arrays;

public class SwapArrEle {
	public static void main(String[] args) {
		int []arr = {1,2,5,6,4};
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+ " "); 
		}
		System.out.println("\n");
		int src = 2;     //2nd index
		int des = 4;      //4 th index, we have to swap these elements
		int temp = arr[src];    //arr[2]=5;
		arr[src]=arr[des];    //arr[2]=4;
		arr[des]=temp;    //arr[4]=5;
		for(int i=0;i<arr.length;i++){
			System.out.print( arr[i]+" ");
		}
		}
	}
 