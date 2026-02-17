public class ConsultationService extends Service implements Billable {

    public ConsultationService(String serviceName, int serviceID) {
        super(serviceName, serviceID);
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Connecting with a consultant...");
        } else {
            System.out.println("Service " + getServiceName() + " is inactive.");
        }
    }

    @Override
    public void generateBill() {
        System.out.println("Billing for consultation hours...");
    }
}