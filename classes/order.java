package classes;

import java.util.Scanner;

public class order extends customer
{  

   private int chestSize;
   private int waistSize;
   private int length;
   private int sleeveSize;
   private int pantSize;
   private int neckSize;

   private String clothType;
   private int itemNum;

   public order()
    {

    }
   public void setchestSize(Scanner scan)
   {  
      scan.nextLine();
      System.out.print("Enter Your Chest Size:");
      chestSize=scan.nextInt();
   }
   public int getchestSize()
   {
        return chestSize;
   }


   public void setwaistSize(Scanner scan)
   {  
      System.out.print("Enter Your Waist Size:");
      waistSize=scan.nextInt();
   }
   public int getwaistSize()
   {
        return waistSize;
   }


   public void setLength(Scanner scan)
   {  
      System.out.print("Enter Your length:");
      length=scan.nextInt();
   }
   public int getLength()
   {
        return length;
   }

    public void setsleeveSize(Scanner scan)
   {  
      System.out.print("Enter Your sleeve Size:");
      sleeveSize=scan.nextInt();
   }
   public int getsleeveSize()
   {
        return sleeveSize;
   }


   public void setpantSize(Scanner scan)
   {  
      System.out.print("Enter Your pant length Size:");
      pantSize=scan.nextInt();
   }
   public int getpantSize()
   {
        return pantSize;
   }

   public void setneckSize(Scanner scan)
   {  
      System.out.print("Enter Your neck Size:");
      neckSize=scan.nextInt();
   }
   public int getneckSize()
   {
        return neckSize;
   }


   public void setClothType(Scanner scan)
   {       
      scan.nextLine();
      System.out.print("Enter  ClothType:");
      clothType=scan.nextLine();
   }
   public String getClothType()
   {
        return clothType;
   }


   public void setItemNum(Scanner scan)
   {  
      System.out.print("Enter Item Number: ");
      itemNum=scan.nextInt();
   }
   public int getItemNum()
   {
        return itemNum;
   }

 



}