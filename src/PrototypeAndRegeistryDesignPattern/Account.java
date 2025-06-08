package PrototypeAndRegeistryDesignPattern;

public class Account implements Prototype {
    Integer employeeSize;
    String accountName;
    String industry;
    boolean isActive;

    public Account(){

    }

    public Account(Account acc) {
        this.employeeSize = acc.employeeSize;
        this.accountName = acc.accountName;
        this.industry = acc.industry;
        this.isActive = acc.isActive;
    }

    public Account clone(){
        return new Account(this);
    }

}
