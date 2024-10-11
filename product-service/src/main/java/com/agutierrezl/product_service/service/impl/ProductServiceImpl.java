package com.agutierrezl.product_service.service.impl;

import com.agutierrezl.product_service.config.MapperConfig;
import com.agutierrezl.product_service.dto.ProductDTO;
import com.agutierrezl.product_service.entity.ProductEntity;
import com.agutierrezl.product_service.entity.SizeEntity;
import com.agutierrezl.product_service.repository.IProductRepository;
import com.agutierrezl.product_service.repository.ISizeRepository;
import com.agutierrezl.product_service.service.IProductService;
import com.agutierrezl.product_service.service.ISizeService;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ModelMapper modelMapper;
    private final IProductRepository productRepository;

    private final ISizeRepository sizeRepository;
    private final SizeServiceImpl sizeService;

    @Override
    public List<ProductDTO> getAll() {
        List<ProductEntity> products = (List<ProductEntity>) productRepository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {

        SizeEntity size = sizeRepository.findById(productDTO.getSize().getId()).orElse(null);
        if (size != null) {
            productDTO.setSize(sizeService.convertToDTO(size));
            ProductEntity product = productRepository.save(convertToEntity(productDTO));
            return convertToDTO(product);
        }
        return null;

    }

    public ProductDTO convertToDTO(ProductEntity productEntity) {
        return modelMapper.map(productEntity, ProductDTO.class);
    }

    public ProductEntity convertToEntity(ProductDTO productDTO) {
        return modelMapper.map(productDTO, ProductEntity.class);
    }
}
