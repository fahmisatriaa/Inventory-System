package service;

import java.util.ArrayList;

import models.Item;
import repository.ItemRepository;

public class ItemService {

    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void tambahItem(Item item) {
        itemRepository.save(item);
    }

    public ArrayList<Item> getAllItem() {
        return itemRepository.findAll();
    }
}
