package BuilderDesignPattern.version1;

public class opportunity {
    Integer amount;
    boolean hasQuote;
    String stageName;

    // Step 3 : Create the constructor which will accept the builder object referance as the argument.
    // This constructomr should be private so that we can restrict the mutablity.

    public opportunity(opportunityBuilder opportunityBuilderRef){
        this.amount = opportunityBuilderRef.amount;
        if(this.amount < 10000){
            throw new IllegalArgumentException("amount must be greater than 10000");
        }
        this.hasQuote = opportunityBuilderRef.hasQuote;
        this.stageName = opportunityBuilderRef.stageName;
    }

    // Step 4 : Create the getBuilder to dynamically fetch the builder
    public static opportunityBuilder getBuilder(){
        return new opportunityBuilder();
    }

    // Step 1 create the inner class and set the values to attribute

    public static class opportunityBuilder{
        Integer amount;
        boolean hasQuote;
        String stageName;

        public opportunityBuilder setAmount(Integer amount){
            this.amount = amount;
            return this;
        }

        public opportunityBuilder setHasQuote(boolean hasQuote){
            this.hasQuote = hasQuote;
            return this;
        }

        public opportunityBuilder setStageName(String stageName){
            this.stageName = stageName;
            return this;
        }

        // Step 2 : Create the build method with main class type, which will create the main class object and
        // pass the builder values.
        // We can have the validation that we need to impose here as we have the hold of the builder object.

        public opportunity build(){
            return new opportunity(this);
        }

    }
}
