class arithmetic{
	public static void main (String args[]){
		int x=17, y=5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println ("x/y="+(x/y));
		System.out.println("x%y="+(x%y));
	}
}

class special_arithmetic{
	public static void main(String args[]){
		int x=17,a,b;
		a=x++;
		b=++x;
		System.out.println("x="+x+" a="+a);
		System.out.println("x="+x+" b="+b);
		a=x--;
		b=--x;
		System.out.println("x="+x+" a="+a);
		System.out.println("x="+x+" b="+b);
					
	}
}
