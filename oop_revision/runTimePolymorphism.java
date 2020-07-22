/*
class bike{

	void run(){
		System.out.println("bike run");
	}
}

class motorBike extends bike {

	void run(){
		System.out.println("MOTORbike run");
		
	}
	
	public static void main (String args[]){
	
		bike bmw = new motorBike();
		
	bmw.run();
	}
}
*/


/*
//run time polymorphism with upcasting example

class Bank{
	double interest;
	
	double getInterestRate(){
		return interest;
	}
}

class ComBank extends Bank{

	double interest = 12.1;
	
	double getInterestRate(){
		return interest;
	}
}

class BOC extends Bank{

	double interest = 13.1;
	
	double getInterestRate(){
		return interest;
	}
}

class NSB extends Bank{

	double interest = 14.1;
	
	double getInterestRate(){
		return interest;
	}
}

class TestBank{

	public static void main (String args[]){
	
	Bank col1 = new ComBank();
	Bank col2 = new BOC();
	Bank col3 = new NSB();
	
	System.out.println(col1.getInterestRate() );
	System.out.println(col2.getInterestRate() );
	System.out.println(col3.getInterestRate() );
	}
}
*/
/*
//run time polymorphism with upcasting example 2

class Animal 	{
	void food(){
		System.out.println("eat food");
	}
}

class dog extends Animal{
	void food(){
		System.out.println("eat meat and vege");
	}
}

class cow extends Animal{
	void food(){
		System.out.println("eat meat grass");
	}
}

class lion extends Animal{
	void food(){
		System.out.println("eat meat");
	}
}

class TestAnimal{
	public static void main(String args[]){
		
		Animal a;
		
		a = new dog();
		a.food();
		a = new cow();
		a.food();
		a = new lion();
		a.food();
		
	}
}
*/

//runtime polymorphism with data member - can not be done because only methods can be overridden
/*
class Car{

	String color ="blue"; 
}

class ferrari extends Car{
	 String color ="red";
}

class lambo extends Car{
	String color = "yellow";
}

class TestCar{
	public static void main(String args[]){
		Car car;
		
		car = new ferrari();
		System.out.println(car.color);
	
		car = new lambo();
		System.out.println(car.color);
	}
}
*/
/*
//runtime polymorphism with multilevel inheritance

class Animal{
	void eat(){
		System.out.println("eats food");
	}
}

class dog extends Animal{
	void eat(){
		System.out.println("eats meat and vege");
	}
	public static void main(String args[]){
		Animal p = new dog();
		
		p.eat();
	}
}

class pup extends dog{
	void eat(){
		System.out.println("eats pup food");
	}
	
	void bark(){
		System.out.println("pup can not bark");
	}
	
	public static void main(String args[]){
		Animal p = new pup();
		dog d = new pup();
		
		p.eat();
		pup k = (pup) p;
		k.bark();
		
	}
}
*/

//instanceof operator


class Complex{

}
class pup{}

class Simple extends Complex{

	public static void main(String args[]){
		
		int dul = 0;
		
		System.out.println( dul instanceof Simple);
	}
}











