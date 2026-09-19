package com.gdb.domain;

public class Account {
    // TODO: Step 1 - Declare the 6 private fields:
    // - accountNumber (String)
    private String accountNumber;
    // - name (String)
    private String name;
    // - age (int)
    private int age;
    // - balance (double)
    private double balance;
    // - accountType (String)
    private String accountType;
    // - status (String)
    private String status;

    public Account(String accountNumber, String name, int age, double balance, String accountType, String status) {
        // TODO: Step 2 - Initialize instance variables with parameters
        this.accountNumber=accountNumber;
        this.name=name;
        this.age=age;
        this.balance=balance;
        this.accountType=accountType;
        this.status=status;
    }

    public boolean deposit(double amount) {
        // TODO: Step 3 - Validate amount > 0, increase balance, and return true; return false otherwise
        if (amount>0){
            this.balance+=amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        // TODO: Step 4 - Validate amount > 0 and balance >= amount, deduct from balance, and return true; return false otherwise
        if (amount>0){
            if(this.balance>=amount){
                this.balance-=amount;
                return true;
            }
        }
        return false;
    }

    public void displayAccountInfo() {
        // TODO: Step 5 - Print formatted account information (AccountNumber, Name, Age, Balance, AccountType, Status)
        System.out.println("Account Number:" + accountNumber + "\nName:" + name + "\nAge:" + age + "\n Balance" + balance +"\nAccount type" + accountType+ "\n Status" + status);
    }

    // TODO: Step 6 - Declare public getters and setters for all private fields
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(){
        this.accountNumber=accountNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public String getBalance(){
        return balance;
    }
    public void setBalance(){
        this.balance=balance;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setAccountType(){
        this.accountType=accountType;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(){
        this.status=status;
    }

}
