
//creating a custom exception called InvalidAgeException

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}

class customExceptionTest{

	void validate(int age) throws InvalidAgeException{
		if (age>18){
			System.out.println("Welcome to vote dude");
		}
		else{
			throw new InvalidAgeException("not valid: too young to vote");
		}
	}
	
	public static void main (String args[]){
		customExceptionTest t = new customExceptionTest();
		for (int i=13; i<38; i+=5){
			System.out.print(i+": ");
			try{
				//System.out.print(i+": ");
				t.validate(i);
			}
			catch(Exception e){
				//System.out.print(i+": ");
				System.out.println("caught the exception successfully, which is "+e);
			}
		}
		
		System.out.println("here is the code at the rest");
	}
}
