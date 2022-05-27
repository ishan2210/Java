

public class deadlock
{
    public static void main(String args[])
    {
        final String resource1="Ishan Kansara";
        final String resource2="Dhruv Kansara";
        Thread t1=new Thread()
        {
            @Override
            public void run()
            {
                synchronized(resource1)
                {
                    System.out.println("Thread 1: lock resource 1");
                    
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    synchronized(resource2)
                    {
                        System.out.println("Thread 1: lock resourc 2");
                    }
                }
            }
        };
        Thread t2=new Thread()
        {
            @Override
          public void run()
          {
              synchronized(resource2)
              {
                  System.out.println("Thread 2: Lock resource 2");
                  try
                  {
                      Thread.sleep(100);
                  }
                  catch(Exception e)
                  {
                      
                  }
                  synchronized(resource1)
                  {
                      System.out.println("Thread 2: Lock resource 1");
                  }
              }
          }
        };
        t1.start();
        t2.start();
    }
}