package com.arrays;


public class SortArr {
	public static void main(String[] args) {
		int []arr = {12,43,2,87,23,5,13,4};
		
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");	
		}
		System.out.println("\n");
		
		int temp;
     //for(int i=arr.length-1;i>0;i--){
			//for(int j=0;j<i;j++){
		for(int i =1;i<=arr.length;i++){
			for(int j = 0;j<arr.length-1;j++){
		
			
		if(arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
		}
		}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		}
		}
	


