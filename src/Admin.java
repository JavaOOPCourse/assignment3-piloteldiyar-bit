public class Admin extends User {

    public Admin(String username, int userID) {
        super(username, userID);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin " + username + " is managing " + s.getServiceName() + "...");
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin executing test on " + s.getServiceName() + "...");
        s.performService();
    }
}