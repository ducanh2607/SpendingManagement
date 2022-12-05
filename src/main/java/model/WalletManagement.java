package model;

import java.time.LocalDate;

public class WalletManagement {
    private Long id;
    private LocalDate date;
    private boolean type;
//    false is income, true is spending
    private Double money;
    private String notes;
    private User user;
    private Category category;

    public WalletManagement(Long id, Boolean type, Double money, String notes, Long user, Long category) {
        this.user = new User();
        this.category = new Category();
    }
    public  WalletManagement(Long id, LocalDate date, boolean type, Double money, String notes){
        this.id = id;
        user = new User();
        category = new Category();
        this.date = date;
        this.type = type;
        this.money = money;
        this.notes = notes;
    }

    public WalletManagement(boolean type, Double money, String notes, User user, Category category) {
        this.date = LocalDate.now();
        this.type = type;
        this.money = money;
        this.notes = notes;
        this.user = user;
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
