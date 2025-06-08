package BuilderDesignAssinment;

public class messagingService {
    String messageType;
    boolean isDelivered;
    long timeStamp;
    String content;
    String sender;
    String receiver;

    // Create private constructor

    private messagingService(messagingServiceBuilder builder) {
        this.messageType = builder.messageType;
        this.isDelivered = builder.isDelivered;
        this.timeStamp = builder.timeStamp;
        this.content = builder.content;
        this.sender = builder.sender;
        this.receiver = builder.receiver;

    }

    public static messagingServiceBuilder getBuilder() {
        return new messagingServiceBuilder();
    }

    // Create the inner class with which will be static

    public static class messagingServiceBuilder{
        private String messageType;
        private boolean isDelivered;
        private long timeStamp;
        private String content;
        private String sender;
        private String receiver;

        public messagingServiceBuilder setMessageType(String messageType){
            this.messageType = messageType;
            return this;

        }

        public messagingServiceBuilder setIsDeliverd(boolean isDelivered){
            this.isDelivered = isDelivered;
            return this;
        }

        public messagingServiceBuilder setTimeStamp(long timeStamp){
            this.timeStamp = timeStamp;
            return this;
        }

        public messagingServiceBuilder setContent(String content){
            this.content = content;
            return this;
        }
        public messagingServiceBuilder setSender(String sender){
            this.sender = sender;
            return this;
        }
        public messagingServiceBuilder setReceiver(String receiver){
            this.receiver = receiver;
            return this;
        }

        // Create build method

        public messagingService build(){
            return new messagingService(this);
        }
    }
}
