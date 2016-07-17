package com.arrays;


public class LargestNo {
	public static void main(String[] args) {
		
		int []arr = {23,78,102,43,65,75};
		int num = arr[0];  //to find largest array
		int num1 = arr[0];  //to find smallest array
for(int i =1;i<arr.length;i++){
	if(num<arr[i]){
		num = arr[i];
}else if (num1>arr[i]){
	 num1=arr[i];
}
}
System.out.println("the largest no in given array is "+num);
System.out.println("the smallest no in given array is "+num1);

	}
	}


