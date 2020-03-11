public class UserAccount {
    private String email;
    private String userName;
    private Post timeline[] = new Post[10];
    private Post posts[] = new Post[1000];
    private UserAccount followers[] = new UserAccount[1000];


    public void UserAccount(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
