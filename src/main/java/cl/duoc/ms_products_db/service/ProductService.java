package cl.duoc.ms_products_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_products_db.model.entities.Product;
import cl.duoc.ms_products_db.model.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> selectAllProducts(){
        List<Product> listProducts = productRepository.findAll();
        return listProducts;
    
    }
}
