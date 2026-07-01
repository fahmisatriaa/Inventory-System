package models;

public class Item {

    private int id;
    private String itemName;
    private int stock;
    private double purchasePrice;
    private double sellingPrice;
    private Category category;
    private Unit unit;

    public Item(int id, String itemName, int stock,
                double purchasePrice, double sellingPrice,
                Category category, Unit unit) {

        this.id = id;
        this.itemName = itemName;
        this.stock = stock;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.category = category;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public int getStock() {
        return stock;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public Category getCategory() {
        return category;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}