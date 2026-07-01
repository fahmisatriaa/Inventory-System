package repository;

import java.util.ArrayList;

import models.Item;

public class ItemRepository implements IRepository<Item> {

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public void save(Item item) {
        items.add(item);
    }

    @Override
    public ArrayList<Item> findAll() {
        return items;
    }

}