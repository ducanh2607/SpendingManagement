package model;

public class User {
    private Long id;
    private String name;

    private String username;
    private String password;
    private boolean role;
    private double  wallet;
    private boolean share;
    private boolean status;

    public User() {
    }

    public User(Long id, String name, String username, String password, double wallet, boolean share, boolean status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.wallet = wallet;
        this.share = share;
        this.status = status;
    }

    public User(Long id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public User(String name, String username, String password){
        this.name = name;
//        true is admin
        this.username = username;
        this.password = password;
        this.role = false;
        this.wallet = 0;
        this.share = false;
        this.status = false;
//      true is lock
    }
    public User(String username, String password){

        this.role = false;
//        true is admin
        this.username = username;
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

    public String getUsername() {
        return username;
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

    public void setUserName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String username, String password, boolean role, double wallet, boolean share, boolean status) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.wallet = wallet;
        this.share = share;
        this.status = status;
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
