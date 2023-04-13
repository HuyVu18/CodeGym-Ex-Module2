package shoppe;

import shoppe.service.CategoryService;
import shoppe.service.impl.CategoryServiceImpl;
import shoppe.service.impl.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryServiceImpl();
        categoryService.add();
        categoryService.getAll();
        System.out.println();

        CategoryService productService = new ProductServiceImpl();
        productService.add();
        productService.getAll();
    }
}
