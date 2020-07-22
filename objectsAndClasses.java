/*class objectsAndClasses{
	
}
*/
/*
import java.util.Scanner;

class factorial{
	static long calcFacto(int n){
		if (n<2){
			return 1;
		}
		return n*calcFacto(n-1);
	}
}


class testFacto{
	public static void main(String args[]){
			int num;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			num = input.nextInt();
			long factorialValue = factorial.calcFacto(num);
			System.out.println("Factorial value of "+num+" = "+factorialValue);
	}
}
*/

import java.util.Scanner;
/*
class Fibanaci{
	static int countFibanaci(int n){

			int fibNum =0;
			if (n == 1){
				fibNum =1;
				return fibNum;
			}
			else if (n == 2){
				fibNum = 1;
				return fibNum;
			}
			fibNum = countFibanaci(n-1)+countFibanaci(n-2);
			return (fibNum);
			
		}
}


class FibPrint{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Insert the  number of numbers required");
		int number = input.nextInt();

		System.out.println(Fibanaci.countFibanaci(number));
	}
}
/*

/*
class FibonacciExample2{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
} 
*/ 		
	

//fibanaci without recursion	
/*
class Fibonaci{
	public static void main(String args[]){
	
		int count=10, num1 =0, num2 =1, num3 =0;

		System.out.println(num1+" \n"+num2);
		for (int i=2; i<count; i++){
			num3 =num1+num2;
			num1=num2;
			num2 =num3;
			System.out.println(num3);
		}
	}
} 	
*/
