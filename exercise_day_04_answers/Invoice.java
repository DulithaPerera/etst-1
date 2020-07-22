/*

//q1
import java.util.Scanner;

class Invoice{

 //definining variables
	int quantity;
	double pricePerItem;
	String description;
	String itemNum;

	Invoice(){
		quantity = 0;
		pricePerItem = 0.00d;
		description = "		";
		itemNum = "0";	
	}

// get methods
	//2
	void getQuantity(){
		System.out.println("Quantity :"+quantity);
	}
	//3
	void getDescription(){
		System.out.println("Item Description : "+description);
	} 
	//4
	void getPricePerItem(){
		System.out.println("Price per Item : "+pricePerItem);
	} 
	//1
	void getItemNum(){
		System.out.println("Item Number : "+itemNum);
	} 

// set methods
	//6
	void setQuantity(int num){
		quantity = num;		
		if (quantity < 0){
			quantity = 0;		
		}
		
		System.out.println("Quantity : "+quantity);
	}
	//7
	void setDescription(String desc){
		description = desc;
		System.out.println("Item Description : "+description);
	} 
	//8
	void setPricePerItem(double price){
		pricePerItem = price;		
		if (pricePerItem < 0){
			pricePerItem = 0.00d;		
		}
		
		System.out.println("Price per Item : "+pricePerItem);
	} 
	//5
	void setItemNum(String iNum){
		itemNum = iNum;
		System.out.println("Item Number : "+itemNum);
	} 

//calculate and print invoice values
	//9
	void getInvoice(){
		System.out.println("ItemNumber	Description	PricePerItem	Quantity	TotalAmount");
		System.out.println(itemNum+"	"+description+"	"+pricePerItem+"		"+quantity+"		"+(quantity*pricePerItem) );	
	}	

	public static void main(String args[]){
		
		Invoice newInvoiceItem = new Invoice();

		Scanner input = new Scanner(System.in);
		
		while (true){
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			System.out.println("List of features available in this application. Please select the respective number of the function to proceed with that function.");
			System.out.println("1. View ItemNumber		2. view Quantity");
			System.out.println("3. View item Description	4. view PricePerItem");
			System.out.println();
			System.out.println("5. Set ItemNumber		6. Set Quantity");
			System.out.println("7. Set ItemDescription	8. Set PricePerItem");
			System.out.println();
			System.out.println("9. Calculate Invoice");
			System.out.println("10. Exit");
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			
			int userSelection = input.nextInt();
						
			
			switch (userSelection){
				case 1:
					newInvoiceItem.getItemNum();
					break;
				case 2:
					newInvoiceItem.getQuantity();
					break;
				case 3:
					newInvoiceItem.getDescription();
					break;
				case 4:
					newInvoiceItem.getPricePerItem();
					break;
				case 5: {
						System.out.println("Eneter the number of the Item");
						input.nextLine();
						String itemNum = input.nextLine();
						newInvoiceItem.setItemNum(itemNum);
					}
					break;
				case 6: {
						System.out.println("Eneter the required quantity");
						input.nextLine();
						int quant = input.nextInt();

						newInvoiceItem.setQuantity(quant);
					}
					break;
				case 7: {
						System.out.println("Eneter the Description of the item");
						input.nextLine();
						String desc = input.nextLine();
						newInvoiceItem.setDescription(desc);
					}
					break;
				case 8: {
						System.out.println("Eneter the price per item");
						input.nextLine();
						double price = input.nextDouble();
						newInvoiceItem.setPricePerItem(price);
					}
					break;
				case 9:
					newInvoiceItem.getInvoice();
					break;
				case 10:
					System.exit(0);
			}
		}		
	}
}
*/

