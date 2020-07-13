
package bank;

public class Bank {

    public static void main(String[] args) {
        
        BankAccount bA1 = new BankAccount("account1", 2143, 500);  // Exercise one
        BankAccount bA2 = new BankAccount("account2", 2144, 1000);
        BankAccount bA3 = new BankAccount("account3", 2145, 2000);
        
        
        bA1.deposit(40);    // Will add this ammount to the account
        bA1.deposit(50);
        bA1.withdraw(3000); // Will ask for new amount (insuficinet balance)
        bA1.withdraw(90);   // Will withdraw this amount
        
        bA1.printTranasctions(); // prints transactions made within the account
        bA2.printTranasctions(); // print message for empty account
        
        int x = BankAccount.accountsOpened;   // Account counter 
        System.out.println(x+" accounts have been created in total!");
        
        if (bA1.getStatus())                 // Check if account is active (not part of the exercise)
            System.out.println(bA1.getName()+" is active ");
        else
            System.out.println(bA1.getName()+" is inactive ");
        
        
        // Exercise two
        
        
        Person p1 = new Person("Bary",22,bA1);
        Person p2 = new Person("Mary",21,bA2);
        Person p3 = new Person("Lary",30,bA3);
        
        System.out.println("Bary has "+bA1.getAmount()+ " $ in his account");
        
        System.out.println("Mary had "+p2.account.getAmount() + " $ before she got married");
        
        
        
        
    }
    
    
    
    
}
