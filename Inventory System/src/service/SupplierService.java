package service;

import java.util.ArrayList;
import models.Supplier;
import repository.SupplierRepository;


public class SupplierService {

    private SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository){
        this.supplierRepository = supplierRepository;
    }

    public void addSupplier(Supplier supplier){
        supplierRepository.save(supplier);
    }
      
    public ArrayList<Supplier> getallSuppliers(){
        return supplierRepository.findAll();
    }

}
