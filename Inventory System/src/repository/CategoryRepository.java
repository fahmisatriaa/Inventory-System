package repository;

import java.util.ArrayList;
import models.Category;

public class CategoryRepository implements IRepository<Category> {
    
    private ArrayList<Category> categories;

    public CategoryRepository(){
        categories = new ArrayList<>();
    }

    @Override
    public void save(Category category){
    categories.add(category);
    }

    @Override
    public ArrayList<Category> findAll(){
        return categories;
    }
}
