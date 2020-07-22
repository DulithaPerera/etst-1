/*
import java.io.IOException;

class handleORdeclare{

	public static void main(String args[]){
		
		N n =new N();
		try{
			n.methodM();
		}
		catch(IOException e){
			System.out.println("exception thrown at class M handled at class handleORdeclare");
		}
		System.out.println("normal flow");
	}
}

class N{

	void methodM() throws IOException{
		
		throw new IOException("device is not availble");
	}
}

*/

import java.io.IOException;

class justdeclareException{

	public static void main(String args[]) throws IOException{
		try{
		justdeclareException j =new justdeclareException();
		j.methodM();
		}
		catch (Exception e){
			System.out.println("handled");
		}
	}
	
	void methodM() throws IOException{
		
		throw new IOException("device is not availble");
	}
}

class N{

	void methodM() throws IOException
	{
		
		throw new IOException("device is not availble");
	}
}





















