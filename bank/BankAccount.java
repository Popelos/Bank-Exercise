
package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    
    private int number;
    private double amount;
    private String name;
    private Boolean active;
    private ArrayList<String> transactions = new ArrayList();
    static int accountsOpened;
    Scanner sc = new Scanner(System.in);
    
    
    
    public BankAccount(){
        accountsOpened ++;
        active = true;
    }                 // Contructors
    public BankAccount(String name, int number){
        this();
        this.name = name;
        this.number=number;
    }
    public BankAccount(String name, int number, double amount){
        this();
        this.name = name;
        this.number=number;
        this.amount= amount;
    }
    
    public void deposit(double amount){
        this.amount += amount;
        transactions.add(amount+" deposit");
    }   // Deposit|Withdraw
    public void withdraw(double amount){
        while (amount>this.amount){
            System.out.println("Insufficient balance");
            System.out.print("Enter new amount :");
            amount = sc.nextDouble();
        }
        this.amount -= amount;
        transactions.add(amount+" withdraw");
    }
    public void printTranasctions(){
        
        if (transactions.isEmpty()){ // Check if arraylist is empty
            System.out.println("No transations on " +name);
        }else{
            for (int i=0; i<transactions.size(); i++)
            System.out.println(transactions.get(i));}
    }      // Pring tranasctions
    
    public void setName(){
        System.out.println("input accounts name: ");
        name = sc.next();
    }                // Getter|Setters
    public void setNumber(){
        System.out.println("input accounts number: ");
        number = sc.nextInt();
    }                
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public double getAmount(){
        return amount;
    }
    public ArrayList getTransactions(){
        return transactions;
    }
    public Boolean getStatus(){
        return active;
    }
}
