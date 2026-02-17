public abstract class User {

    protected String username;
    protected int userID;

    public User(String username, int userID) {
        this.username = username;
        this.userID = userID;
    }

    public abstract void manageService(Service s);

    public abstract void useService(Service s);
}