//Tut-place the generic catch block at the end
public class gencatch {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[4]=5/0;  
               } 
                catch(ArithmeticException e)
              {
                System.out.println("Not allowed baby!");
              }    
               catch(Exception e) 
               {  
              System.out.println("There is an exception");  
                }   
              finally
              {
                System.out.println("Execute Nverthless");
              }  
    }  
}  