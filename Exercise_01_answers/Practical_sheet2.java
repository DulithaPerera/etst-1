
//Ex7
/*class logicalAssignmentOperators{
	
	public static void main(String args[]){
		int a=1, b=2,  c=3;
		
		
		
		
		//displaying values
		System.out.println("a|=4 :"+(a |=4));
		System.out.println("b >>1 :"+(b >>1));
		System.out.println("c <<=1 :"+(c <<=1));
		System.out.println("a ^= c :"+(a ^= c));
		System.out.println("c &= 1 :"+(c &= 1));

	}
}
*/
/*
import java.util.Scanner;

class maxValue{
	
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		int a,b,c;
		
		//get inputs from usr
		System.out.println("insert 3 numbers with spaces to seperate them");
			a = num.nextInt();
			b = num.nextInt();
			c = num.nextInt();
			
			// checking the max number using if statement
			if (a>b && a>c){
				System.out.println("max number ="+a);
			}
			else if (c>b && c>a){
				System.out.println("max number ="+c);
			}	
			else if (b>a && b>c){
				System.out.println("max number ="+b);								
			}
			else {
				System.out.println("your entry contains errors please check again and retry");		
			}
			
			//checking the max number using ternary operator
			String max = (a>b && a>c) ? Integer.toString(a) :(b>a && b>c) ? Integer.toString(b) : (c>b && c>a) ? Integer.toString(c): "error";

			System.out.println("max= "+max);
	
	}
}
*/
/*
import java.util.Scanner;

class oddEven{
	public static void main(String args[]){
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inser a integer to be checked");
		if (input.hasNextInt()){
			num = input.nextInt();
			switch (num%2){
				case 1:
					System.out.println("ODD");
					break;
				case 0:
					System.out.println("EVEN");
					break;				
			}
		}
		else{
			System.out.println("Please enter an integer.");				
		}
	}
}
*/

//ex10
/*
class Print{
	public static void main (String args[]){
		int a =1,b=3;

		if (a == 1){
			if (b==1){
				System.out.println("***");
			
			}
			else{
				System.out.println("###");
				System.out.println("===");		
			}		
		}
		//else{
		//	System.out.println("###");
		//	System.out.println("===");		
		//}
	}
}
*/

//ex 11
/*
import java.util.Scanner;

class averageDecide{
	public static void main(String args[]){
		
		int mark1, mark2, mark3;
		double avg;
		Scanner marks = new Scanner(System.in);
	
		//obtaining marks for the 3 subjects

		System.out.println("Please enter the mark of subject 1");
		if (marks.hasNextInt()){
			mark1 = marks.nextInt();	
		}

		else{	
			mark1 =0;
			System.out.println("please enter only an integer.");			
		}
		System.out.println("Please enter the mark of subject ");
		if (marks.hasNextInt()){
			mark2 = marks.nextInt();				
		}
		else{
			mark2=0;
			System.out.println("please enter only an integer.");			
		}
		System.out.println("Please enter the mark of subject ");
		if (marks.hasNextInt()){
			mark3 = marks.nextInt();
		}
		else{
			mark3=0;
			System.out.println("please enter only an integer.");			
		}
		
		avg = (mark1+mark2+mark3)/3d;
		System.out.println (avg);
*/
	/* 5 if clauses
		if (avg < 0){
			System.out.println("Invalid input");
		}
		else if(avg >=54.0){
			System.out.println("Good");	
		}
		else if(avg >39.0){
			System.out.println("Pass");	
		}
		else if(avg <= 39.0){
			System.out.println("Fail");	
		}
		else if(avg > 69.0){
			System.out.println("V Good");		
		}	
	*/
	/*
	//nested if 
		if (avg >= 0){
			if(avg >39.0){
				if (avg > 69.0){
					System.out.println("V good");
				}
				else{
					System.out.println("Pass");					
				}
				
			}
			else{
				System.out.println("fail");
			}
		}
		else{
			System.out.println("incorrect input");		
		}
	*/
	// ternary statement
/*	
	String grade = (avg< 0) ? 
			"Incorrect input": (avg > 69) ? 
				"V good": (avg >=54) ?
					"Good" : (avg > 39) ?
						"pass" : "fail";
	System.out.println(grade);

	}
}

*/

//ex12
/*
import java.util.Scanner;
class month{
	public static void main(String args[]){
		
		int month;
		Scanner input = new Scanner(System.in); 


		System.out.println("insert the number of the month");

		if (input.hasNextInt()){
			month = input.nextInt();
			
			switch (month){
				case 12 :
				case 1:
				case 2:
					System.out.println("Winter");
					break;
				case 3 :
				case 4:
				case 5:
					System.out.println("spring");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("summer");
					break;
				case 9 :
				case 10:
				case 11:
					System.out.println(" autumn");	
					break;
				default	: System.out.println("Incorrect month number");	
			}
		}	
		else{
			System.out.println("Please enter an interger");
		}
	}
}

*/

