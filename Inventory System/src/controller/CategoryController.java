package controller;

import java.util.ArrayList;

import models.Category;
import service.CategoryService;

public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public void addCategory(Category category) {
        categoryService.addCategory(category);
    }

    public ArrayList<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

}