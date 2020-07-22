/*
class Recursion{

	int calcRecursion(int n){
		if (n ==1) {
			return 1;		
		}	
		return n*calcRecursion(n-1);
	}
	
	public static void main(String args[]){
	
	Recursion myRec = new Recursion();
			
	System.out.println(myRec.calcRecursion(5));	
	System.out.println(myRec.calcRecursion);
	}
}
*/

//tower of hanoi
/*import java.util.Scanner
class Hanoi{
	public void solve(int n, String start, String auxiliary, String end) {
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			solve(n - 1, start, end, auxiliary);
			System.out.println(start + " -> " + end);
			solve(n - 1, auxiliary, start, end);
		}
	}

	public static void main(String[] args) {
		Hanoi towersOfHanoi = new Hanoi();
		System.out.print("Enter number of discs: ");
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		towersOfHanoi.solve(discs, "A", "B", "C");
	}
}
*/

//hanoi towere with stack
/*
import java.util.Scanner;
//import java.util.Collection;
import java.util.Stack;

class HanoiStack{

	
//recursion method to move hanoi rings 
	void moveHanoiRings(int r, Stack<Integer> S, Stack<Integer> A, Stack<Integer> E){
		
		if (r == 1){
		//removing last ring from S and appeding it to E
			
			E.push(S.pop());
			System.out.println("S: "+S);
			System.out.println("A: "+A);
			System.out.println("E: "+E);
			System.out.println("-------------------------------------------------");
			
		}
		else{
		// moving rings before the last from S to A rod
			moveHanoiRings(r-1, S, E, A);
			E.push(S.pop());
			System.out.println("S: "+S);
			System.out.println("A: "+A);
			System.out.println("E: "+E);
			System.out.println("-------------------------------------------------");
		
	
		//moving the rings before the last from A to E rod
			moveHanoiRings(r-1, A, S, E);
			
			
		} 
	}
	

	public static void main(String args[]){

	//obtaining the number of rings to be moved and calling the recursion function
		HanoiStack myHanoi = new HanoiStack();
		Scanner input = new Scanner(System.in);
		System.out.println("Ener the number of rings to be moved: ");
		int rings = input.nextInt();
		
	//declarig the 3 rods
		Stack<Integer> Start = new Stack<Integer>();
		Stack<Integer> Aux = new Stack<Integer>();
		Stack<Integer> End = new Stack<Integer>();	

	//initializing the S -start rod with the required rings
		
		for (int i= rings; i>0; i--){
			Start.push(i);		
		}

	//testing stack address changing at recursion
		Aux.push(10);
		End.push(11);
		
		System.out.println("Starting stacks:");
			System.out.println("S: "+Start);
			System.out.println("A: "+Aux);
			System.out.println("E: "+End);
			System.out.println("-------------------------------------------------");
		myHanoi.moveHanoiRings(rings, Start, Aux, End); 
		
		
	}
}

*/

import java.util.Scanner;

class Palindrome{

	void PalindCheck(String sentence){
		
		if ( sentence.length() == 0 || sentence.length() == 1){
			System.out.println("true, it is palindrome");	
		}
		else{
			if (sentence.charAt(0) == sentence.charAt(sentence.length()-1) ){
				sentence = sentence.substring(1,sentence.length()-1);
				System.out.println(sentence);	
				PalindCheck(sentence);
			}
			else{
				System.out.println("flase, it is not palindrome");
			}
		}
	}

	public static void main(String args[]){
	
		Palindrome mySentence = new Palindrome();
		Scanner	input = new Scanner(System.in);
		System.out.println("Insert the word");
		String word = input.nextLine();
		String punctuations [] = {","," ",".","!","(",")",":",";","-","_"};
		for (int i=0; i<word.length(); i++){
			for (int j =0; j<punctuations.length; j++ ){
				if (word.charAt(i) == punctuations[j].charAt(0) ){
					word = word.replace(punctuations[j],"" );	
				}
			}	
		}
		//System.out.println(word);
		mySentence.PalindCheck(word);
	}
}


































