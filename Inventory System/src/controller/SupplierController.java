package controller;

import java.util.ArrayList;
import models.Supplier;
import service.SupplierService;
public class SupplierController {
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService){
        this.supplierService = supplierService;
    }

    public void addSupplier(Supplier supplier){
        supplierService.addSupplier(supplier);
    }

    public ArrayList<Supplier> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }
}