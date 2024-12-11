package com.xworkz.product.service;

import com.xworkz.product.Repository.ProductRepository;
import com.xworkz.product.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public boolean validSave(ProductDTO productDTO) {
        System.out.println("running validSave in ProductServiceImpl");
        boolean saved=this.productRepository.save(productDTO);
        System.out.println("saved from DB :"+saved );
        return saved;
    }
}


