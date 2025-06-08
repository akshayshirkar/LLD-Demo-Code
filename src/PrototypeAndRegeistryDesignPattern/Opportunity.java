package PrototypeAndRegeistryDesignPattern;

import java.util.Date;

public class Opportunity {
    Integer amount;
    String name;
    Date closeDate;
    String stageName;

    public Opportunity(){

    }

    // This is copy constructor
    public Opportunity(Opportunity oppRef){
        this.amount = oppRef.amount;
        this.name = oppRef.name;
        this.closeDate = oppRef.closeDate;
        this.stageName = oppRef.stageName;
    }

    public Opportunity clone(){
        return new Opportunity(this);
    }

}
