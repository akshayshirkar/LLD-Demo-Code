package BuilderDesignPattern;

public class Builder {
    String name;
    String industry;
    String rating;
    boolean isActive;
    Integer totalOpportunityAmount;

    public Builder setName(String name){
        this.name = name;
        return this;

    }
    public Builder setIndustry(String industry){
        this.industry = industry;
        return this;

    }

    public Builder setRating(String rating){
        this.rating = rating;
        return this;
    }

    public Builder setIsActive(boolean isActive){
        this.isActive = isActive;
        return this;
    }
    public Builder setTotalOpportunityAcount(Integer totalOpportunityAmount){
        this.totalOpportunityAmount = totalOpportunityAmount;
        return this;
    }

    // This is to hide the builder name
    public Account createAccount(){
        return new Account(this);
    }
}
