public class StreamingService extends Service implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String serviceName, int serviceID) {
        super(serviceName, serviceID);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Streaming video content...");
            if (isPremium) {
                System.out.println("Playing in 4K resolution.");
            }
        } else {
            System.out.println("Service " + getServiceName() + " is inactive.");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("Upgrading to 4K resolution...");
    }
}