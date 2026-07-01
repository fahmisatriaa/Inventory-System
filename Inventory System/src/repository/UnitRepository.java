package repository;

import java.util.ArrayList;
import models.Unit;

public class UnitRepository implements IRepository<Unit> {
   
    private ArrayList<Unit> units = new ArrayList<>();

    @Override
    public void save(Unit unit) {
        units.add(unit);
    }

    @Override
    public ArrayList<Unit> findAll() {
        return units;
    }


}
