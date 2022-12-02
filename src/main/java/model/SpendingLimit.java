package model;

import java.time.LocalDate;

public class SpendingLimit {

    private User user;
    private Long id;
    private LocalDate dateCreate;
    private LocalDate dateActive;
    private Double money;
    public SpendingLimit(){
        user = new User();
    }
    public SpendingLimit(Long id, LocalDate dateCreate, LocalDate dateActive, Double money){
        this. id = id;
        user = new User();
        this.dateCreate = dateCreate;
        this.dateActive = dateActive;
        this.money = money;

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDate getDateActive() {
        return dateActive;
    }

    public void setDateActive(LocalDate dateActive) {
        this.dateActive = dateActive;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Long getId() {
        return id;
    }
}
