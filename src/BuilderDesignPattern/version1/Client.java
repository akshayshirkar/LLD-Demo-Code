package BuilderDesignPattern.version1;

public class Client {
    public static void main(String[] args) {
//        Builder b1 = new Builder();
//        b1.setName("");
//        b1.setIndustry("IT");
//
//        Account acc = new Account(b1);

         // Get the Builder
//         Builder b1 = Account.getBuilder();
//         b1.setName("");
//
//         // Create the Account Object After setting the values for builder
//         Account acc1 = new Account(b1);

         // In below code we use the stream terminology

        opportunity oppRef = opportunity.getBuilder()
                .setAmount(100)
                .setHasQuote(true)
                .setStageName("New")
                .build();


    }
}
