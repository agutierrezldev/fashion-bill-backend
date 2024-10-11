package com.agutierrezl.product_service.controller;

import com.agutierrezl.product_service.dto.ProductDTO;
import com.agutierrezl.product_service.service.IProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    @GetMapping("")
    public ResponseEntity<List<ProductDTO>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping("")
    public ResponseEntity<ProductDTO> save(@Valid @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.save(productDTO));
    }
}
