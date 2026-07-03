package service;

import java.util.ArrayList;

import models.IncomingGoods;
import models.Item;
import models.OutgoingGoods;
import models.Supplier;
import models.User;

public class ReportService {

    private ItemService itemService;
    private SupplierService supplierService;
    private UserService userService;
    private IncomingGoodsService incomingGoodsService;
    private OutgoingGoodsService outgoingGoodsService;

    public ReportService(
            ItemService itemService,
            SupplierService supplierService,
            UserService userService,
            IncomingGoodsService incomingGoodsService,
            OutgoingGoodsService outgoingGoodsService) {

        this.itemService = itemService;
        this.supplierService = supplierService;
        this.userService = userService;
        this.incomingGoodsService = incomingGoodsService;
        this.outgoingGoodsService = outgoingGoodsService;
    }

    public ArrayList<Item> getItemReport() {
        return itemService.getAllItem();
    }

    public ArrayList<Supplier> getSupplierReport() {
        return supplierService.getAllSuppliers();
    }

    public ArrayList<User> getUserReport() {
        return userService.getAllUsers();
    }

    public ArrayList<IncomingGoods> getIncomingGoodsReport() {
        return incomingGoodsService.getAllIncomingGoods();
    }

    public ArrayList<OutgoingGoods> getOutgoingGoodsReport() {
        return outgoingGoodsService.getAllOutgoingGoods();
    }
}