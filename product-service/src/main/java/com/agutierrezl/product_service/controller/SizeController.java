package com.agutierrezl.product_service.controller;

import com.agutierrezl.product_service.dto.SizeDTO;
import com.agutierrezl.product_service.service.ISizeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sizes")
public class SizeController {

    private final ISizeService sizeService;

    @GetMapping("")
    public ResponseEntity<List<SizeDTO>> getAll() {
        return ResponseEntity.ok(sizeService.getAll());
    }

    @PostMapping("")
    public ResponseEntity<SizeDTO> save(@Valid @RequestBody SizeDTO sizeDTO) {
        return ResponseEntity.ok(sizeService.save(sizeDTO));
    }
}
