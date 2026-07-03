package repository;

import java.util.ArrayList;
import models.IncomingGoods;

public class IncomingGoodsRepository implements IRepository<IncomingGoods> {

    private ArrayList<IncomingGoods> incomingGoods = new ArrayList<>();

    @Override
    public void save(IncomingGoods data) {
        incomingGoods.add(data);
    }

    @Override
    public ArrayList<IncomingGoods> findAll() {
        return incomingGoods;
    }

}
