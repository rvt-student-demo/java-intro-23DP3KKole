package lv.rvt;

public class Account {
    private String owner;
    private Double balance;

    public Account(String owner, Double balance){
        this.owner = owner;
        this.balance = balance; 
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double balance(){
        return balance;
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }

    public void printAccount(){
        System.out.println("Owner of the account: " + this.owner + ". Balance of the account: " + this.balance());
    }

    
}