//q2
/*

import java.util.Scanner;

class Employee{

	String fname, lname;
	double monthSalary;

	Employee(){
		fname = "";
		lname = "";
		monthSalary = 0.00d;
	}

//get methods
	//1
	String getFname(){
		return fname;
	}
	//2
	String getLname(){
		return lname;
	}
	//3
	double getMonthSalary(){
		return monthSalary;
	}

//set methods
	//4	
	void setFname(String name){
		fname = name;
	}
	//5
	void setLname(String name){
		lname = name;
	}
	//6
	void setMonthSalary(double salary){
		monthSalary = salary;
	}

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		Employee Emp1 = new Employee();
		Employee Emp2 = new Employee();

		while (true){
		//comand line interface for options
			System.out.println("Use the appropriate function numbers to carry out the respective functionalities.");
			System.out.println("1.Get Fname			2.Get Lname \n3.view yearly Salary");
			System.out.println("4.Set Fname 			5.Set Lname \n6.Set Monthly Salary");
		// user selection of the necessary function to carry on
			int function = input.nextInt();
			input.nextLine();	
		
		//function content
			switch (function){
				case 1:{
					System.out.println("Select the employee: 1.Emp1 \n 2.Emp2");
					int Emp = input.nextInt();
					input.nextLine();		
					if (Emp ==1){
						System.out.println("Emp1 fname: "+Emp1.getFname() );				
					}
					else if (Emp ==2){
						System.out.println("Emp2 fname: "+Emp2.getFname() );				
					}
					break;
					}
				case 2:{
					System.out.println("Select the employee: 1.Emp1 \n 2.Emp2");
					int Emp = input.nextInt();
					input.nextLine();		
					if (Emp ==1){
						System.out.println("Emp1 lname: "+Emp1.getLname() );				
					}
					else if (Emp ==2){
						System.out.println("Emp2 lname: "+Emp2.getLname() );				
					}
					break;
					}
				case 3:{
					System.out.println("Select the employee: 1.Emp1 \n 2.Emp2");
					int Emp = input.nextInt();
					input.nextLine();		
					if (Emp ==1){
						System.out.println("Emp1 annual salary: "+Emp1.getMonthSalary()*12 );				
					}
					else if (Emp ==2){
						System.out.println("Emp2 annual salary: "+Emp2.getMonthSalary()*12 );				
					}
					break;
					}
				case 4:{
					System.out.println("Select the employee: 1.Emp1 \n 2.Emp2");
					int Emp = input.nextInt();
					input.nextLine();
					System.out.println("enter the intended fname:");	
					String Fname = input.nextLine();
					if (Emp ==1){
						Emp1.setFname(Fname);				
					}
					else if (Emp ==2){
						Emp2.setFname(Fname);				
					}
					break;
					}
				case 5:{
					System.out.println("Select the employee: 1.Emp1 \n 2.Emp2");
					int Emp = input.nextInt();
					input.nextLine();
					System.out.println("enter the intended lname:");
					String Lname = input.nextLine();
					if (Emp ==1){
						Emp1.setLname(Lname);				
					}
					else if (Emp ==2){
						Emp2.setLname(Lname);				
					}
					break;
					}
				case 6:{
					System.out.println("Select the employee: 1.Emp1 \n 2.Emp2");
					int Emp = input.nextInt();
					input.nextLine();
					System.out.println("enter the intended monthly salary:");	
					double Salary = input.nextDouble();
					if (Emp ==1){
						Emp1.setMonthSalary(Salary);				
					}
					else if (Emp ==2){
						Emp2.setMonthSalary(Salary);				
					}
					break;
					}
			}
						
		}	
	}
}

*/

