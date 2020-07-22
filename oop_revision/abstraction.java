/*
//abstract class and method

abstract class bike{
	abstract void run();
}

class honda extends bike{
	
	void run(){
		System.out.println("honda is running");
		
	}
	
	public static void main (String args[]){
		
		bike h = new honda();
		h.run();
	}
}
*/
/*
// abstract class with abstaract and non abstaract methods and data members

abstract class shop{
	String name = "Lassana Shop";
	
	shop(){
		System.out.println("shop created: "+name);
	}
	
	abstract void giveChange();	
}

class teaShop extends shop{

	void giveChange(){
		System.out.println("change is given");
	}
	
	public static void main (String args[]){
	
		shop b = new teaShop();
		b.giveChange();
	}
}

*/

// using an abstract class to implement interface

interface A {
	void dul();
	void ind();
	void per();
}

abstract class next implements A{
	public void dul(){
		System.out.println("dul ok");
	}
}

class but extends next{
	public void ind(){
		System.out.println("ind ok");
	}
	public void per(){
		System.out.println("per ok");
	}
	
	public static void main(String args[]){
		
		but b = new but();
		
		b.dul();
		b.ind();
		b.per();
	}

}

























