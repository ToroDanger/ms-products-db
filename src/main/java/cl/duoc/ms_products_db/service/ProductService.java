package cl.duoc.ms_products_db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_products_db.model.entities.Product;
import cl.duoc.ms_products_db.model.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    //get
    public List<Product> selectAllProducts(){
        List<Product> listProducts = productRepository.findAll();
        return listProducts;
    }
    //post
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    //delete
    public boolean deleteProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            productRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
    //put
    public boolean updateProduct(Long id, Product updatedProduct) {
    Optional<Product> existingProductOpt = productRepository.findById(id);

    if (existingProductOpt.isPresent()) {
        Product existingProduct = existingProductOpt.get();
        
        // Actualizar los campos del producto
        existingProduct.setName_product(updatedProduct.getName_product());
        existingProduct.setQuantity(updatedProduct.getQuantity());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setDescription(updatedProduct.getDescription());
        
        // Guardar el producto actualizado en la base de datos
        productRepository.save(existingProduct);
        return true;
    } else {
        return false;
    }
}

    
}