//q3
/*
import java.util.Scanner;

class Date{
	
	int day, month, year;


	Date(int d, int m, int y){
		day = d;		
		month = m;
		year =y;
	}

// get methods
	//1
	void getDay(){
		System.out.println("date : "+day);
	}

	//2
	void getMonth(){
		System.out.println("month : "+month);
	}
	//3
	void getYear(){
		System.out.println("year : "+year);
	}

//Set methods
	//4
	void setDay(int d){
		day = d;	
	}

	//5
	void setMonth(int m){
		month = m;	
	}

	//6
	void setYear(int y){
		year = y;	
	}
	//7
	void displayDate(){
		System.out.println("Date  : "+month+"/"+day+"/"+year);
	}

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
			
		
			System.out.println("Enter the date month year respectively, seperated by a space");
			int data_d = input.nextInt();
			int data_m = input.nextInt();
			int data_y = input.nextInt();
			input.nextLine();
			
		//new object creation
			Date MyDate = new Date(data_d, data_m, data_y);
		
		while (true){
		//function selection
			System.out.println("Please select the function you want to perform using the relevant numbers of those functions");
			System.out.println("1. view day	2. view month	3. view year");
			System.out.println("4. set day	5.set month	6.set year");
			System.out.println("7.display Date");
			
			int selection = input.nextInt();
			input.nextLine();
		
			switch (selection){
				case 1:{
					MyDate.getDay();
					break;
					}
				case 2:{
					MyDate.getMonth();
					break;
					}
				case 3:{
					MyDate.getYear();
					break;
					}
				case 4:{
					System.out.println("Please enter the new day:");
					int new_day = input.nextInt();
					MyDate.setDay(new_day);
					break;
					}
				case 5:{
					System.out.println("Please enter the new month:");
					int new_month = input.nextInt();
					MyDate.setMonth(new_month);
					break;
					}
				case 6:{
					System.out.println("Please enter the new year:");
					int new_year = input.nextInt();
					MyDate.setYear(new_year);
					break;
					}
				case 7:{
					MyDate.displayDate();
					break;
					}
			}
		

			

		}
		
	}
}


*/
/*
import java.util.Scanner;

class SavingsAccount{

	static double annualInterestRate= 0;
	private double savingsBalance;


	SavingsAccount(double balance){
		savingsBalance = balance;

	}

	static void modifyInterestRate(double rate){
		annualInterestRate = rate;
		
	}

	double calculateMonthlyInterest(){
		double monthlyInterest = (savingsBalance*annualInterestRate/1200);
		savingsBalance +=monthlyInterest;
		return monthlyInterest;
	}

	public static void main(String args[]){
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(4);
	
		System.out.println("saver1");
		System.out.println("monthly interst = "+saver1.calculateMonthlyInterest() );
		System.out.println("savings balance = "+saver1.savingsBalance);
		System.out.println("----------------------------");

		System.out.println("saver2");
		System.out.println("monthly interst = "+saver2.calculateMonthlyInterest() );
		System.out.println("savings balance = "+saver2.savingsBalance);
		System.out.println("----------------------------");
		
		SavingsAccount.modifyInterestRate(5);
		System.out.println("+++++++++++++");
		
		System.out.println("saver1");
		System.out.println("monthly interst = "+saver1.calculateMonthlyInterest() );
		System.out.println("savings balance = "+saver1.savingsBalance);
		System.out.println("----------------------------");

		System.out.println("saver2");
		System.out.println("monthly interst = "+saver2.calculateMonthlyInterest() );
		System.out.println("savings balance = "+saver2.savingsBalance);
		System.out.println("----------------------------");
		
	}
}
*/


import java.util.Scanner;

class Book{

	String name, ISBNno, author, publisher;
	
	Book(){
		this.name = "";
		this.ISBNno = "";
		this.author = "";
		this.publisher = "";
	}	
	Book (String name, String ISBNno, String author, String publisher){
		this.name = name;
		this.ISBNno = ISBNno;
		this.author = author;
		this.publisher = publisher;
	}
//get mehtods
	String getName(){
		return this.name;
	}

	String getAuthor(){
		return this.author;
	}

	String getISBNno(){
		return this.ISBNno;
	}

	String getPublisher(){
		return this.publisher;
	}

		String setName(){
		return this.name;
	}
//set methods

	void setName(String name){
		this.name = name;
	}

	void setAuthor(String author){
		this.author = author;
	}

	void setISBNno(String ISBNno){
		this.ISBNno = ISBNno;
	}

	void setPublisher(String publisher){
		this.publisher = publisher;
	}

	void getBookInfo(){
		System.out.println( "Name: "+this.name);
		System.out.println( "ISBN no: "+this.ISBNno);
		System.out.println( "Author: "+this.author);
		System.out.println( "Publisher: "+this.publisher);
	}

	public static void main(String args[]){
		
		Book []bookCollectionArray = new Book [30];
		
		for (int i=0; i<bookCollectionArray.length; i++){
			bookCollectionArray[i] = new Book();
		}
		//bookCollectionArray[0] = new Book();
		//bookCollectionArray[1] = new Book();
		
		

		bookCollectionArray[1].setAuthor("dul");
		bookCollectionArray[1].setName("mud");
		bookCollectionArray[1].setPublisher("gaja man");
		bookCollectionArray[1].getBookInfo();
	}
}
























 
