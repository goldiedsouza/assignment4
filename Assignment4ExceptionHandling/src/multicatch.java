
public class multicatch {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }
        {
            System.out.println("ArithmeticException :divide by 0");
        }
	}
}
