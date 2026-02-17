public abstract class Service {

    protected String serviceName;
    protected int serviceID;
    protected boolean isActive;


    public Service(String serviceName, int serviceID) {
        this.serviceName = serviceName;
        this.serviceID = serviceID;
        this.isActive = false; // Default state
    }

    public void activateService() {
        this.isActive = true;
        System.out.println(serviceName + " is now ACTIVE.");
    }

    public void deactivateService() {
        this.isActive = false;
        System.out.println(serviceName + " is now INACTIVE.");
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public abstract void performService();
}