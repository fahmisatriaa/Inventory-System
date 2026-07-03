package service;

import java.util.ArrayList;

import models.IncomingGoods;
import models.Item;
import repository.IncomingGoodsRepository;

public class IncomingGoodsService {

    private IncomingGoodsRepository incomingGoodsRepository;

    public IncomingGoodsService(IncomingGoodsRepository incomingGoodsRepository) {
        this.incomingGoodsRepository = incomingGoodsRepository;
    }

    public void addIncomingGoods(IncomingGoods incomingGoods) {

        Item item = incomingGoods.getItem();

        
        item.setStock(item.getStock() + incomingGoods.getQuantity());

        
        incomingGoodsRepository.save(incomingGoods);
    }

    public ArrayList<IncomingGoods> getAllIncomingGoods() {
        return incomingGoodsRepository.findAll();
    }

}