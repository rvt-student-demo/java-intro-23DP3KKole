package lv.rvt;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //BufferedReader reader = Helper.getReader("persons.csv");
        
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }
}
