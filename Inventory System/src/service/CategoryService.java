package service;

import java.util.ArrayList;
import models.Category;
import repository.CategoryRepository;

public class CategoryService{
    
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository  categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public void addCategory(Category category){
        categoryRepository.save(category);
    }

   public ArrayList<Category> getAllCategory() {
    return categoryRepository.findAll();
}
    



}