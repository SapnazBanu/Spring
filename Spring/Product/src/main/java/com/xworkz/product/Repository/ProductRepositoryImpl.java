package com.xworkz.product.Repository;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

    @Autowired
    private  ProductRepository productRepository;

    @Override
    public boolean save(ProductDTO productDTO) {
        System.out.println("running save in ProductRepository");
        System.err.println("Should connect to DB");
        return true;
    }
}
