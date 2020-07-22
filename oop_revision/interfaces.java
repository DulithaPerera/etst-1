/*

//interface in java example 1
interface printable{
	void printNow();
}

class A implements printable{
		
	public void printNow(){
		System.out.println("printed");
	}	
	
	public static void main(String args[]){
		
		A a = new A();
		a.printNow();
	}
}
*/
/*
//interface in java example 2

interface shape {

	void draw();
}

class circle implements shape{

	public void draw(){
		System.out.println("circle drawn");
	}
}

class rectangle implements shape{
	public void draw(){
		System.out.println("rectangle drawn");
	}
}

class testShape{

	public static void main(String args[]){
		circle c = new circle();
		rectangle r = new rectangle();
		
		c.draw();
		r.draw();
	}
}
*/
/*
//multiple inheritance via interfaces

interface bud{
	void dum();
}

interface bum{
	void dud();
}

class boom implements bud, bum{
	
	public void dud(){
		System.out.println("dud out");
	}
	
	public void dum(){
		System.out.println("dum out");
	}
	
	public static void main(String args[]){
		
		boom nub = new boom();
		
		nub.dud();
		nub.dum();
	}
}
*/

/*
// interface inheritance - extending interfaces

interface bud{
	void dum();
}

interface bum extends bud{
	void dum();
	void dud();
}

class boom implements bud, bum{
	
	public void dud(){
		System.out.println("dud out");
	}
	
	public void dum(){
		System.out.println("dum out");
	}
	
	public static void main(String args[]){
		
		boom nub = new boom();
		
		nub.dud();
		nub.dum();
	}
}
*/

















































































