package repository;

import java.util.ArrayList;
import models.Supplier;

public class SupplierRepository implements IRepository<Supplier> {
    
    private ArrayList<Supplier> suppliers = new ArrayList<>();

    @Override
    public void save(Supplier supplier) {
        suppliers.add(supplier);
    }

    @Override
    public ArrayList<Supplier> findAll() {
        return suppliers;
    }
}
