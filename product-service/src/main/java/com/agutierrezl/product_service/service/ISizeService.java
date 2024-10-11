package com.agutierrezl.product_service.service;

import com.agutierrezl.product_service.dto.SizeDTO;

import java.util.List;

public interface ISizeService {

    List<SizeDTO> getAll();

    SizeDTO save(SizeDTO sizeDTO);
}
