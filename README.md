# java__codes

apache tomcat: admin
password: admin
package Thread;
class Buffer
{
    int Max;
    int[] Queue;
    int[] Queue_id;
    int front,rear,Qsize;
    
    public Buffer(int size)
    {
        Max=size;
        rear=-1;
        front=0;
        Qsize=0;
        Queue=new int[Max];
        Queue_id=new int[Max];
    }
    public synchronized void insert(int ch,int id)
    {
        try
        {
            while(Qsize==Max)
            {
                wait();
            }
            rear=(rear+1)%Max;
            Queue[rear]=ch;
            Queue_id[rear]=id;
            Qsize++;
            System.out.println("Producer wrirting Data "+ch+" and consumer id "+id);
            notifyAll();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public synchronized int delete_id()
    {
        int id=0;
        try
        {
            while(Qsize==0)
            {
                wait();
            }
            id=Queue_id[front];
            notifyAll();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        return id;
    }
    public synchronized int delete()
    {
        int ch=0;
        try
        {
            while(Qsize==0)
            {
                wait();
            }
            ch=Queue[front];
            front=(front+1)%Max;
            Qsize--;
            notifyAll();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        return ch;
    }
}
class Consumer1 extends Thread
{
    Buffer buffer;
    public Consumer1(Buffer b)
    {
        buffer =b;
    }
    @Override
    public void run()
    {
        while(!Thread.currentThread().isInterrupted())
        {
            if(buffer.delete_id()==1)
            {
                int c=buffer.delete();
                System.out.println("Consumer 1 consumes "+c);
            }
        }
    }
}
class Consumer2 extends Thread
{
    Buffer buffer;
    public Consumer2(Buffer b)
    {
        buffer =b;
    }
    @Override
    public void run()
    {
        while(!Thread.currentThread().isInterrupted())
        {
            if(buffer.delete_id()==2)
            {
                int c=buffer.delete();
                System.out.println("Consumer 2 consumes "+c);
            }
        }
    }
}
class Producer extends Thread
{
    Buffer buffer;
    public Producer(Buffer b)
    {
        buffer =b;
    }
    @Override
    public void run()
    {
        for(int c=0;c<6;c=c+2)
        {
            buffer.insert(c,1);
        }
        for(int c=1;c<6;c=c+2)
        {
            buffer.insert(c,2);
        }
    }
}
public class Producer_Consumer 
{
    public static void main(String args[])
    {
        Buffer Q=new Buffer(6);
        Producer prod=new Producer(Q);
        Consumer1 cons1=new Consumer1(Q);
        Consumer2 cons2=new Consumer2(Q);
        prod.start();
        cons1.start();
        cons2.start();
    }
}
