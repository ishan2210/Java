package FileProgramming;
public class repetitive_multiplication {
    public static void main(String args[])
    {
        int x,y,result;
        try
        {
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            result=1;
            System.out.println("\n Exponential Operation..");
            for(int i=0;i<y;i++)
            {
                result=result*x;
                System.out.println(x+"^"+y+"="+result);  
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Exception:"+e);
        }
    }
}
