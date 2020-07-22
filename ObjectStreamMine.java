
import java.io.IOException;
import java.io.EOFException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.math.BigDecimal;
import java.util.Calendar;


class ObjectStreamsMine{
 
	static final String fileName ="invoiceObjectdata";

	static final  BigDecimal prices [] =  {
		new BigDecimal("19.99"),
		new BigDecimal("9.99"),
		new BigDecimal("15.99"),
		new BigDecimal("3.99"),
		new BigDecimal("4.99") 
	};
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
		    "Java T-shirt",
		    "Java Mug",
		    "Duke Juggling Dolls",
		    "Java Pin",
		    "Java Key Chain"
	};

	public static void main(String args[]) throws IOException, ClassNotFoundException{
	
		
	//writing the content to a file
		ObjectOutputStream out = null;
		//try{
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName) ));
			Calendar cal = Calendar.getInstance();
			for (int i=0; i<prices.length; i++){ 
				out.writeObject(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
				out.writeObject(cal);	
			}
		//}
		//finally{
			out.close();	
		//}
		
		
	
	//Reading the file content

		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream(fileName) ));
			int unit;
			String desc;
			BigDecimal total = new BigDecimal(0.00);
			BigDecimal price;
			Calendar date = null;
			
			while (true){
				price = (BigDecimal) in.readObject();
				unit = in.readInt();
				desc = in.readUTF();
				total = total.add(price.multiply(new BigDecimal(unit) ));
				date= (Calendar) in.readObject();
				System.out.print("You ordered"+unit+" units of "+desc+" at "+price+" unit rate at a total cost of "+total+" on ");
				System.out.format("%tA, %<tB %<te, %<tY:%n", date);
			}
		}
		catch (EOFException e){}
		finally{
			in.close();	
		}
		



	}
}

