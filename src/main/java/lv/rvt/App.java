package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

import org.apache.http.message.BufferedHeader;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = Helper.getReader("persons.csv");

        reader.readLine();
    }
}
