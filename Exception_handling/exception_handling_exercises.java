/*
//q1 -division by zero

import java.util.Scanner;

class Quotient{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int result=0;
	
		System.out.println("enter 1st no");
		int num1 = sc.nextInt();
		System.out.println("enter 2nd no");
		int num2 = sc.nextInt();
		try{
			result = num1/num2;
			System.out.println(num1+"/"+num2+" "+result);
		}
		catch (ArithmeticException e){
			System.out.println("num2 can not be zero : division by zero error");
		}
		
	}
	
}
*/
/*
//q2 -Handling exception with a if
import java.util.Scanner;

class QuotientwithIf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int result=0;
	
		System.out.println("enter 1st no");
		int num1 = sc.nextInt();
		System.out.println("enter 2nd no");
		int num2 = sc.nextInt();
		if (num2 !=0){
			result = num1/num2;
			System.out.println(num1+"/"+num2+" "+result);
		}
		else{
			System.out.println("division by zero error");
		}	
	}
}
*/
/*
//q3 -An erroneous situation and a method

import java.util.Scanner; 

class QuotientWithMethod { 
  public static int quotient(int number1, int number2) {
    if (number2 == 0)
      throw new ArithmeticException("Divisor cannot be zero");

    return number1 / number2;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    try {
      int result = quotient(number1, number2);
      System.out.println(number1 + " / " + number2 + " is " 
        + result);
    }
    catch (Exception ex) {
      System.out.println("Exception: an integer " + 
        "cannot be divided by zero ");
    }

    System.out.println("Execution continues ...");
  }
}
*/
/*
//q4 - handling input mismatches

import java.util.Scanner;
import java.util.InputMismatchException;

class DemoInputMismatchEx{

	public static void main(String args[]){
		int num;
		boolean cond=true;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter a number");
		
			try{
				num = sc.nextInt();
				System.out.println("You enterd an int");
				cond=false;
			}
			catch(InputMismatchException e){
				System.out.println("what u entered is "+sc.nextLine()+" it is not an integer");
			}
		}
		while(cond);
		
	}
}
*/

//q5 -Example: Declaring, Throwing, and Catching Exceptions
/*
import java.util.Scanner;
import java.util.InputMismatchException;

class circleWithException{
	
	private double radius;
	private static int numberOfObjects = 0;
	
	public 	circleWithException(){
		this(1.0);
	}
	public circleWithException(double newRadius){
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double newRadius) throws IllegalArgumentException{
		if (newRadius >=0){
			radius = newRadius;
		}
		else{
			throw new IllegalArgumentException("Radius cannot be negative");
		}
	}
			
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
			
	public double findArea(){
		return radius*radius*3.14159;
	}	
}


class TestCircle{

	public static void main(String args[]){

		
		circleWithException c [] = new circleWithException[4];
		try{
			c[0] = new circleWithException(5);
			}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
		try{
			c[1] = new circleWithException(-5);
		}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
		try{
			c[2] = new circleWithException(0);
		}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
		try{
			c[3] = new circleWithException();
		}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
			
			for (circleWithException i: c ){
				try{
					System.out.println(i+"-> radius: "+i.getRadius()+"| area: "+i.findArea() );
				}
				catch(NullPointerException e){
					System.out.println("caught: "+e);
					System.out.println("MOVING TO THE NEXT OBJECT");
				}	
			}
		
		
		System.out.println("Number of objects created: "+circleWithException.getNumberOfObjects() );
			
			
		

	}
}

*/
/*
//q6 - custome exception - invalid radius demo

class InvalidRadiusException extends ArithmeticException{
	
	InvalidRadiusException(double radius){
		super("invalid radius"+ radius);
		
	}
}

class testInvalidRadiusException{
	
	public static void main (String args[]) {
		double age= -9.0;
		
		if (age>=0.0){
			System.out.println("valid age");
		}
		else
			throw new InvalidRadiusException(age);
	}
}
*/
/*

import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;

class test{
	
	void readfile() throws IOException, FileNotFoundException{
		//try{
			BufferedReader rd = null;
			rd = new BufferedReader( new FileReader("dul.txt"));
			
			String content;
			try{
				while( (content = rd.readLine() )!= null){
					
					System.out.println(content);
				}
			}
			finally{
				if (rd != null){
					rd.close();
				}
			}
		//}
		//catch(IOException e){
		//	System.out.println("caught the exception right away.");
		//}
	}
	
	public static void main(String args[]){

		test t1 = new test();
		try{
			t1.readfile();
		}
		catch(FileNotFoundException e){
			System.out.println("caught the FileNotFoundexception right away.");
		}
		catch(IOException e){
			System.out.println("caught the IOexception right away.");
		}
		*/
		
		
//q7 -incorrect statements -a,b,c,d,e
//q8 -correct statements -b,d,e
//q9 - correct -a,b,c,
//10 -a
//11 - c
//12 -a 
//13 -d
//14 -c
//15 - world
/*
//16 - B		
class exception1{
	public static void main (String args[]){
		try{
		
			int a,b;
			b=0;
			a=5/b;
			System.out.println("A");
		}
		catch(ArithmeticException e){
			System.out.println("B");
		}
	}
}
*/
//17 -BC
/*
//18 -compilation error
class exception1{
	public static void main (String args[]){
		try{
		
			int i,sum;
			sum=10;
			for (i=-1; i<3; i++)
				sum=(sum/i);
		}
		catch(ArithmeticException e){
			System.out.println("0");
		}
		System.out.println(sum);
	}
}
*/
//19-> -10 {in 1st iteration -1 is printed in 2nd iteration 0 is printed}

//assertion ex
//1 -
//2

/*
//3  - compilation error because void return can not be used with assert
class Test 
{
    public static int y;
    public static void foo(int x) 
    {
        System.out.print("foo ");
        y = x;
      
    }
    public static int bar(int z) 
    {
        System.out.print("bar ");
        return y = z;
    }
    public static void main(String [] args ) 
    {
        int t = 1;
        assert t > 0 : bar(7);
        assert t > 1 : foo(8); //line 18
        System.out.println("done ");
    }
}
*/
/*
//4  -	 AssertionError exception is thrown
class Test 
{  
    public static void main(String[] args) 
    {
        int x = 0;  
        assert (x > 0) : "assertion failed"; // Line 6 
        System.out.println("finished"); 
    } 
}
*/
//5 -
class Test2 
{
    public static int x;
    public static int foo(int y) 
    {
        return y * 2;
    }
    public static void main(String [] args) 
    {
    	String n ="ok";
        int z = 5;
        assert z > 0; // Line 11 
        assert z > 2: foo(z); // Line 12
        if ( z < 7 )
            assert z > 4; //Line 14

        switch (z) 
        {
            case 5: System.out.println("5 ");
            case 4: System.out.println("4 ");
            default: assert z < 10:"default was run"+n;
        }

        if ( z < 10 )
            assert z > 4: z++; /* Line 22 */
        System.out.println(z);
    }
}

















