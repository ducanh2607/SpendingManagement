package model;

public class Category {
    private Long id;
    private WalletManagement walletManagement;
    private String name;

    public Category() {
        walletManagement = new WalletManagement();

    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
        walletManagement = new WalletManagement();
    }

    public Long getId() {
        return id;
    }

    public WalletManagement getWalletManagement() {
        return walletManagement;
    }

    public String getName() {
        return name;
    }

    public void setWalletManagement(WalletManagement walletManagement) {
        this.walletManagement = walletManagement;
    }

    public void setName(String name) {
        this.name = name;
    }
}
