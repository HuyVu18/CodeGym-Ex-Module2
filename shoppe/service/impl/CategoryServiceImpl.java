package shoppe.service.impl;

import shoppe.entity.Category;
import shoppe.service.CategoryService;
import java.util.ArrayList;

public class CategoryServiceImpl implements CategoryService {
    private ArrayList<Category> categoris = new ArrayList<>();

    @Override
    public void add() {
        categoris.add(new Category("1", "Men fashion", "img1"));
        categoris.add(new Category("2", "Women fashion", "img2"));
        categoris.add(new Category("3", "Baby fashion", "img3"));

    }

    @Override
    public void getAll() {
        for (Category element : categoris) {
            System.out.println(element);
        }
    }


}
