/*
//checking if super class method does not declare an exception it 
//cant be declared in the ovrerrident method in child class
import java.io.IOException;

class parent{

	void msg(){
	}
}

class child extends parent{

	void msg() throws IOException{
		System.out.println("Testing  childs ability");
	}
	
	public static void main(String args[]){
		parent p = new child();
	
		p.msg();
	}
}

*/
/*
//checking when super class has declared an exception in its method 
//and declaring the same in the child class method

import java.io.IOException;

class parent{

	void msg(){
		System.out.println("parent");
	}
}

class child extends parent{

	void msg() throws ArithmeticException{
		System.out.println("child");
		throw new ArithmeticException("duliya");
	}

	public static void main(String args[]){
	
		parent p = new child();
	
		p.msg();
	}

}
*/
/*
//in sub class overridden method declares parent Exception (parent exception means parent of the exception eg:ArthimeticException is a child of Esception class, )

import java.io.IOException;

class parent{

	void msg() throws IOException{
		//throw new ArithmeticException("foul in parent");
		System.out.println("parent");
		
	}
}

class child extends parent{
	
	void msg() throws IOException{
		//throw new ArithmeticException("foul in child");
		System.out.println("child");
	}
	
	public static void main(String args[]){
		parent p = new child();
		
		try{
			p.msg();
		}
		catch(Exception e){
			System.out.println("caught the exception");
		}
		System.out.println("rest of the code");
	}
}
*/
/*
// in sub class in the overridden method same exception is declared
class parent{

	void msg() throws Exception{
		//throw new ArithmeticException("foul in parent");
		System.out.println("parent");
		
	}
}

class child extends parent{
	
	void msg() throws Exception{
		//throw new ArithmeticException("foul in child");
		System.out.println("child");
	}
	
	public static void main(String args[]){
		parent p = new child();
		
		try{
			p.msg();
		}
		catch(Exception e){
			System.out.println("caught the exception");
		}
		System.out.println("rest of the code");
	}
}
*/
/*
//subclass overridden method declares subclass exception

class parent{
	void msg() throws RuntimeException{
		System.out.println("parent");
	}
}

class child extends parent{
	void msg() throws ArithmeticException{
		System.out.println("child");
		throw new ArithmeticException("null value division");
	}
	
	public static void main (String args[]){
		parent p = new child();
	
		try{
			p.msg();
		}
		catch(ArithmeticException e){
			System.out.println("caught Arithmetic Exception");
		}
	}
}
*/

//sub class overridden method declares no exception

class parent{
	void msg() throws RuntimeException{
		System.out.println("parent");
	}
}

class child extends parent{
	void msg() throws ArithmeticException{
		System.out.println("child");
		//throw new ArithmeticException("null value division");
	}
	
	public static void main (String args[]){
		parent p = new child();
	
		try{
			p.msg();
		}
		catch(Exception e){
			System.out.println("caught the exception");
		}
		System.out.println("rest of the code");
	}
}






























