/*
class TestFinallyBlock{

	public static void main(String args[]){
	
		try{
			int data = 25/5;
			System.out.println(data);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
			System.out.println("rest of the code");
		}
	}
}
*/
/*
class TestFinallyBlock1{

	public static void main(String args[]){
	
		try{
			int data = 25/0;
			System.out.println(data);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
			System.out.println("rest of the code");
		}
	}
}
*/
/*
class TestFinallyBlock2{

	public static void main(String args[]){
	
		try{
			int data = 25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.exit(0);
		}
		finally{
			System.out.println("finally block is always executed");
			System.out.println("rest of the code");
		}
	}
}
*/
/*
class throwException1{

	static void validate(int age){
		if (age <18){
			throw new ArithmeticException("not valid");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}

	public static void main (String args[]){
	
		//validate(45);
		validate(6);
		System.out.println("rest of the code");
;	}
}
*/
/*
class TestExceptionPropagation{

	void m(){
		int data =50/0;
	}
	
	void n(){
		m();
	}
	
	void p(){
		try{
			n();	
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled");
		}
	}
	
	public static void main(String args[]){
	
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.p();
		System.out.println("normal flow"); 	
	}
}
*/


//testing whether checked exceptions are not propagated in the call stack
/*
import java.io.IOException;

class TestExceptionProp{

	void m(){
		
		try{
			throw new IOException("device error");
		}
		catch(IOException e){
			System.out.println("exception is handled");
		}
	}
	
	void n(){
		m();
	}
	
	void p(){
			n();
		}
	
	public static void main(String args[]){
	
		TestExceptionProp obj = new TestExceptionProp();
		obj.p();
		System.out.println("rest of the code");
	}
}
*/
/*
import java.io.IOException;

class TestExceptionThrow{

	void m() throws IOException{
		
		throw new IOException("device error");
	}
	
	void n() throws IOException{
		m();
	}
	
	void p(){
		try{
			n();
		}
		catch(IOException e){
			System.out.println("exception ok in method p");
		}
		
	}
	
	public static void main(String args[]){
	
		TestExceptionThrow obj = new TestExceptionThrow();
		obj.p();
		System.out.println("remainder");
	}
}
*/
import java.io.IOException;

class N{

	void methodM() throws IOException{
		
		throw new IOException("device is not availble");
	}
}

class handleORdeclare{

	public static void main(String args[]){
		
		N n =new M();
		try{
			m.methodM();
		}
		catch(IOException e){
			System.out.println("exception thrown at class M handled at class handleORdeclare");
		}
		System.out.println("normal flow");
	}
}












































