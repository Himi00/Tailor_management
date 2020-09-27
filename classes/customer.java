package classes;
import java.util.Scanner;

public  class customer
{  
   private int  id;	
   private String name;
   private int contact;

  public customer()
    {

    }

 public void setID(Scanner scan)
   {
      System.out.print("Enter User ID:");
      id=scan.nextInt();
   }
   public int getID()
   {
        return id;
   }


  public void setName(Scanner scan)
   {  
      scan.nextLine();
      System.out.print("Enter name:");
      name=scan.nextLine();
   }
   public String getName()
   {
        return name;
   }

   public void setContact(Scanner scan)
   {
      System.out.print("Enter Contact Number:");
      contact=scan.nextInt();
   }
   public int getContact()
   {
        return contact;
   }



}