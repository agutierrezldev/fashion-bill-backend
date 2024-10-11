package com.agutierrezl.product_service.service.impl;


import com.agutierrezl.product_service.dto.SizeDTO;
import com.agutierrezl.product_service.entity.SizeEntity;
import com.agutierrezl.product_service.repository.ISizeRepository;
import com.agutierrezl.product_service.service.ISizeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SizeServiceImpl implements ISizeService {

    private final ModelMapper modelMapper;
    private final ISizeRepository sizeRepository;

    @Override
    public List<SizeDTO> getAll() {
        List<SizeEntity> sizes = (List<SizeEntity>) sizeRepository.findAll();
        return sizes.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SizeDTO save(SizeDTO SizeDTO) {
        SizeEntity size = sizeRepository.save(convertToEntity(SizeDTO));
        return convertToDTO(size);
    }

    public SizeDTO convertToDTO(SizeEntity sizeEntity) {
        return modelMapper.map(sizeEntity, SizeDTO.class);
    }

    public SizeEntity convertToEntity(SizeDTO sizeDTO) {
        return modelMapper.map(sizeDTO, SizeEntity.class);
    }
}
