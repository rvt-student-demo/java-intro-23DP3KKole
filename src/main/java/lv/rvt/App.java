package lv.rvt;

import java.io.BufferedReader;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //BufferedReader reader = Helper.getReader("persons.csv");

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();

        counter.decrement();
        counter.printValue();
    }
}
