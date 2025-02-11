package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory(); 
        this.history.add(initialBalance);
    }

    @Override

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: "  + this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Avarage: " + this.history.average());
    }


    public String history(){
        return this.history.toString();
    }
}
