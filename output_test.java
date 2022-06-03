package FileProgramming;


public class output_test {
    public static void main(String args[])
    {
        try
        {
            System.out.println("Calling method a");
            a();
            System.out.println("return from method a");
        }
        catch(ArithmeticException e)
        {
            System.out.println("main:catch");
        }
        finally
        {
            System.out.println("main:finally");
        }
        public static void a()
        {
            try
            {
                int x=8,y=0;
                int z=x/y;
                System.out.println("Value of z is-->"+z);
            }
            catch(NumberFormatException e)
            {
               System.out.println("method a:catch");
            }
            finally
            {
                System.out.println("method a:finally");
            }
        }
    }

