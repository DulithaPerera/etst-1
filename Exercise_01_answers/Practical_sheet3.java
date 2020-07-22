
//ex20
/*
class sumArray{
	public static void main (String args[]){
		
		int a[] ={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for (int i=0; i<a.length; i++){
			sum +=a[i];
			System.out.println(sum);
		}
	}
}
*/

//ex21
/*
class mulArray{
	public static void main (String args[]){
		double m[][];
		m= new double[4][4];
		m[0][0]=1;
		m[1][1]=1;
		m[2][2]=1;
		m[3][3]=1;

		System.out.println(" 	c1	c2	c3	c4");
		for (int i=0; i<m.length; i++){
			System.out.print("Row"+(i+1));
			for (int j=0; j<m[i].length; j++){
				System.out.print("	"+(int)(m[i][j]));				
			}
			System.out.print("\n");
		}
	}
}
*/

//ex22
//import java.io.*;
import java.util.Scanner;
class BoxDemo{
/*		int depth,height,width; //(vii)
	BoxDemo(){
		depth =10;
		height =15;		
		width =5;

	}
*/
	//int width =0,depth = 0,height= 0,volume =0;	//for (i) to (v)
	
	public 	static void main(String args[]){

	
		 //BoxDemo roundBox = new BoxDemo(); //for (vii)   
		 //System.out.print(roundBox.height+" : "+roundBox.depth+" : "+roundBox.width);
 /*	// e(i) declaring 2 instances/ objects of BoxDemo inside main method
		 BoxDemo roundBox = new BoxDemo();
		 BoxDemo plasticBox = new BoxDemo();
/*
	
/*	//(ii)assigning different values for instances			
		roundBox.height = 12;
		roundBox.width = 12;
		roundBox.depth = 12;
		plasticBox.height  = 10;
		plasticBox.width  = 14;
		plasticBox.depth = 8;
*/
		
	//(iii) calculating volume of each box and displaying it
		//System.out.println(roundBox.height*roundBox.depth*roundBox.width);

		//roundBox.calcVolume(); //for (iv)

// obtaining inputs from user
/*		Scanner input = new Scanner(System.in);
		//BoxDemo box = new BoxDemo();
		System.out.println("insert height:");
		height = input.nextInt();
		System.out.println("insert width:");
		width = input.nextInt();
		System.out.println("insert depth:");
		depth = input.nextInt();
		System.out.println(calcVolume(height, width, depth));
		
		
		//System.out.println(plasticBox.calcVolume()); //for (v) and (vi)
		//System.out.println(roundBox.calcVolume());  //for (v) and (vi)
		
	}

	// (iv)method to calculate volume and display (set returnType to void and then print volume)
	public static double calcVolume(int h, int w, int d){ // for (iv) static is required if not --"non-static method calcVolume(int,int,int) cannot be referenced from a static context" -- error pops out
		//volume = box.height*box.width*box.depth;
		int volume = h*w*d;
		return volume;  //for(v) and (vi)
		//System.out.println(volume); //for (iv)
*/		
	}
	

}


//ex23

class counter{
	static int count =0;
		
	counter(){
		count =0;
	}
	static int increment(int a){
		count+= a;
		return count;
	}
	static int decrement(int a){
		count-=a;
		return count;
	}
	static int reset(){
		count = 0;
		return count;
	}	
	static void display(){
		System.out.println(count);	
	}

	public static void main (String args[]){
		
		increment(10);
		display();
		decrement(1);
		display();
		reset();
		display();
		decrement(6);
		display();
		counter A = new counter();
		display();
	}

}

//ex24
/*
class Circle{

	int radius, colour;
//constructor
	Circle(){
		radius = 0;
	}

	void setRadius(int r){
		radius = r;
		colour = 255;	
	}

	void setRadius(int r, int col){
		radius = r;
		colour = col;
	}

	int getRadius(){
		return radius;	
	}

	void displayArea(){
		System.out.println("area = "+ 3.14*radius*radius);
	}

	public static void main(String args[]){
		
		Circle myCircle = new Circle();

		myCircle.setRadius(10,5);
		System.out.println("myCircle.radius= "+myCircle.getRadius());
		myCircle.displayArea();
		
	}
}

*/

//ex25

class Rectangle{

	int width,height;

	Rectangle(){
		height =1;
		width =1;
	}

	void setWidth(int w){
		width = w;
	}

	void setHeight(int h){
		height = h;
	}

	int getHeight(){
		return height;
	}

	int getWidth(){
		return width;	
	}

	void displayArea(){
		System.out.println("Area: "+width*height);
	}
	public static void main(String args[]){
	
		Rectangle myRectangle = new Rectangle();
		
		myRectangle.displayArea();
		
		myRectangle.setHeight(5);
		myRectangle.setWidth(10);
		myRectangle.displayArea();
				
	}
}



























