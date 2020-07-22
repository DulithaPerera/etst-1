// Exercise 01 docs - answers

//Ex02
/*
class Calculation{
	
	public static void main(String args[]){
	
		//declaring variables
		int i,j,m,n,k;
		float f,g;
		char c;
		
		//assigning values to variables//	
		k=i=j=2;
		m=n=5;
		f=12.0f;
		g=4.0f;
		c='X';
		//printing output of calculations
		System.out.println("k + 12 * m= "+(k+12*m));
		System.out.println("m/j = " +(m/j));
		System.out.println("n%j = "+ (n%j));
		System.out.println("m/j*j = "+(m/j*j));
		System.out.println("f+10*5+g = "+(f+10*5+g));
		System.out.println("++i*n = "+(i++*n));
		System.out.println("++i*n = "+(++i*n));
		System.out.println("++i*n = "+(i++*n));
	}
}
*/

//Ex3

//Ex4
/*class Area{
	public static void main(String args[]){
		double Area;
		double radius=25;
		Area = 3.14* radius*radius;

		System.out.println(" radius =25 ,therefore Area = "+Area);
	}
} */

// EX5 -find errors in the following program
//program to be corrected
/*class calc {
                            public static void main(String[] args) {
integer a=17;b=5;
System.out.print("Addition="+(a+b));
 System.out.print("Subtraction="+(a-b));
System.out.print("Multiplication="+(a x b));
System.out.print("Division="+(a\b));
    }
              }
*/

// corrected program
/*
class calc{
	public static void main(String args[]){
		int a=17, b=5;
		System.out.println("Addition="+(a+b));
		System.out.println("Subtraction="+(a-b));
		System.out.println("Multiplication="+(a * b));
		System.out.println("Division="+(a/b));
	}
} */

//Ex4
/*
class marathon{
	public static void main(String args[]){
		//double marathon_in_miles;
		double marathon_in_miles = (26.0000 +  385d/1760);
		//double marathon_in_km;
		double marathon_in_km = marathon_in_miles*1.609;
		double n= (double) 385/1760;
		double b= .01234;

		System.out.println("length of marathon in miles ="+marathon_in_miles);
		System.out.println("length of marathon in km ="+marathon_in_km);
		System.out.println(n);
		System.out.println(b);
	}
}
*/

/*
import java.util.Scanner;

class tempConverter{
	public static void main(String args[]){
		
		Scanner usrInput = new Scanner(System.in);

		System.out.println("What conversion would u like? (Select the appropriate number) \n 	1.Farenhite to Celcius conversion \n 	2.Celcius to Farenhite conversion");

		//obtaining type of conversionand validating user's selection
		if (usrInput.hasNextInt()){
			int selection = usrInput.nextInt();
						
			switch (selection){

				//if '1'-> farenhit to celcius converter
				case 1:	
					// obtaining and validating temperature in farenhite 
					System.out.println("Please enter the farenhite temperature to convert (dont enter any symbol)");

					if (usrInput.hasNextDouble()){
						double temp = usrInput.nextDouble();
						double celciusTemp = (5d/9)*(temp-32);
						System.out.println("corresponding celcius temperature for "+temp+"F is : "+celciusTemp+"c");
					}
					else{
						System.out.print("your input is not valid. Please try again");
					}
					break;
													
				//if 2-> celcius to farenhite converter	
	
				case 2:
					// obtaining and validating temperature in celcius
					System.out.println("Please enter the celcius temperature to convert (dont enter any symbol)");
					if (usrInput.hasNextDouble()){
						double temp = usrInput.nextDouble();
						double farenhiteTemp = (9d/5)*temp+32;	
						System.out.println("corresponding farenhite temperature for "+temp+"c is : "+farenhiteTemp+"F");
					}
					else{
						System.out.print("your input is not valid. Please try again");
					}
					break;
				
				//if selection != 1 or 2
				default :
					System.out.println("Your selection is out of the available options list. Please try again");
			}
					
		}
		else{
			System.out.print("your input is not valid (not an integer). Please try again");
		}	
					
	
		
		
		
	} 
}
*/
//ex6	
import java.util.Scanner;
import java.util.Arrays;


class reverseNumber{
	public static void main(String args[]){
		
		Scanner number = new Scanner(System.in);	
		int num,rev_num;
		int [] numArray = new int [4],rev_numArray = new int [4];

		System.out.println("please enter an integer number");
		if (number.hasNextInt()){
			
			num = number.nextInt();
			if (num <= 1111 && String.valueOf(num).length() == 4){
				int i =3;
				int n = num;
				while (n > 0 ){
					//System.out.println("i= "+i);
					numArray[i] = n%10;
					//System.out.println("numArray["+i+"] ="+numArray[i]);
					//System.out.println("numArray ="+numArray);
					n /= 10;
					//System.out.println("n ="+n);
					i--;	
				}

				rev_num = num*9;
				System.out.println("rev_num= "+rev_num);
				int j=3;
				int r =rev_num;
				while (r >0){
					//System.out.println("j= "+j);
					rev_numArray[j] = r%10;
					//System.out.println("rev_numArray["+j+"] ="+rev_numArray[j]); 
					r /= 10;
					--j;
					//System.out.println("r ="+r);				
				}			

				if (numArray[0] == rev_numArray[3] && numArray[1] == rev_numArray[2] && numArray[2] == rev_numArray[1] && numArray[3] == rev_numArray[0]){
					System.out.print("num ="+num+" \n"+num+"*9 = "+rev_num+"\n therefore number"+num+" is a reversible number \n");	
		
				}
				else{
					System.out.println("num ="+num+" \n"+num+"*9 ="+rev_num+"\n therefore number"+num+" is a NOT reversible number");
			
				}
			}
			
			else{
				System.out.print("Please enter a 4 digit number lesser than or equal 1111");			
			}			
			
		}
					
		else{
			String error = number.nextLine();
			System.out.println("There is something wrong with the input, "+error+" you entered. Please check again and enter a valid integer.");		
		}
	}
}










