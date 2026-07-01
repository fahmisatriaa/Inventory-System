package controller;

import java.util.ArrayList;

import models.Item;
import service.ItemService;

public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    public void tambahItem(Item item) {
        itemService.tambahItem(item);
    }

    public ArrayList<Item> getAllItem() {
        return itemService.getAllItem();
    }
}