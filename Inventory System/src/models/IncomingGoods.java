package models;

public class IncomingGoods {

    private int id;
    private String date;
    private Supplier supplier;
    private Item item;
    private int quantity;

    public IncomingGoods(int id,
                         String date,
                         Supplier supplier,
                         Item item,
                         int quantity) {

        this.id = id;
        this.date = date;
        this.supplier = supplier;
        this.item = item;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
