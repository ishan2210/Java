# java__codes

package Synchronization;
class sync1 
{
    void printable(int n)
    {
        synchronized(this)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+"*"+i+"="+(n*i));
                try
                {
                    Thread.sleep(200);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class Thread3 extends Thread
{
    sync1 obj;
    public Thread3(sync1 obj) {
        this.obj = obj;
    }
    @Override
    public void run()
    {
        obj.printable(5);
    }
}
class Thread4 extends Thread
{
    sync1 obj;
    public Thread4(sync1 obj) {
        this.obj = obj;
    }
    @Override
    public void run()
    {
        obj.printable(10);
    }
}
public class Synchronized_Block 
{
    public static void main(String args[])
    {
       sync1 obj=new sync1();
       Thread3 A1=new Thread3(obj);
       Thread4 A2=new Thread4(obj);
       
       A1.start();
       A2.start();
    }
}
