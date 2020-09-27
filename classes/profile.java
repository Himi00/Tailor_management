package classes;

import java.util.Scanner;

public class profile extends customer
{  
   private String gender;
   private String address;  

   public profile()
    {

    }

 public void setGender(Scanner scan)
   {   
      scan.nextLine();
      System.out.print("Enter Your Gender:");
      gender=scan.nextLine();
   }
   public String getGender()
   {
        return gender;
   }


  public void setAddress(Scanner scan)
   {  

      System.out.print("Enter Your Address:");
      address=scan.nextLine();
   }
   public String getAddress()
   {
        return address;
   }

  



}