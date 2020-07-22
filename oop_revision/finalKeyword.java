// final class and final method
/*
final class bike{

	final int speed =90;
	
	final void run(){
		System.out.println("hike");		
	}
}

class motorBike extends bike{

	void run(){
		System.out.println("dike");
	}
	
	public static void main (String args[]){
	
		motorBike bm = new motorBike();
		
		bm.run();
	}
}
*/
//blank final variable
/*
class cycle {

	final int panCardNo;
	
	cycle (int panCardNo){
		this.panCardNo = panCardNo;
	}
	
	public static void main (String args[]){
		
		cycle c1 = new cycle(1234);
		System.out.println(c1.panCardNo);
		
		c1.panCardNo = 13555;
		System.out.println(c1.panCardNo);
	}

}
*/
/*
//static blank final variable - can only be intialized in static block
class car{

	static final String drum;	
	
	static {drum = "dulitha";}
	public static void main (String args[]){
	
	//ether of the following wont work
		//static {drum = "dulitha";} // this is not allowed in java 
		
		//drum = "dulitha"; // this is not also allowed in java - does not take this as a static block
		
		
		System.out.println(drum);
	}
}
*/

//final parameter

class cube{

	cube( final int n){
		n +=2;
		System.out.println(n);
	}
	
	public static void main (String args[]){
		
		cube c = new cube(10);
	}
}




































