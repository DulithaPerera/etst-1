/*
import java.util.Scanner;

class Search{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);	
		
		int item, array[], num;

	//intializing the length of the array
		System.out.println("enter length of the array:");
		num = input.nextInt();
		array = new int[num];
		
	//obtaining the elements of the array
		System.out.println("Enter "+num+" integers one at a time:");
		for (int i=0; i<num; i++){
			array[i] = input.nextInt();
		}

	// obtaining the element to search
		System.out.println("Enter the item to be searched");
		item = input.nextInt();

	//calling the search algorithm
		Search newSearch = new Search();
		newSearch.BinarySearch(item, num, array);
	}


	// DIFFERENT SEARCH METHODS
//linear Search
	void LinearSearch(int item, int num, int array[]){
		int matches = 0;
		for (int i=0; i<num; i++){
			
			if (array[i] == item){
				matches += 1;
				System.out.println("location of "+item+" :"+i );
			}
		}
		if (matches == 0){
			System.out.println("no matches for item "+item+" is present");			
		}
		
	}

//Binary Search
	void BinarySearch(int item, int num, int array[]){
		int first = 0;
		int last = num-1;
		int middle = num/2;

		while (first<=last){
			if (array[middle] == item){
				System.out.println("location of "+item+": "+middle );
				break;
			}
			else if (item >= array[middle]){
				first = middle+1;
				middle = (first+last)/2;
			}
			else if (item <= array[middle]){
				last = middle-1;
				middle = (first+last)/2;
			}
			if ( first>last){
				System.out.println("no match found");
			}
		}
	}
}
*/


	
// buble sort (1st sorting the maximum value)


class Sort{

	public static void main(String args[]){

		int arr [] ={3,60,35,2,45,320,5};

		System.out.println("before sorting:");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+",");
		}
		
		System.out.println();
		MergeSort(arr);
		
		System.out.println("after sorting:");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+",");
		}
				
	}

	//Buble Sort
		static void BubleSort(int [] arr){
			int temp =0;
			for (int j=0; j<arr.length; j++){
				for (int i=1; i<arr.length-j; i++){

					if(arr[i-1] > arr[i]){
						temp = arr[i];
						arr[i] = arr[i-1];
						arr[i-1] = temp;
					}							
				}
			}
		} 

	//Selection Sort
		static void SelectionSort(int [] arr){

			int n = arr.length;
			for (int j=0; j<n; j++){
				int min = arr[j];
				int min_index =j;
				for (int i=j+1; i<n; i++){
					if (arr[i]<min){
						arr[j] = arr[i];
						arr[i] = min;
						min = arr[j];
					}				
				}	
				
			}
	
		}

	//insertion Sort
		static void InsertionSort(int [] arr){
			int temp;
			int n= arr.length;
			
			for (int j=0; j<n-1; j++){
				
				for (int i=j; i>0; i--){
					if (arr[i+1]<arr[i]){
						temp = arr[i+1];
						arr[i+1] = arr[i];
						arr[i] = temp;
						
					}
				}
			}
		}


	//merger sort
		static void MergeSort(int [] arr){
			int firstindex = 0;
			int lastindex = arr.length-1;
			
			// calling division function
			MergeDivision(firstindex, lastindex, arr);
		}
			
		static void MergeDivision(int firstindex, int lastindex, int [] arr){
			if (firstindex < lastindex){
				int middle = (firstindex + lastindex)/2;
				
				//dividing the part left of the middle element in the array
				MergeDivision(firstindex, middle, arr);
				//divding the part right of the middle element in the array
				MergeDivision(middle+1, lastindex, arr);
				
				//sorting and merging the left and right parts
				MergeParts(firstindex, middle, lastindex, arr);
			}		
		}

		static void MergeParts(int firstindex, int middle, int lastindex, int [] arr){
			int temp [] = new int[lastindex+1];
						
			for ( int i=firstindex; i<=lastindex; i++){
				temp[i] = arr[i];
			}
			
			//sorting of inputs in each iteration and moving to the first array
			int i = firstindex;
			int j = middle+1;
			int k = firstindex;			
			while (i<=middle && j<=lastindex){
				if (temp[i]<=temp[j]){
					arr[k] = temp[i];
				
					i++;
				}
				else{
					arr[k] = temp[j];
					
					j++;		
				}
				k++;				
			}
			//inserting remaining elements to the array arr
			while (i<=middle){
				arr[k] = temp[i];
				
				k++;
				i++;
			}
			while (j<=lastindex){
				arr[k] = temp[j];
				
				k++;
				j++;
			}
		}
}








































	

