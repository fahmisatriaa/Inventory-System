package service;

import java.util.ArrayList; 
import models.Unit;
import repository.UnitRepository;

public class UnitService {
    private UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public void addUnit(Unit unit) {
        unitRepository.save(unit);
    }

    public ArrayList<Unit> getAllUnits() {
        return unitRepository.findAll();
    }
}
