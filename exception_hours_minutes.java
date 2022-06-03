package FileProgramming;

import java.lang.Exception;
import java.io.*;
import java.util.*;

class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
class Clock
{
    private int hour;
    private int minute;
    public void input()throws IOException, MyException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n Enter the Time in hh:mm format");
        String str=br.readLine();
        StringTokenizer tokn=new StringTokenizer(str,":");
        String h=tokn.nextToken();
        String m=tokn.nextToken();
        hour=Integer.parseInt(h);
        minute=Integer.parseInt(m);
        try
        {
            System.out.println("Hour:"+hour);
            if((hour<0||hour>24))
            {
                throw new MyException("FatalError:Invalid Hour");
            }
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            System.out.println("Minute:"+minute);
            if(minute<0||minute>59)
            {
                throw new MyException("FatalError:Invalid Minute");
            }     
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
            
}
public class exception_hours_minutes {
    public static void main(String args[]) throws Exception
    {
        Clock c=new Clock();
        c.input();
    }
}
