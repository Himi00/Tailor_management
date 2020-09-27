package classes;
import interfaces.*;
 public class tailor implements customerOperations, orderOperation
{
    
    public profile c[]=new profile[10];
    private order o3[]=new order[10];     
    public tailor()
    {
      
    }


public void addCustomer(profile cc )
{
      int count=0;
      for(int i=0; i<c.length;  i++)
      { 
        if(c[i]==null)
        {
          c[i]=cc;
          count=1;
          break;
        }
      }
      if (count==1)
      {
      	System.out.println("Customer has Created");
      }
      else
      {
     	System.out.println("Customer has not Created");

      }




}
public void showAllCustomers()
{
 for(int i=0; i<c.length; i++)
      {
           if(c[i]!=null)
           {
         System.out.println("User ID:"+c[i].getID());
         System.out.println("Name:"+c[i].getName());
           System.out.println("Contact Number:"+c[i].getContact());
            System.out.println("Gender:"+c[i].getGender());
           System.out.println("Address:"+c[i].getAddress());
          
           System.out.println("");
        }   
      
      }




}

public void placeOrder(order o2 )
{
      

    int count=0;

      for(int i=0; i<o3.length;  i++)
      { 
      	try
          {
             if(c[i].getID()==o2.getID())
               {	

                   if(o3[i]==null)
                    {
          
                       o3[i]=o2;
             
                       System.out.println(" "); 	
          	           System.out.println("customer found");
          	           count=1;
          	           if (count==1)
                        {  
              	
      	                     System.out.println("order placed");
      	                     System.out.println(" ");
           
                        }
             
                        break;
             
             
                     }
                }
           }          
          catch(Exception e)
          { 
          	System.out.println(" ");
          	System.out.println("customer not found");
     	    System.out.println("order has not placed");
     	    System.out.println(" ");

     	    break;
          }
          
       }
 }

      


 


 public void showAllOrders()
 {

 for(int i=0; i<o3.length; i++)
      {
           if(o3[i]!=null)
           {
         System.out.println("User ID:"+o3[i].getID());
         System.out.println("Name:"+o3[i].getName());
           System.out.println("Chest size:"+o3[i].getchestSize());
            System.out.println("Waist size:"+o3[i].getwaistSize());
           System.out.println("Length:"+o3[i].getLength());
           System.out.println("Sleeve size:"+o3[i].getsleeveSize());
           System.out.println("Pant size:"+o3[i].getpantSize());
           System.out.println("Neck Size:"+o3[i].getneckSize());
           System.out.println("Cloth Type:"+o3[i].getClothType());
           System.out.println("Item Number:"+o3[i].getItemNum());

          
           System.out.println("");
        }   
      
      }




 }


public void yourOrder( order o4)
{
   for(int i=0; i<o3.length;  i++)
   { 
     try
     {
      if (o3[i].getID()==o4.getID())
       {
           System.out.println("User ID:"+o3[i].getID());
           System.out.println("Name:"+o3[i].getName());
           System.out.println("Chest size:"+o3[i].getchestSize());
           System.out.println("Waist size:"+o3[i].getwaistSize());
           System.out.println("Length:"+o3[i].getLength());
           System.out.println("Sleeve size:"+o3[i].getsleeveSize());
           System.out.println("Pant size:"+o3[i].getpantSize());
           System.out.println("Neck Size:"+o3[i].getneckSize());
           System.out.println("Cloth Type:"+o3[i].getClothType());
           System.out.println("Item Number:"+o3[i].getItemNum());

        break;
       }
      }
      catch(Exception e1)
      {
      	System.out.println("User not found...............");
      	break;
      } 
    }



}



}