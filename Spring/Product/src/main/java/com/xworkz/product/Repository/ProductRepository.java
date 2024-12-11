package com.xworkz.product.Repository;

import com.xworkz.product.dto.ProductDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {
    boolean save(ProductDTO productDTO);
}
