/*
//serialization of a class - makes it possible to be written in stream
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}
*/
/*
//java example for serialization and deserilaization

//exceptions
import java.io.IOException;
import java.io.EOFException;

//streams
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//buffered streams
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//interface serelializable inorder to create stream using object
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}

	public static void main (String args[]) throws IOException, ClassNotFoundException{
	
	//creating objects in Student class
		Student namal = new Student(01, "Namal");
		Student rohan = new Student(02, "Rohan");
		
	//writting the object to a file
		ObjectOutputStream fout = null;
		try{
			fout = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream("Test_serializable.txt") ) );
			fout.writeObject(namal);
			fout.writeObject(rohan);
		}
		catch(ClassNotFoundException e){
			System.out.println("wrong class: WRITE operation failed");
		}
		catch(ClassNotFoundException e){
			System.out.println("File not found to write: WRITE operation failed");
		}
		System.out.println("Write operation successful");
		if(fout != null){
			fout.close();
		}
		
	//retrieving object from the file
		ObjectInputStream fin = null;
		Student readNamal = null;
		Student readRohan = null;
		
		try{
			fin = new ObjectInputStream( new BufferedInputStream( new FileInputStream("Test_serializable.txt") ) );
			while(true){
				readNamal = (Student) fin.readObject();
				readRohan = (Student) fin.readObject();
			}
			
		}
		catch(EOFException e){
			System.out.println("reached reading the end of the file");
		}
		catch(IOException ex){
			System.out.println("File not found to reade: READ operation failed");
		}
		catch(ClassNotFoundException e){
			System.out.println("wrong class: READ operation failed");
		}
		finally{
			System.out.println("id: "+readNamal.id+" | name: "+readNamal.name);
			System.out.println("id: "+readRohan.id+" | name: "+readRohan.name);
			if (fin != null){
				fin.close();
			}
		}
	}
}	
	
*/
/*
//example - serialization with aggregation - if it is to be serilaizable all references must also be serializable else NotSerializableException is thrown

import java.io.Serializable;
import java.io.*;


class Address{
	String addressLine, City, state;
	static String company = "Muthukumarana";
	
	public Address(String addressLine, String city, String state){
		this.addressLine = addressLine;
		this.City = city;
		this.state = state;
	}
}	

class Student implements Serializable{
	int id;
	String name;
	Address address;
	
	public Student(int id, String name,Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
		
	public static void main (String args[]) throws IOException, ClassNotFoundException{
			
	//class instances of Student
		Address address1 = new Address("1","2","3");
		Student namal = new Student(01, "Namal", address1);
		Address address2 = new Address("4","5","6");
		Student rohan = new Student(02, "Rohan",address2);
	
		ObjectOutputStream fout = null;
		
		try{
			fout  = new ObjectOutputStream( new FileOutputStream("Test_serializable.txt") );
			while (true){
				fout.writeObject(namal);
				fout.writeObject(rohan);
				//fout.writeUTF(company);
			}
		}
		catch(Exception e){
			//System.out.println(namal.id+" "+namal.name+" "+namal);
			//System.out.println(namal.address.addressLine+" "+namal.address.City+" "+namal.address.state);
			//System.out.println(rohan.id+" "+rohan.name);
			//System.out.println(rohan.address.addressLine+" "+rohan.address.City+" "+rohan.address.state);
			//System.out.println(this.company); // staic variable
			System.out.println(e);
			fout.close();
		}
		
		
		//read the contents of the file
			
		ObjectInputStream fin =null;
		Student readNamal=null, readRohan = null;
		Address address;
		try{
			fin  = new ObjectInputStream( new FileInputStream("Test_serializable.txt") );
			while (true){
				readNamal = (Student) fin.readObject();
				readRohan = (Student) fin.readObject();
				//fout.writeUTF(company);
			}
		}
		catch(Exception e){
			System.out.println("caught it :"+e);
			//System.out.println(readNamal.id+" "+readNamal.name+" "+readNamal);
			//System.out.println(readNamal.address.addressLine+" "+readNamal.address.City+" "+readNamal.address.state);
			//System.out.println(readRohan.id+" "+readRohan.name);
			//System.out.println(readRohan.address.addressLine+" "+readRohan.address.City+" "+readRohan.address.state);
			//System.out.println(this.company); // staic variable
			fin.close();
		}
		
	}
}	
	
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