//ex14

/*
import java.util.Scanner;

class calculator{
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		double num1, num2;
		double result;
		char operator;

		System.out.println("please enter 1st number:");
		num1 = input.nextInt();

		System.out.println("Select an opeator: \n * - multiplication \n / - division \n + - addition \n - - substractionv\n");
		operator = input.next().charAt(0);

		System.out.println("please enter 2nd number:");
		num2 = input.nextInt();
		
		switch(operator){
			case '*':
				result = Double.valueOf(num1*num2);
				System.out.println(num1+" "+operator+" "+num2+ " ="+result);	
				break;
				
			case '/':
				if (num2 != 0){
					result =num1/num2;
					System.out.println(num1+" "+operator+" "+num2+ " ="+result);
									
				}
				else{
					System.out.println ("cant divide by 0");				
				}
				break;
			case '+':
				result = num1+num2;
				System.out.println(num1+" "+operator+" "+num2+ " ="+result);
				break;
			case '-':
				result = num1-num2;
				System.out.println(num1+" "+operator+" "+num2+ " ="+result);
				break;
			default: System.out.println("wrong selection of operator");
		}
		
				
	}
}
*/

//ex15

/*
class errorCorrection{
	public static void main(String args[]){
	
		int x =5;
		int y =7;

		if (y == 8){

		  	if (x == 5){
	  			System.out.println("@@@@@");
			}
	  		else{}
		}
		System.out.println("#####");
		
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		
		
	}
}
*/
/*
//ex16

class rice{
	public static void main(String args[]){
		int count = 0, rice = 1;

		while (rice < 1000000){
			System.out.println("rice= "+rice);
			System.out.println("count= "+count+"---");
			rice *=2;
			count++;		
		}
		System.out.println("-------------------------");
		System.out.println("rice= "+rice);
		System.out.println("final_count = "+count);
	}
}

*/

//ex17

/*
class findSum{
	public static void main(String args[]){
		
		int num,sum=0;
//using for loop

		for (num=1;num<=10;num++){
			//sum +=(num*num);
			sum += Math.pow(num,2);
			System.out.println(num);	
			System.out.println("sum= "+sum);	
		}
		System.out.println("sum= "+sum);
*/
//using while loop
/*
		num =1;
		while (num<=10){
			sum += num;
			num++;		
		}
		System.out.println("sum= "+sum);
*/
//using do while
/*
		num =1;
		do{ 
			sum +=num;
			num++;
		}
		while(num<=10);
		System.out.println("sum= "+sum);
*/
//	}
//}

//ex18
/*
class multiplicationTable{

	public static void main(String args[]){
		int table [][] = new int [8][11];

///////////////making the content
//making the first row (just numbers)
		//table[0][0] =null;
		for(int i=1;i<table[0].length;i++){
			table[0][i] = i;
		}
	
//making the first column
		for (int i=1; i<table.length;i++){
			table[i][0] = i;			
		}
//making the inside contents
		for (int i=1;i< table.length ;i++){
			for (int j=1; j<table[0].length;j++){
				table[i][j] = table[i][0]*table[0][j];
			}		
		}
//printing the whole multiplication table row by row
		for (int i=0; i<table.length; i++){
			for (int j=0; j<table[0].length; j++){
				System.out.print(table[i][j]+"	"); 				}	
			System.out.println("\n ");		
		}

	}
}
*/

//ex 19

class reverseNum{
	public static void main(String args[]){

		int num, numRev, numTemp, numRevTemp;
		int numArray [] = new int [4];
		int numRevArray [] = new int [4];

//list of candidate numbers (1000 -1111)
 		for (num=1000; num<=1111;num++){
			
			numTemp=num;
			numRev = numRevTemp = 9*num;
				
			for (int i=(numArray.length-1);i>=0; i-- ){
				numArray[i] =numTemp%10;
				numTemp /= 10;	
						
			}
			
			for (int i=(numRevArray.length-1); i>=0; i--){
				numRevArray[i] = numRevTemp%10;	
				numRevTemp /= 10;

			}

			if (numArray[0] == numRevArray[3] && numArray[1] == numRevArray[2] && numArray[2] == numRevArray[1] && numArray[3] == numRevArray[0]){
				System.out.println("num ="+num+"::::numRev ="+numRev);				
				System.out.println(num+" is a reversible number");	
		
			}
/* 			else{
				System.out.println(num+" is a NOT reversible number");
			}
*/			
		}
	}
}







