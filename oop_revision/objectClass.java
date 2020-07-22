/*
class dulitha {


}

class indula{

	public static void main(String args[]){
		
		dulitha d = new dulitha();
		
		indula i = new indula();
		
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		System.out.println(d.equals(i));
	}

}
*/

//object cloning

class std implements Cloneable{
	
	int no;
	String name;
	
	public std(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class testclone{

	public static void main (String args[]){
		try{
			std s1 = new std(1,"q");
			std s2 = (std)s1.clone();
		
			System.out.println("s1:"+s1.no+" "+s1.name);
			System.out.println("s2:"+s2.no+" "+s2.name);
		}
		catch(Exception e){
			System.out.println("caught:::::"+e);
		}
		
	}
}













