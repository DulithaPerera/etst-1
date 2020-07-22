
/*

//Byte Stream example

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyBytes{
	public static void main(String args[]) throws IOException{
				
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("Outagain.txt");
			int c;

			while ( (c = in.Reader() ) != -1 ){
				out.Writer(c);
			}
		}
		finally{
			if (in != null){
				in.close();
			}		
			if (out != null){
				out.close();			
			}
		}
	}
}
*/
/*
//Character stream example

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyCharacter{

	public static void main(String args[]) throws IOException{
		
		FileReader in = null;
		FileWriter out = null;
		int c;
	
		in = new FileReader("xanadu.txt");
		out = new FileWriter("Outgain.txt");
		
		while((c = in.read() ) != -1){
			out.write(c);
		}
		
		//closing streams
		if (in != null){
			in.close();
		}
		if (out != null){
			out.close();
		}
	}
}
*/
/*
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

class CopyLines{

	public static void main(String args[]) throws IOException{
		
		BufferedReader in = null;
		PrintWriter out = null;
	
		try{
			in = new BufferedReader( new FileReader("xanadu.txt"));
			out = new PrintWriter(new FileWriter("Outgain.txt"));
			String l;

			while ((l=in.readLine() ) != null){
				out.println(l);
			}

			
		}
		finally{
			//closing the streams
			if (in != null){
				in.close();
			}
			if (out != null){
				out.close();
			}
		}
	}
}

*/
/*	
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class ScanXan{
	
	public static void main(String args[]) throws IOException{
	
		Scanner scan = null;

		try{
			BufferedReader input = new BufferedReader(new FileReader("Outgain.txt") );
			scan = new Scanner(input);
			scan.useDelimiter(",");
			//PrintWriter output = new PrintWriter (new FileWriter("Outgoing.txt") );
	
			while (scan.hasNext() ){
				System.out.println(scan.next() );
			}
		}
		finally{
			if (scan != null){
				scan.close();
			}
		}			
	}
}
*/
/*
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Locale;

class ScanSum{

	public static void main(String args[]) throws IOException{

		Scanner scan = null;
		
		try{
			scan = new Scanner( new BufferedReader( new FileReader("usnumbers.txt") ) );
			scan.useLocale(Locale.US);
			double sum = 0.0d;
			while (scan.hasNextDouble() ){
				sum +=scan.nextDouble();
			}
			System.out.println("sum: "+sum);
		}
		finally{
			if (scan != null){
				scan.close();
			}		
		}	
	}
}
*/
/*
class Root{

	public static void main(String args[]){

		int i=2;
		double r = Math.sqrt(i);

		System.out.print("The square root of ");
		System.out.print(i);
		System.out.print(" is ");
		System.out.print(r);
		System.out.println(".");

		i = 5;
		r = Math.sqrt(i);
       	 	System.out.println("The square root of " + i + " is " + r + ".");
		
	}
}
*/
/*
class Root1{

	public static void main(String args[]){

		int i = 23002;
       		double r = Math.sqrt(i);
		int month = 6;
        
        	System.out.format("The square root of %d is %f.%n", 12, r);
		System.out.format("The square root of %x is %f.%n", i,  r);
		System.out.format("This month is %tB %n", month);
	}	
}
*/
/*
class Format {
    public static void main(String[] args) {
        //System.out.println(System.console());
	System.console();
    }
}
*/
/*
import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

class Password {
    
    public static void main (String args[]) throws IOException {

        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String login = c.readLine("Enter your login: ");
        char [] oldPassword = c.readPassword("Enter your old password: ");

        if (verify(login, oldPassword)) {
            boolean noMatch;
            do {
                char [] newPassword1 = c.readPassword("Enter your new password: ");
                char [] newPassword2 = c.readPassword("Enter new password again: ");
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    c.format("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                    c.format("Password for %s changed.%n", login);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }

        Arrays.fill(oldPassword, ' ');
    }
    
    // Dummy change method.
    static boolean verify(String login, char[] password) {
        // This method always returns
        // true in this example.
        // Modify this method to verify
        // password according to your rules.
        return true;
    }

    // Dummy change method.
    static void change(String login, char[] password) {
        // Modify this method to change
        // password according to your rules.
    }
}
*/
/*
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

class NextInteger_check{

	public static void main (String args[])throws IOException{
		Scanner in = null;


		in  = new Scanner( new BufferedReader( new FileReader("xanadu.txt") ) );
		int i=0;
		int sum =0;
		while (in.hasNext() ){
				//System.out.print(in.next());
			if (in.hasNextInt()){
				i = in.nextInt();
				//sum = sum+in.nextInt();
				System.out.print(i+" ");
			}
			else{
				in.next();			
			}
		}
		System.out.println(sum);

		if (in != null){
			in.close();
		}	
	}
}
*/
/*
import java.io.IOException;
import java.io.EOFException;

import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

class DataStream{
	
	static final String dataFile = "invoicedata";

	static final double prices [] =  {19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};

	public static void main (String args[]) throws IOException{
		
		DataOutputStream out = null;

		out = new DataOutputStream( new BufferedOutputStream ( new FileOutputStream(dataFile) ));
		
		for (int i=0; i<prices.length; i++){
			out.writeDouble(prices[i]);
			out.writeInt(units[i]);
			out.writeUTF(descs[i]);
		}

		if (out !=null){
			out.close();
		}
	}
}


class ReadDataStream{
		
	static final String fileName = "invoicedata";
	
	public static void main (String args[]) throws IOException{

		double price;
		int unit;
		String desc;
		double total = 0.0;
			
		DataInputStream in = null;

		in = new DataInputStream( new BufferedInputStream( new FileInputStream(fileName) ));

		try{
		 	while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d" + " units of %s at $%.2f%n",unit, desc, price);
				total += unit * price;
			}
		}
		catch (EOFException e) {
		}
	}

}
*/

import java.io.*;
import java.math.BigDecimal;
import java.util.Calendar;

class ObjectStreams {
    static final String dataFile = "invoicedata";

    static final BigDecimal[] prices = { 
        new BigDecimal("19.99"), 
        new BigDecimal("9.99"),
        new BigDecimal("15.99"),
        new BigDecimal("3.99"),
        new BigDecimal("4.99") };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = { "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain" };

    public static void main(String[] args) 
        throws IOException, ClassNotFoundException {

 
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new
                    BufferedOutputStream(new FileOutputStream(dataFile)));

            out.writeObject(Calendar.getInstance());
            for (int i = 0; i < prices.length; i ++) {
                out.writeObject(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } finally {
            out.close();
        }

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));

            Calendar date = null;
            BigDecimal price;
            int unit;
            String desc;
            BigDecimal total = new BigDecimal(0);

            date = (Calendar) in.readObject();

            System.out.format ("On %tA, %<tB %<te, %<tY:%n", date);

            try {
                while (true) {
                    price = (BigDecimal) in.readObject();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d units of %s at $%.2f%n",
                            unit, desc, price);
                    total = total.add(price.multiply(new BigDecimal(unit)));
                }
            } catch (EOFException e) {}
            System.out.format("For a TOTAL of: $%.2f%n", total);
        } finally {
            in.close();
        }
    }
}






















