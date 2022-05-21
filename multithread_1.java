package Multi_threading;
class Thread_1 extends Thread
{
    @Override
    public void run()
    {
        try
        {
           for(int i=1;i<=5;i++)
           {
               System.out.println("Value of i is-->"+i);
               Thread.sleep(2000);
           }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class multithread_1 {
    public static void main(String args[])
    {
        Thread_1 obj=new Thread_1();
        obj.start();
    }
}




