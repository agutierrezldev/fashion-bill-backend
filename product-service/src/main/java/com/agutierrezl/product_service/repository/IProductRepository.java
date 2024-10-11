package com.agutierrezl.product_service.repository;

import com.agutierrezl.product_service.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<ProductEntity,String> {
}
