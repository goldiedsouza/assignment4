
public class superclass {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
           }
      
        //superclass of ArithmeticException 
        catch(Exception e){
            System.out.println("divide by 0");
        }
     }
}
