package PrototypeAndRegeistryDesignPattern;

public class businessOpportunity extends Opportunity {
    boolean isBusiness;
    public businessOpportunity(){

    }

    public businessOpportunity(businessOpportunity ref){
        super(ref);
        this.isBusiness=ref.isBusiness;
    }

    @Override
    public businessOpportunity clone(){
        return new businessOpportunity(this);
    }

}
