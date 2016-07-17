package com.main;


public class Factorial {
	/*//without recursive method
public int Fact(int num){
	int result = 1;
	for(int i = num;i>1;i--){
		result = result * i;
	}
	return result;
}
public static void main(String[] args) {
	Factorial fact = new Factorial();
	int f = fact.Fact(5);
	System.out.println("the factorial of a  given number is :"+ f);
}	
}*/
//with recursive method
public int Fact(int num){
	if(num==1){
		return 1;
		}
	else{
		return (num*Fact(num-1));
		}
}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		int fact = f.Fact(5);
		System.out.println("the factorial of the given number is "+ fact);
	}
}


