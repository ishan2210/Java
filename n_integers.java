
package FileProgramming;

class NegativeException extends Exception
{
    NegativeException(String msg)
    {
        super(msg);
    }
}
class DivideByTen extends Exception
{
   DivideByTen(String msg)
   {
       super(msg);
   }
}
class ThousandNumber extends Exception
{
    ThousandNumber(String msg)
    {
        super(msg);
    }
}
class AboveSevenThousand extends Exception
{
    AboveSevenThousand(String msg)
    {
        super(msg);
    }
}
public class n_integers {
    public static void main(String args[]) throws Exception
    {
        int numbers[]=new int[5];
        for(int i=0;i<5;i++)
        {
            numbers[i]=Integer.parseInt(args[i]);
        }
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            try
            {
                if(numbers[i]<0)
                {
                    throw new NegativeException("NegativeException");
                }
                if(numbers[i]%10==0)
                {
                    throw new DivideByTen("Number divisible by ten");
                }
                if(numbers[i]>1000||numbers[i]<2000)
                {
                    throw new ThousandNumber("Number is between thousand and 2000");
                }
                if(numbers[i]>7000)
                {
                    throw new AboveSevenThousand("Number above 7000");
                } 
            }
            
            
            catch(NegativeException e)
            {
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
            catch(DivideByTen e)
            {
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
            catch(ThousandNumber e)
            {
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
            catch(AboveSevenThousand e)
            {
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
        }
        for(int i=0;i<numbers.length;i++)
        {
            sum=sum+numbers[i];
            System.out.println("Sum of Numbers is-->"+sum);
        }
    }
}
