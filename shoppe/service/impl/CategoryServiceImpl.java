package shoppe.service.impl;

import shoppe.entity.Category;
import shoppe.service.CategoryService;
import java.util.ArrayList;

public class CategoryServiceImpl implements CategoryService {
    private static ArrayList<Category> categories = new ArrayList<>();

    public static void add() {
        categories.add(new Category("1", "Men fashion", "img1"));
        categories.add(new Category("2", "Women fashion", "img2"));
        categories.add(new Category("3", "Baby fashion", "img3"));
    }

    public static void getAll() {
        for (Category element : categories) {
            System.out.println(element);
        }
    }

    public static ArrayList<Category> getCategories() {
        return categories;
    }

    public static void setCategories(ArrayList<Category> categories) {
        CategoryServiceImpl.categories = categories;
    }
}
