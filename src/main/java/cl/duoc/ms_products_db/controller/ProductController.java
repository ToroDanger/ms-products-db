package cl.duoc.ms_products_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_products_db.model.entities.Product;
import cl.duoc.ms_products_db.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> selectAllProducts(){
        return productService.selectAllProducts();
    }
    //aca van las apis 
}
