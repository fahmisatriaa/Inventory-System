package controller;

import java.util.ArrayList;
import models.Unit;
import service.UnitService;

public class UnitController {
    private UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    public void addUnit(Unit unit) {
        unitService.addUnit(unit);
    }

    public ArrayList<Unit> getAllUnits() {
        return unitService.getAllUnits();
    }
}
