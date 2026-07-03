package controller;

import java.util.ArrayList;

import models.IncomingGoods;
import models.Item;
import models.OutgoingGoods;
import models.Supplier;
import models.User;
import service.ReportService;

public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    public ArrayList<Item> getItemReport() {
        return reportService.getItemReport();
    }

    public ArrayList<Supplier> getSupplierReport() {
        return reportService.getSupplierReport();
    }

    public ArrayList<User> getUserReport() {
        return reportService.getUserReport();
    }

    public ArrayList<IncomingGoods> getIncomingGoodsReport() {
        return reportService.getIncomingGoodsReport();
    }

    public ArrayList<OutgoingGoods> getOutgoingGoodsReport() {
        return reportService.getOutgoingGoodsReport();
    }

}