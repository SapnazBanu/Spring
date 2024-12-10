package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
        public boolean validSave(ProductDTO dto)
        {
            return true;
        }
}


