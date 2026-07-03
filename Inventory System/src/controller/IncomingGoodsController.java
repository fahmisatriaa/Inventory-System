package controller;

import java.util.ArrayList;

import models.IncomingGoods;
import service.IncomingGoodsService;

public class IncomingGoodsController {

    private IncomingGoodsService incomingGoodsService;

    public IncomingGoodsController(IncomingGoodsService incomingGoodsService) {
        this.incomingGoodsService = incomingGoodsService;
    }

    public void addIncomingGoods(IncomingGoods incomingGoods) {
        incomingGoodsService.addIncomingGoods(incomingGoods);
    }

    public ArrayList<IncomingGoods> getAllIncomingGoods() {
        return incomingGoodsService.getAllIncomingGoods();
    }

}