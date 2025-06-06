package BuilderDesignPattern.version1;

public class Account {
    String name;
    String industry;
    String rating;
    boolean isActive;
    Integer totalOpportunityAmount;

    public Account(Builder builder1) {
        if(builder1.name == null || builder1.name == ""){
            throw new IllegalArgumentException("Account name cannot be empty");
        }else {
            this.name = builder1.name;
        }
        this.industry = builder1.industry;
        // Set up the default value
        if(builder1.rating != null){
            this.rating = builder1.rating;
        }else{
            this.rating = "1";
        }
        this.isActive = builder1.isActive;
        this.totalOpportunityAmount = builder1.totalOpportunityAmount;

        // This code is to return the correct builder

    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
