package classes;
import interfaces.*;
import java.util.Scanner;
import fileio.*;
public class bill extends FileReadWrite implements billOperation
{
  private FileReadWrite frwd = new FileReadWrite();

  private int b;
  private int d;
  private String c;
  //private order o=new order();
  public bill()
  {

  }
  public void setB(Scanner scan)
   {
      System.out.print("Enter User ID:");
      b=scan.nextInt();
   }
   public int getB()
   {
        return b;
   } 
   public void setC(Scanner scan)
   {
      System.out.print("Enter status:");
      scan.nextLine();
      c=scan.nextLine();
   }
   public int getC()
   {
        return b;
   } 

   public void setD(Scanner scan)
   {
   	  System.out.print("Enter amount:");
      d=scan.nextInt();
   }
   public int getD()
   {
        return d;
   }
   


  public void writeFile()
  {
	 frwd.writeInFile(b,c,d);

  }
  
  public void readFile()
  {
     frwd.readFromFile();
  }
  public void searchFile(String a)
  {
    //String a=o.getID();
    
    frwd.searchFromFile(a);
  }


}
