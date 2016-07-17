package com.oops;

public class MethodOverLoadEx {
	
	public void  add(int a,int b){
		System.out.println(a+b);
	}
	public void add(int a,int b,int c){
System.out.println(a+b+c);	
}
	public void add(double a,double b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
   MethodOverLoadEx obj = new MethodOverLoadEx();
   obj.add(1, 3);
   obj.add(1.2, 2.2);
   obj.add(2, 4, 5);
		
		
		
		
	}
	

}
