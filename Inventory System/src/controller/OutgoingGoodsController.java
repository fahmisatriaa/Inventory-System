package controller;

import java.util.ArrayList;

import  models.OutgoingGoods;
import service.OutgoingGoodsService;    

public class OutgoingGoodsController {
    private OutgoingGoodsService outgoingGoodsService;

    public OutgoingGoodsController(OutgoingGoodsService service) {
        this.outgoingGoodsService = service;
    }

    public boolean addOutgoingGoods(OutgoingGoods outgoingGoods) {
        return outgoingGoodsService.addOutgoingGoods(outgoingGoods);
    }

    public ArrayList<OutgoingGoods> getAllOutgoingGoods() {
        return outgoingGoodsService.getAllOutgoingGoods();
    }
    
}
