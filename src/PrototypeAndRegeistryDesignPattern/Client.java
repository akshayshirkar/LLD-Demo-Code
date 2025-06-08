package PrototypeAndRegeistryDesignPattern;

import java.util.Date;

public class Client {

    public static void doSomething(Opportunity oppRef1){
       //Account acc2 = (Account) acc.clone();
        Opportunity oppRef2 = oppRef1.clone();
    }

    public static void main(String[] args) {
//        Account accRef = new Account();
//        accRef.accountName = "John Doe";
//        accRef.employeeSize = 100;
//        accRef.industry = "Industrial";
//        accRef.isActive = true;
//
//        doSomething(accRef);

        businessOpportunity oppRef = new businessOpportunity();
        oppRef.amount = 100;
        oppRef.name = "Opportunity";
        oppRef.closeDate = new Date();
        oppRef.stageName = "Opportunity";
        oppRef.isBusiness = true;

        doSomething(oppRef);

    }
}
