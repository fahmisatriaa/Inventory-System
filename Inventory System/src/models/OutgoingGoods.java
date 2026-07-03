package models;

public class OutgoingGoods {

    private int id;
    private Item item;
    private User user;
    private int quantity;
    private String date;

    public OutgoingGoods(int id, Item item, User user, int quantity, String date) {
        this.id = id;
        this.item = item;
        this.user = user;
        this.quantity = quantity;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(String date) {
        this.date = date;
    }

}