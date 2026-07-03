package repository;

import java.util.ArrayList;
import models.OutgoingGoods;

public class OutgoingGoodsRepository implements IRepository<OutgoingGoods>{

    private ArrayList<OutgoingGoods> outgoingGoods = new ArrayList<>();

    @Override
    public void save(OutgoingGoods data){
        this.outgoingGoods.add(data);
    }

     @Override
    public ArrayList<OutgoingGoods> findAll() {
        return outgoingGoods;
    }

}