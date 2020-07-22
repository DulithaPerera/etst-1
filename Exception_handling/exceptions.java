/*
import java.util.Scanner;

class Circle{

	public void setRadius(double newR) throws IllegalArgumentException{
	
		if (newR>=0){
			double radius = newR;
			System.out.println("new radius: "+radius);
		}
		else{
			throw new IllegalArgumentException("Radius can not be negative");
		}
	}


	public static void main(String args[]){
		
		Circle myCircle = new Circle();
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius");
			
			double radius;
			radius = sc.nextDouble();
			myCircle.setRadius(radius);
		}
		catch(IllegalArgumentException e){
			//System.out.println("the radius can not be negative u fool");	
		}
		
	}
}
*/
/*
class TestTryCatch{
	public static void main(String args[]){
		int data=0;
		try{
			data =50/0;
		}
		catch(ArithmeticException e){ System.out.println(e);}
		System.out.println(data);
	}
}
*/
/*
class MultipleTryCatch{

	public static void main(String args[]){
	
		try{
			int a[] =new int[5];
			a[5] = 30/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		catch(Exception e){
			System.out.println("common task completed");
		}
		
		System.out.println("Rest of the code");
	}
}    
 */
 
 class NestedTryCatch{
 
 	public static void main(String args[]){
 	
 		try{
 			try{
 				System.out.println("going to divide");
 				int b= 39/0;
 			}
 			catch(ArithmeticException e){
 				System.out.println(e);
 			}
 			
 			try{
 				int a[] = new int[5];
 				a[5] =4;
 			}
 			catch(ArrayIndexOutOfBoundsException e){
 				System.out.println(e);
 			}
 			
 			System.out.println("other statement");
 		}
 		catch(Exception e){
 			System.out.println("handled");
 		}
 		System.out.println("normal flow");
 	}	
 } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
