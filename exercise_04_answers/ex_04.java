//Exercise XVIII
/*
class Array{

	public static void main(String args[]){
		
		final int array_size = 10;		
		float realArray [] =  new float [array_size];
		
		//System.out.println(realArray[4]);
		realArray[3] = 12;
		System.out.println(realArray[3]);
		
		realArray[8] = 2.23f;
		realArray[6] = 7.77f;
		
		System.out.print("[ ");
		for (float x: realArray){
			System.out.print(x+", ");
		}	
		System.out.print("]");
	}
}
*/

//ex xix
/*
class Table{
	


	public static void main(String args[]){
	
		final int array_size = 3;
		int table [][] = new int [3][3];

		for (int y=0 ; y<table.length; y++){
//line38	
	for (int x=0; x<table[y].length; x++){
				table[y][x] = x+y;
			}
		}
		System.out.print("[");
		for (int y=0 ; y<table.length; y++){
			System.out.print("[");
			for (int x=0; x<table[y].length; x++){
				System.out.print(table[y][x]+", ");
			}
			System.out.print("]");
		} 
		System.out.print("]");
		System.out.println();
	}
}
*/

 
//ex xx
/*
class ErrorCorrection{

	public static void main(String args[]){
		int b[]=new int [10];
		for (int i=0; i<b.length; i++)
	      		b[i]=1;
		
		for (int i: b)
			System.out.print(i+", ");
		
				
	}
}
*/

//ex xxi

class Frequency{

	public static void main(String args[]){
			int response[] = {1,2, 6, 4,8, 5,9,7,8,10,
                                1,6,3,8,6,10,3,8,2,7,
                                6,5,7,6, 8,6,7, 5,6,6,
                                5,6,7,5, 6,4,8, 6,8,10};
			int frequency[]=new int [11];
		//sorting the frequencies of the responses
			for (int i=0; i<=10; i++ ){
				int count =0;
				for (int r: response){
					if (i==r){
						count+=1;
					}				
				}
				frequency[i] = count;		
			}


		//displaying output
			System.out.println("Rating	Frequency	Histogram");
			for (int i=0; i<=10; i++){
				System.out.print(i+"	"+frequency[i]+"		"+PrintStarRecursive(frequency[i]) );
				//PrintStar(frequency[i]);
				System.out.print("\n");
			}
			
	}

	//static void PrintStar(int n){
	//	while (n>0){
	//		System.out.print("*");	
	//		n--;
	//	}
	static String PrintStarRecursive(int n){
		if (n==1){
			return "*";
		}
		else if (n==0){
			return "";		
		}
		else{
			return PrintStarRecursive(n-1)+"*";		
		}
	}
				
}












