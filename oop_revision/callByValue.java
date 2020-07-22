/*
class Operation{  
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only
 System.out.println(data);  
 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
  
 }  
} 
 */
 
 //sending an object as the value
 class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
 data=data+200;//changes will be in the local variable only
 System.out.println(data);  
 }  
     
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);  
   System.out.println("after change "+op.data);  
  }
  
 }  
