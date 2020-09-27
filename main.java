import classes.*;
import interfaces.*;
import java.util.Scanner;

public class main 
{

public static void main(String[] args)  
{   
   int flag =0;
   tailor t=new tailor();
   profile p1[]=new profile[10];
   order o1[]=new order[10];
   bill b=new bill();
   boolean j=false;
   do{

        System.out.println("1. Tailor Management.");
        System.out.println("2. Customer Management.");
        System.out.println("3. Order Management.");
        System.out.println("4. Exit.");

	      Scanner sc = new Scanner(System.in);
    
        int a;
        System.out.print("what do you want to do? :");
        a=sc.nextInt();
        sc.nextLine();

        switch(a)
        {
          case 1: 
                int x;
                System.out.println("This is Tailor Management");
                System.out.println("1. Customer list.");
                System.out.println("2. Order list.");
                System.out.println("3. Create delivery status.");
                System.out.println("4. Delivery and bill history.");
                System.out.println("5. BACK.");
                System.out.print("what do you want to do? : ");
                x=sc.nextInt();
                sc.nextLine();
             
                switch(x)
                {
                   case 1:

                          System.out.println("1. Customer list.");
                          t.showAllCustomers();
                          break;
                
                   case 2:
                
                          System.out.println("2. Order list.");    
                          System.out.println(" ");
                          t.showAllOrders();
                          break;

                   case 3:

                          System.out.println("3. Create delivery status and bill.");
                          b.setB(sc);
                          b.setC(sc);
                          b.setD(sc);
                          b.writeFile();
                          break;   
                
                   case 4:

                          System.out.println("4. Delivery and bill history.");
                          b.readFile();
                          break;
                 }

          break;

          case 2: 
                int y;
                System.out.println("This is Customer Management");
                System.out.println("1. Create profile.");
                System.out.print("what do you want to do? :");
                y=sc.nextInt();
                sc.nextLine();
            
                switch(y)
                {
                 
                   case 1:
                   
                          for( int i=0 ;i<p1.length;i++)
                          {
                  
                            p1[i]=new profile();
                            p1[i].setID(sc);
                            p1[i].setName(sc);
                            p1[i].setContact(sc);
                            p1[i].setGender(sc);
                            p1[i].setAddress(sc);
                            t.addCustomer(p1[i]);
                            flag=1;
                            break;

                          }
                   break;  
                }
                break;

          case 3: 
                int z;
                System.out.println("This is Order Management");
                System.out.println("1. Give Your Measurement.");
                System.out.println("2. See Your order.");
                System.out.println("3. See Your Status and bill.");
                System.out.print("what do you want to do? :");

                z=sc.nextInt();
                sc.nextLine();
            
             
                switch(z)
                {
                   case 1:
  
                          System.out.println("  Give Measurement Here.");
                          System.out.println(" ");

                          for( int i=0 ;i<o1.length;i++)
                          { 

                            o1[i]= new order();
                            o1[i].setID(sc);
                            o1[i].setName(sc);
                            o1[i].setContact(sc);
                            o1[i].setchestSize(sc);
                            o1[i].setwaistSize(sc);
                            o1[i].setLength(sc);
                            o1[i].setsleeveSize(sc);
                            o1[i].setpantSize(sc);
                            o1[i].setneckSize(sc);
                            o1[i].setClothType(sc);
                            o1[i].setItemNum(sc);
                            t.placeOrder(o1[i]);
                            flag=1;
                            break;
                          }  
                   break;
                
                   case 2:

                          order o=new order();
                          o.setID(sc);
                          System.out.println("  ");
                          System.out.println("  Your Order .");
                          System.out.println(" ");
                          t.yourOrder(o);
                          break;

                   case 3 : 
                          String d;
                          System.out.println("3. See Your Ststus and bill.");      
                          System.out.print("Enter user id:");
                          d=sc.nextLine();
                          System.out.println("");
                          b.searchFile(d);
                          System.out.println("");
                          break;
                }
          break;
              
          case 4 :

            j=true;
            break;
        }

     } while(!j);

  }

}
