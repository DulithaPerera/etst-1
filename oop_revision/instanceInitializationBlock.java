
class InitializationBlock{

	int speed;
	
	InitializationBlock(){
		System.out.println(" PARENT constructor");
	}
	
	
	{System.out.println(" PARENT intialization block");}
	
		
}

class big extends InitializationBlock{

	big(){
		super();
		System.out.println("CHILD constructor");
	}
	
	{System.out.println("CHILD intialization block");}
	
	
	public static void main (String args[]){
		
		big b1 = new big();
		big b2 = new big();
	}
}
