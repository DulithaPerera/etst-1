
//autoboxing
/*
class WrapperEg1{

	public static void main(String args[]){
		int a=10;
	Integer i = Integer.valueOf(a);
	Integer j = i;
	Integer k = a;
	
	System.out.print("a:"+a+" i: "+i+" j: "+j+" k: "+k+"\n");
	System.out.println(i.getClass() );
	System.out.println(j.getClass() );
	System.out.println(k.getClass() );
	//System.out.println(a.getClass() );
	}
	
}
*/
/*
class WrapperEg2{

	public static void main(String args[]){
		int a=10;
	Integer i = new Integer(3);
	int j = i;
	int k = i.intValue();
	
	System.out.print("a:"+a+" i: "+i+" j: "+j+" k: "+k+"\n");
	System.out.println(i.getClass() );
	//System.out.println(j.getClass() );
	//System.out.println(k.getClass() );
	//System.out.println(a.getClass() );
	}
	
}
*/

// custom wrapper

class point{

	private int i;
	String name = "dul";

	point(){}
	
	point(int i){
		this.i = i;
		this.name = "ind";
	}
	
	public int get(){
		return i;
	}
	
	public String toString(){
		//System.out.println(name);
		return Integer.toString(i);
	}

}

class Testpoint{

	public static void main(String args[]){
		point p = new point(20);
		
		
		System.out.println("i: "+p.toString()+" name: "+p.name );
		System.out.println(p);
		System.out.println( p.toString().getClass() );
		//System.out.println(p.get().getClass() );
	}
}
























