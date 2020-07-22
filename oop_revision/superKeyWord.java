
//

class superParent{
	
	int id;
	String name;
	
	superParent(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class superChild extends superParent{
	
	int salary;
	
	superChild(int id, String name, int salary){
		super(id, name);
		this.salary = salary;
	}
	
	public static void main (String args[]){
		
		superChild dulitha = new superChild(78, "Dulitha", 90000);
		
		System.out.println(dulitha.id);
		System.out.println(dulitha.name);
		System.out.println(dulitha.salary);
	}
}
