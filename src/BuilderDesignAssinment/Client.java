package BuilderDesignAssinment;

public class Client {
    public static void main(String[] args) {

        messagingService messagingServiceRef = messagingService.getBuilder()
                .setIsDeliverd(true)
                .build();
    }
}
