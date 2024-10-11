package com.agutierrezl.product_service.repository;

import com.agutierrezl.product_service.entity.SizeEntity;
import org.springframework.data.repository.CrudRepository;

public interface ISizeRepository extends CrudRepository<SizeEntity,String> {
}
