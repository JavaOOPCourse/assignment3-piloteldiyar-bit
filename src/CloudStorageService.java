public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean isPremium;

    public CloudStorageService(String serviceName, int serviceID) {
        super(serviceName, serviceID);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Storing data securely...");
            if (isPremium) {
                System.out.println("High-speed transfer enabled.");
            }
        } else {
            System.out.println("Service " + getServiceName() + " is inactive.");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("Increasing storage capacity...");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for storage usage...");
    }
}