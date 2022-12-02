package model;

public class User {
    private Long id;
    private String name;
    private String userName;
    private String password;
    private boolean role;
    private double  wallet;
    private boolean share;
    private boolean status;

    public User() {

    }

    public User(Long id, String userName, String password){
        this.id = id;
        this.role = false;
//        true is admin
        this.userName = userName;
        this.password = password;
        this.share = false;
        this.status = false;
//      true is lock
    }
    public User(Long id, String name, String userName, String password){
        this.id = id;
        this.name = name;
        this.role = false;
//        true is admin
        this.userName = userName;
        this.password = password;
        this.share = false;
        this.status = false;
//      true is lock
    }
    public User(String userName, String password){

        this.role = false;
//        true is admin
        this.userName = userName;
        this.password = password;
        this.share = false;
        this.status = false;
//      true is lock
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRole() {
        return role;
    }

    public double getWallet() {
        return wallet;
    }

    public boolean isShare() {
        return share;
    }

    public boolean isStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
