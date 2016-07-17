package com.exceptions;

public class NullpointEx {
	public void greet(){
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		NullpointEx np = null;
		//throws nullpointer exception
		try{
		np.greet();
		}
		catch(NullPointerException e){
			System.out.println("Hello USA");
		}
		finally{
			System.out.println("finally block");
		}

}

}
