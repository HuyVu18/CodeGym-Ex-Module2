package shoppe;

import shoppe.entity.Category;
import shoppe.service.CategoryService;
import shoppe.service.impl.CategoryServiceImpl;
import shoppe.service.impl.ProductServiceImpl;

public class Main {
    public static CategoryServiceImpl listCategory = new CategoryServiceImpl();
    public static ProductServiceImpl listProduct = new ProductServiceImpl();

    public static void main(String[] args) {
        listCategory.add();
        listCategory.getAll();
        System.out.println();

//        CategoryServiceImpl.getCategories().add(new Category("1", "Men fashion", "img1"));

        listProduct.add();
        listProduct.getAll();
    }
}
