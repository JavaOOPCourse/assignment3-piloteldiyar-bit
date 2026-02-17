public class Customer extends User {

    public Customer(String username, int userID) {
        super(username, userID);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Customers cannot manage services.");
    }

    @Override
    public void useService(Service s) {
        System.out.println("Customer " + username + " is using " + s.getServiceName() + "...");
        s.performService();
    }
}