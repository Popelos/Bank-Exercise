
package bank;

import java.util.Scanner;


public class Person {
    
    private String name;
    private int age;
    BankAccount account = new BankAccount();
    Scanner sc = new Scanner(System.in);
    
    
    public Person(){
        
    }                // Contructos                          
    public Person(String name){
        this.name= name;
    }
    public Person(String name,int age){
        this.name= name;
        this.age = age;
    }
    public Person(String name,int age, BankAccount account){
        this.name= name;
        this.age = age;
        this.account = account;
    }
    
    public void setName(){
        System.out.print("Input persons name :");
        name = sc.next();
    }         // Getter|Setters
    public void setAge(){
        System.out.println("Input persons age :");
        age = sc.nextInt();
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
