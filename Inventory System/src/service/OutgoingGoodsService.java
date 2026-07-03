package service;

import java.util.ArrayList;

import models.OutgoingGoods;
import repository.OutgoingGoodsRepository;

public class OutgoingGoodsService {

    private OutgoingGoodsRepository outgoingGoodsRepository;

    public OutgoingGoodsService(OutgoingGoodsRepository repository) {
        this.outgoingGoodsRepository = repository;
    }

    public boolean addOutgoingGoods(OutgoingGoods outgoingGoods) {

        if (outgoingGoods.getItem().getStock() < outgoingGoods.getQuantity()) {
            return false;
        }

        outgoingGoods.getItem().setStock(
                outgoingGoods.getItem().getStock() - outgoingGoods.getQuantity());

        outgoingGoodsRepository.save(outgoingGoods);

        return true;
    }

    public ArrayList<OutgoingGoods> getAllOutgoingGoods() {
        return outgoingGoodsRepository.findAll();
    }
}