package com.agutierrezl.product_service.service;

import com.agutierrezl.product_service.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    List<ProductDTO> getAll();

    ProductDTO save(ProductDTO productDTO);
}
